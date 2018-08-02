class Parent {
	private int i;
	
	//C'tor without arguments
	public Parent() {
		System.out.println("Parent created");
	}
	
	//C'tor with argument
	public Parent(int i) {
		this.i = i;
	}
	
	//method to display the value
	public void disp() {
		System.out.println(i);
	}
	
}

//Child class inherits Parent class
class Child extends Parent {
	 private int j;
	 
	//C'tor without argument
	public Child() {
		System.out.println("Child created");
	}
	
	//C'tor with argument
	public Child(int i, int j) {
		super(i);
		this.j = j;
	}
	
	public void disp() {
		super.disp();
		System.out.println(j);
	}
}


public class SingleLevel {
	
	public static void main(String args[]) {
		
		Child boy = new Child();
		Child girl = new Child(12, 21);
		Parent child = new Child(); //upcasting
		
		child.disp();
		girl.disp();
		boy.disp();
	}

}
