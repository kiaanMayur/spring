// a class to check the accessibility of the public, private, protected instance members
public class Check {
	public int publiC;
	private int privatE;
	protected int protecteD;
	
	//getter function of the field privatE
	public int getPrivatE() {
		return privatE;
	}

	//setter function of the field privatE
	public void setPrivatE(int privatE) {
		this.privatE = privatE;
	}

	// method to display the members of the class
	public void disp() {
		System.out.println(publiC + " " + privatE + " " + protecteD);
	}
}



