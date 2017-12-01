package com.tutorialspoint;

public class SampleBean implements Sample{

	public int ding() {
		System.out.println("ding");
		return 1;
	}

	public int ding(int x) {
		System.out.println("ding");
		return 2;
	}

	public int dong() {

		System.out.println("dong");
		return 3;
	}

	public int dong(int x) {

		System.out.println("dong");
		return 4;
	}

}
