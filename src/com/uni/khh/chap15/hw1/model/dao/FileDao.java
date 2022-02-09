package com.uni.khh.chap15.hw1.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDao {

	Scanner sc = new Scanner(System.in);

	public FileDao() {}

	public void fileSave() {
		StringBuilder sb = new StringBuilder();

		while (true) {
			System.out.print("파일에 저장할 내용을 반복해서 입력하시오(\"exit\"을 입력하면 내용 입력 끝) : ");

			String note = sc.nextLine();

			if (note.equals("exit")) {
				break;
			} else {
				sb.append(note + "\n");
			}

		}

		System.out.print("저장 하시겠습니까 ? (y/n)");
		char result = sc.nextLine().toUpperCase().charAt(0);

		if (result == 'Y') {

			System.out.print("저장할 파일명 입력 : ");
			String fName = sc.nextLine();

			// 여기서 미리 만들어 놔야 밑에서 close()가 가능하네
			BufferedWriter bw = null;

			try { // BufferedWriter와 FileWriter 스트림 사용
				 // “입력받은 파일명.txt” 파일에 해당 sb 데이터출력
				 // “입력받은 파일명.txt 파일에 성공적으로 저장하였습니다.” 콘솔창 출력

				bw = new BufferedWriter(new FileWriter(fName + ".txt", true));

				bw.append(sb + "\n");
				
				System.out.println("입력받은 " + fName + ".txt " + "파일에 성공적으로 저장하였습니다.");

			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (bw != null) {
					try {
						bw.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		} else {
			System.out.println("다시 메뉴로 돌아갑니다.");
			return;
		}
	}

	public void fileOpen() {
		// “열기 할 파일명 : “
		// 파일명을 Scanner로 입력 받아, BufferedReader와 FileReader 스트림 사용

		System.out.print("열기 할 파일명 : ");
		String fName = sc.nextLine();

		BufferedReader br = null;

		try {
			// try구문 안에서 readLine()메소드를 통해 한줄씩 콘솔로 입력받은 값 출력

			br = new BufferedReader(new FileReader(fName + ".txt"));

			String line;

			// readLine()는 더이상 읽을 내용이 없으면 null 리턴하므로 null이 아닐때까지만 반복문 실행
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (FileNotFoundException e) {
			System.out.println("존재하는 파일이 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void fileEdit() {

		// 파일명을 입력받아 BufferedReader와 BufferedWriter, FileReader와 FileWriter

		// 위에 두개 합쳐서 하려니 헷갈린다 짜증남 ㅡㅡ
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		StringBuilder sb = new StringBuilder();

		System.out.print("수정 할 파일명 : ");
		String fName = sc.nextLine();

		try {

			br = new BufferedReader(new FileReader(fName + ".txt"));
			
			// 반복문을 통해 해당 파일의 내용을 readLine()메소드를 통해 콘솔에 출력

			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			// “파일에 추가할 내용을 입력하시오 : “
			// 사용자가 “exit”을 입력하기 전까지 내용을 StringBuilder에 담기

			while (true) {
				System.out.print("파일에 추가할 내용을 입력하세요(\"exit\" 입력하면 종료) : ");
				String result = sc.nextLine();

				if (result.equals("exit")) {
					break;
				} else {
					sb.append(result + "\n");
				}
			}
				// “변경된 내용을 파일에 추가하시겠습니까? (y/n)”
				// 입력 받은 값이 대문자이든 소문자이든 상관없이 “y”이면,
				// “입력받은 파일명.txt 파일의의 내용이 변경되었습니다.”
			System.out.print("변경된 내용을 파일에 추가하시겠습니까? (y/n)");
			String answer = sc.nextLine();
			
			if(answer.equalsIgnoreCase("Y")) {
				// true를 뒤에 붙여줘서 이어 쓰여지게 해줌
				bw = new BufferedWriter(new FileWriter(fName + ".txt", true));
				
				bw.append(sb + "\n");

				System.out.println("입력받은 " + fName + ".txt의 내용이 변경되었습니다.");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
