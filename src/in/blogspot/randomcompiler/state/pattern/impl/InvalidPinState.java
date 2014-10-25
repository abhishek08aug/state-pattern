package in.blogspot.randomcompiler.state.pattern.impl;

import in.blogspot.randomcompiler.state.pattern.api.ATMState;

public class InvalidPinState extends ATMState {
	public InvalidPinState(ATM atm) {
		this.atm = atm;
	}
	
	@Override
	public boolean ejectCard() {
		System.out.println("Card ejected");
		return true;
	}
	
	@Override
	public boolean enterPin(int pin) {
		if(isValid(pin)) {
			System.out.println("PIN accepted");
			return true;
		} else {
			System.out.println("PIN rejected");
			return false;
		}
	}

	private boolean isValid(int pin) {
		if(pin >= 1000 && pin <=9999) {
			return true;
		}
		return false;
	}	
}
