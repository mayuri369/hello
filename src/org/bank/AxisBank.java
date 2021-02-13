package org.bank;
//deposit()
public class AxisBank extends BankInfo{
	
public void saving() {
	System.out.println("saving is 5%");
}
public void deposit(){
	
	System.out.println("deposit is 5%");
}
@Override
public void branchDetails() {
	// TODO Auto-generated method stub
	
}
private void fixed() {
	System.out.println("fixed is 2%");
}
public static void main(String[] args) {
	AxisBank ab= new AxisBank();
	
	ab.saving();
	ab.deposit();
	ab.fixed();
	ab.branchDetails();
}
}
