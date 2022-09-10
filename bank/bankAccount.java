package bank;

public class bankAccount {
    private static  String bankName =" BANK OF BARODA ";
    private long  accNum;
    private String fullName;
    private double balance;

    public static String getBankName() {
        return bankName;
    }

    public void deposit(double cashIn){
        balance +=cashIn;
        System.out.print("Transaction Successful, account credited with "+ cashIn);
    }
    public void withdraw(double cashOut){
        if (balance<cashOut) {
            System.out.println("Insufficient Fund, transaction cancelled");
        }else {
            balance -=cashOut;
            System.out.print("transaction successful, account debited with "+ cashOut);
        }
    }

    @Override
    public String toString() {
        return "bankAccount{" +
                "accNum=" + accNum +
                ", fullName='" + fullName + '\'' +
                ", balance=" + balance +
                '}';
    }
    public bankAccount(long accNum, String fullName, double balance) {
        this.accNum = accNum;
        this.fullName = fullName;
        this.balance = balance;
    }
    public long getAccNum() {
        return accNum;
    }
    public String getFullName() {
        return fullName;
    }
    public double getBalance() {
        return balance;
    }

}
