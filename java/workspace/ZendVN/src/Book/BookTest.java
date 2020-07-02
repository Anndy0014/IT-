package Book;

public class BookTest {
	public String ID;
	public String name;
	public double price;
	public int exit;

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getExit() {
		return exit;
	}

	public void setExit(int exit) {
		this.exit = exit;
	}

	public void showInfo() {
		System.out.println("book info");
		System.out.println("ID" + this.getID());
		System.out.println("Name" + this.getName());
		System.out.println("Price" + this.getPrice());
	}

}
