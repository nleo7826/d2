package bank;

import java.time.LocalDateTime;

public class FixedDepositAccount extends BankAccount {
    private final Float interest;
    private final Integer duration;

    public FixedDepositAccount(String accName, Float accBalance) {
        super(accName, accBalance);
        this.interest = 3f;
        this.duration = 6;
        setAccStatus(true);
    }

    public FixedDepositAccount(String accName, Float accBalance, Float interest) {
        super(accName, accBalance);
        this.interest = interest;
        this.duration = 6;
        setAccStatus(true);
    }

    public FixedDepositAccount(String accName, Float accBalance, Float interest, Integer duration) {
        super(accName, accBalance);
        this.interest = interest;
        this.duration = duration;
        setAccStatus(true);
    }

    @Override
    public void deposit(Float amount) {
        if (getAccStatus() == false) {
            throw new IllegalStateException("Account is already closed!");
        }
        else if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }
        setAccTransactions("deposit $" + amount + " at " + LocalDateTime.now().format(formatDate()));
    }

    @Override
    public void withdraw(Float amount) {
        if (getAccStatus() == false) {
            throw new IllegalStateException("Account is already closed!");
        }
        else if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }
        setAccTransactions("withdraw $" + amount + " at " + LocalDateTime.now().format(formatDate()));
    }

    @Override
    public void setAccBalance(Float accBalance) {
        setAccBalance(getAccBalance() + this.interest);
    }

    public Float getInterest() {
        return interest;
    }

    public void setInterest(Float interest) {
        throw new IllegalArgumentException("Changing of interest is  not allowed");
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        throw new IllegalArgumentException("Changing of duration is  not allowed");
    }

    
}
