package in.blogspot.randomcompiler.state.pattern.impl;

import in.blogspot.randomcompiler.state.pattern.api.ATMState;

public class ValidPinState extends ATMState {
	public ValidPinState(ATM atm) {
		this.atm = atm;
	}
	
	@Override
	public boolean ejectCard() {
		System.out.println("Card ejected");
		return true;
	}
	
	@Override
	public boolean enterAmount(int amount) {
		if(amount != 0 && amount%100 == 0 && atm.getCash() >= amount) {
			System.out.println("Valid amount");
			atm.setAmount(amount);
			return true;
		} else {
			System.out.println("Invalid amount");
			atm.setAmount(0);
			return false;
		}
	}
}
