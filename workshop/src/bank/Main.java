package bank;

public class Main {
    
    public static void main(String[] args) {

        line();
        //BankAccount test
        BankAccount b = new BankAccount("Ken", 100f);

        System.out.println("Account Name: " + b.getAccName() + "\nAccount Number: " + b.getAccNumber());
        System.out.println("Account Balance: " + b.getAccBalance() + "\n");

        b.deposit(100f);
        b.withdraw(50f);
        b.withdraw(0f);
        // b.withdraw(200f);
        // b.withdraw(-10f);
        // b.deposit(-100f);
        System.out.print("This is the list of account transactions for: " + b.getAccName() + "\n");
        b.getAccTransactions();
        System.out.println("\nNew Account Balance: " + b.getAccBalance() + "\n");
        line();

        //FixedDepositAccount test
        BankAccount c = new FixedDepositAccount("Jeff", 2000f);

        System.out.println("\nAccount Name: " + c.getAccName() + "\nAccount Number: " + c.getAccNumber());
        System.out.println("Account Balance: " + c.getAccBalance() + "\n");

        c.deposit(243f);
        c.withdraw(50f);

        System.out.print("This is the list of account transactions for: " + c.getAccName() + "\n");
        c.getAccTransactions();

        System.out.println("Account Balance should have no change as it is a Fixed Deposit Account: " + c.getAccBalance() + "\n");
        line();
        
    }

    public static void line() {
        System.out.println("----------------------------------------------------------------------------------------------");
    }
}
