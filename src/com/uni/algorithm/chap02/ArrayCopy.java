package com.uni.algorithm.chap02;

public class ArrayCopy {
	
	static void copy(int[] a, int[] b) {
		
		if(a.length != b.length) {
			System.out.println("두 배열의 길이가 다릅니다.");
		}
		
		for(int i=0; i<b.length; i++) {
			a[i] = b[i];
		}
		
		
	}
	
	static void rcopy(int[] a, int[] b) {
		int num = a.length <= b.length ? a.length:b.length;
		
		for(int i=0; i<num; i++) {
			a[i] = b[b.length - i -1 ];
		}
		
	}
	public static void main(String[] args) {
		
		int[] a = new int[5];
		
		int[] b = new int[5];
		for(int i=0; i<b.length; i++) {
			b[i] = i;
			System.out.print(b[i] + " ");
		}
		
		System.out.println();
		
		rcopy(a, b);
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
