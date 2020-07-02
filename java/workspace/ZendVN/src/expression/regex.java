package expression;

import java.util.Scanner;

public class regex {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		regex();
		System.out.println("hello");
	}

	public static void regex() {
		String str = "java-is-very-easy";
		Scanner sc = new Scanner(str);
		sc.useDelimiter("-");
		while (sc.hasNext(str)) {
			String token = sc.next();
			System.out.println(token);
		}
		sc.close();
	}
}
