
public class HelloWorld {

	private String print;
	
	public HelloWorld (String print) {
		this.print = print;
	}
	
	public void printString() {
		System.out.println(print);
	}
	
	public String getPrint() {
		return print;
	}
	
	public void setPrint(String print) {
		this.print = print;
	}
}
