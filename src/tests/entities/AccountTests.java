package tests.entities;

import entities.Account;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tests.factory.AccountFactory;

public class AccountTests {
    @Test
    public void depositShouldIncreaseBalanceAndDiscountFeeWhenAmountPositive(){
        double amount = 200.00;
        double expectedValue = 196.00;
        Account acc = AccountFactory.createEmptyAccount();

        acc.deposit(amount);

        Assertions.assertEquals(expectedValue,acc.getBalance());
    }
    @Test
    public  void depositShouldDoNothingWhenNegativeAmount(){
        double expectedValue = 100.00;
        Account acc = AccountFactory.createAccount(expectedValue);
        double amount = -200.00;

        acc.deposit(amount);

        Assertions.assertEquals(expectedValue,acc.getBalance());
    }
}
