
public class Children extends Parents {
	
	private int j;
	
	public Children(int i, int j) {
		super(i);
		this.j = j;
	}
	
	public void display() {
		System.out.println(j);
	}

}
