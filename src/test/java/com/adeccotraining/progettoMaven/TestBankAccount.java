package com.adeccotraining.progettoMaven;


import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.adeccotraining.progettoMaven.BankAccount;

public class TestBankAccount {

	@Test
public void testDebit(){
	BankAccount ac = new BankAccount (10.0);
	assertEquals("if i debit 5 in a BankAccount of 10 all 5 are debit", ac.debit(15),10,0);
}

}
