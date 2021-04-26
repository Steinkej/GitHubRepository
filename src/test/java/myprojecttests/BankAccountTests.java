
package myprojecttests;
import static org.junit.Assert.*;
import org.junit.Test;
import myproject.BankAccount;

public class BankAccountTests {




	@Test
	public void testDeposit() {
		BankAccount bankaccount = new BankAccount();
		bankaccount.deposit(5000);
		assertEquals(5000, bankaccount.getBalance());
	}


	@Test
	public void testWithdraw(){
		BankAccount bankaccount = new BankAccount();
                bankaccount.deposit(5000);
		bankaccount.withdraw(2000);
		assertEquals(3000, bankaccount.getBalance());
 	}


	@Test
        public void testWithdrawforeignCurrency(){
		BankAccount bankaccount = new BankAccount();
                bankaccount.deposit(5000);
		bankaccount.withdraw(2000,2);
		assertEquals(1000, bankaccount.getBalance());
        }
}
