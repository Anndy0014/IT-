package Chap03.array;

public class ArrayBasic {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] arrInt = { 30, 31, 32 };
		System.out.println(arrInt[arrInt.length - 1]);
		System.out.println(arrInt.length);
		System.out.println(arrInt[0]);

		for (int n : arrInt) {
			System.out.println(n);
		}
	}

}
