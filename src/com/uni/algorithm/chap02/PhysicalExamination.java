package com.uni.algorithm.chap02;

import java.util.Scanner;

public class PhysicalExamination {

	static final int VMAX = 21; // 시력 분포(0.0 ~ 0.1 단위로 21개)
	
	static class PhyscData{
		String name;
		int height;
		double vision;
		
		public PhyscData() {
			// TODO Auto-generated constructor stub
		}

		public PhyscData(String name, int height, double vision) {
			super();
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}
	
	// 키의 평균값을 구함
	static double aveHeight(PhyscData[] dat) {
		double sum = 0;
		
		for(int i=0; i<dat.length; i++) {
			sum += dat[i].height;
		}
		return sum / dat.length;
	}
	
	// 시력의 분포를 구함
	static void distVision(PhyscData[] dat, int[] dist) {
		int i=0;
		
		dist[i] = 0;
		for(i = 0; i < dat.length; i++) {
			if(dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0) {
				dist[(int)(dat[i].vision * 10)]++;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PhyscData[] x = {
				new PhyscData("박현규", 162, 0.3),
				new PhyscData("함진아", 181, 0.1),
				new PhyscData("김말똥", 168, 0.4),
				new PhyscData("이창수", 195, 0.7),
				new PhyscData("김채은", 132, 0.8),
				new PhyscData("박조은", 158, 0.7),
				new PhyscData("임지수", 168, 0.5)
		};
		int[] vdist = new int[VMAX]; // 시력분포
		
		System.out.println("%% 신체검사 리스트 %%");
		System.out.println("이름        키   시력");
		System.out.println("--------------------");
		for(int i=0; i<x.length; i++) {
			System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
		}
		System.out.printf("평균 키 : %5.1fcm\n", aveHeight(x));
		
		distVision(x, vdist); //시력 분포를 구함
		
		System.out.println("\n 시력 분포");
		for(int i=0; i < VMAX; i++) {
			System.out.printf("%3.1f~:", i / 10.0);
			for(int j=0; j<vdist[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
			
	}

}
