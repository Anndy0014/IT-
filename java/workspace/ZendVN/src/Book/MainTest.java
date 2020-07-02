package Book;

import java.util.Scanner;

public class MainTest {
	BookTest BOOKobj = null;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int functionID = sc.nextInt();
		boolean flag = true;
		do {
			showMenu();
			switch (functionID) {
			case 1:
				addBook();
			case 2:
				editBook();
			case 3:
				infoBook();
			case 4:
			default:
				flag = false;
				break;
			}

		} while (flag = true);
		sc.close();
	}

	public static void addBook() {
		Scanner sc = new Scanner(System.in);
		String bookID = "";
		String bookName = "";
		double bookPrice = 0;

	}

	public static void editBook() {

	}

	public static void infoBook() {

	}

	public static void showMenu() {
		System.out.println("=====BOOK MANAGER====");
		System.out.println("1:addBook");
		System.out.println("2:editBook");
		System.out.println("3:infoBook");
		System.out.println("4:Exit");
	}

}
