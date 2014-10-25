package in.blogspot.randomcompiler.state.pattern.demo;

import in.blogspot.randomcompiler.state.pattern.impl.ATM;

public class StatePatternDemo {

	public static void main(String[] args) {
		ATM atm = new ATM(100000L);
		
		atm.withdrawCash();
		
		atm.insertCard();
		
		atm.printAvailableCash();
		
		atm.fillCash(5000L);
		
		atm.printAvailableCash();
		
		atm.insertCard();
		
		atm.enterPin(123);
		
		atm.enterPin(1234);
		
		atm.enterAmount(501);
		
		atm.enterAmount(1000);
		
		atm.withdrawCash();
		
		atm.printAvailableCash();
		
		atm.withdrawCash();
		
		atm.enterPin(2346);
		
		atm.enterAmount(5000);
		
		atm.enterAmount(4000);
		
		atm.fillCash(20000L);
		
		atm.withdrawCash();
		
		atm.printAvailableCash();
		
		atm.fillCash(3000L);
		
		atm.ejectCard();
		
		atm.fillCash(50000L);
		
		atm.withdrawCash();
		
		atm.insertCard();
		
		atm.enterPin(1234);
		
		atm.enterAmount(60000);
		
		atm.enterAmount(50000);
		
		atm.withdrawCash();
		
		atm.printAvailableCash();
	}

}
