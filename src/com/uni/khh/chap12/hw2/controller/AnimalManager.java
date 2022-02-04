package com.uni.khh.chap12.hw2.controller;

import com.uni.khh.chap12.hw2.model.vo.Animal;
import com.uni.khh.chap12.hw2.model.vo.Cat;
import com.uni.khh.chap12.hw2.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {

		// Animal 타입의 객체배열 크기 5로 생성
		// 각 인덱스에 무작위로 Dog객체 또는 Cat객체로 생성
		// (이때, 매개변수 생성자를 이용하여 생성)
		
		Animal[] animal = new Animal[5];
		
		animal[0] = new Dog("호두", "장모치와와", 6);
		animal[1] = new Cat("체리", "뚱냥이", "집", "얼룩무늬");
		animal[2] = new Dog("루이", "비숑", 9);
		animal[3] = new Dog("유키", "말티즈", 3);
		animal[4] = new Cat("나비", "페르시안", "야외", "하얀색");
		
		for(Animal a : animal) {
			a.speak();
		}
	}

}
