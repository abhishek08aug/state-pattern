package in.blogspot.randomcompiler.state.pattern.impl;

import in.blogspot.randomcompiler.state.pattern.api.ATMState;

public class NoCardInsertedState extends ATMState {
	public NoCardInsertedState(ATM atm) {
		this.atm = atm;
	}

	@Override
	public boolean insertCard() {
		System.out.println("Card inserted");
		return true;
	}
	
	@Override
	public boolean fillCash(long cash) {
		if(atm.getCash() + cash <= atm.getMaxCashLimit()) {
			System.out.println("ATM is filled with cash successfully");
			atm.setCash(atm.getCash() + cash);
			return true;
		} else {
			return false;
		}
	}
}
