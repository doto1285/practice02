package prob2;

public class Goods {
	private String name;
	private int price;
	private int countStock;

	public Goods() {

	}

	public Goods(String name, int price, int countStock) {
		this.name = name;
		this.price = price;
		this.countStock = countStock;

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price < 0) {
			price = 0;
		}
		this.price = price;
	}

	public int getCountStock() {
		return countStock;
	}

	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}

	public void showInfo() {
		System.out.println(name + "(가격:" + price + ")이 " + countStock + "개 입고 되었습니다.");
	}

	@Override
	public String toString() {
		return name + "(가격:" + price + ")이 " + countStock + "개 입고 되었습니다.";
	}

}
