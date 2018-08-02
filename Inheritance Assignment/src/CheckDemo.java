//to check the Check class
public class CheckDemo {

	public static void main(String[] args) {
		
		Check check = new Check();
		
		// directly we can access only public and protected instance members of a class
		check.protecteD = 12;
		check.publiC = 13;
		
		//to access a private member of a class we have to call the setter function of the class
		check.setPrivatE(14);
		System.out.println(check.protecteD);
		System.out.println(check.publiC);
		System.out.println(check.getPrivatE());
		
		//to display the values of the instance members of the class
		check.disp();
		

	}

}
