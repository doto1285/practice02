package prob5;

public class Sub extends Calc{
	@Override
	public void setValue(int a, int b) {
		this.calculate = a-b;
	}

}
