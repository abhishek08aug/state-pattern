package in.blogspot.randomcompiler.state.pattern.impl;

import in.blogspot.randomcompiler.state.pattern.api.ATMState;

public class WithdrawCashState extends ATMState {
	public WithdrawCashState(ATM atm) {
		this.atm = atm;
	}
	
	@Override
	public boolean ejectCard() {
		System.out.println("Card ejected");
		return true;
	}
	
	@Override
	public boolean withdrawCash() {
		System.out.println("Cash withdrawn: " + atm.getAmount());
		atm.setCash(atm.getCash() - atm.getAmount());
		atm.setAmount(0);
		return true;
	}
}
