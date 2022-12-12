package bank;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class BankAccount {
    private final String accName;
    private final Long accNumber;
    private Float accBalance;
    private List<String> accTransactions = new LinkedList<String>();
    private Boolean accStatus;
    private Date accCreatedAt;
    private Date accClosedAt;
    
    public BankAccount(String accName) {
        this.accName = accName;
        this.accBalance = 0f;
        this.accNumber = numberGenerator();
        this.accStatus = true;
    }

    public BankAccount(String accName, Float accBalance) {
        this.accName = accName;
        this.accBalance = accBalance;
        this.accNumber = numberGenerator();
        this.accStatus = true;
    }

    public String getAccName() {
        return accName;
    }

    public Long getAccNumber() {
        return accNumber;
    }

    public Float getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(Float accBalance) {
        this.accBalance = accBalance;
    }

    public void getAccTransactions() {
        for (String transact : accTransactions) {
            System.out.println(transact);
        }
    }

    public void setAccTransactions(String transaction) {
        this.accTransactions.add(transaction);
    }

    public Boolean getAccStatus() {
        return accStatus;
    }

    public void setAccStatus(Boolean accStatus) {
        this.accStatus = accStatus;
    }

    public Date getAccCreatedAt() {
        return accCreatedAt;
    }

    public void setAccCreatedAt(Date accCreatedAt) {
        this.accCreatedAt = accCreatedAt;
    }

    public Date getAccClosedAt() {
        return accClosedAt;
    }

    public void setAccClosedAt(Date accClosedAt) {
        this.accClosedAt = accClosedAt;
    }

    private long numberGenerator() {
        long tempNo = new Random().nextInt(9);
        long mult = 10;
        for (int i = 0; i < 8 ; i++) {
            tempNo += new Random().nextInt(9) * mult;
            mult *= 10;
        }
        return tempNo;
    }

    public void deposit(Float amount) {
        if (accStatus == false) {
            throw new IllegalStateException("Account is already closed!");
        }
        else if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }
        final DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        this.accBalance += amount;
        this.accTransactions.add("deposit $" + amount + " at " + LocalDateTime.now().format(dateTime));
    }

    public void withdraw(Float amount) {
        if (accStatus == false) {
            throw new IllegalStateException("Account is already closed!");
        }
        else if (amount < 0) {
                throw new IllegalArgumentException("Invalid withdrawal amount!");
        }
        else if (accBalance < amount) {
            throw new IllegalArgumentException("Insufficient account balance to withdraw");
        } else {
            final DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            this.accBalance -= amount;
            this.accTransactions.add("withdraw $" + amount + " at " + LocalDateTime.now().format(dateTime));
        }
    }

    protected DateTimeFormatter formatDate() {
        return DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    }
    
}