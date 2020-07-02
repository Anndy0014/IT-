package Chap02.oop;

public class Main {
	public static void main(String[] args) {
		int input = 4;
		int square = input * input;
		String star = "*";
		for (int i = 0; i < square; i++) {
			if (i % input == 0) {
				System.out.println();
			}
			System.out.print(star + " ");
		}
	}
}
