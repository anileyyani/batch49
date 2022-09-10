package bank;

class bankAccountTest {

    public static void main(String[] args) {

        bankAccount bankAccount1 = new bankAccount(1000001,"Baladevanand Sagar",999000);
        System.out.println("\t\t\t "+ bankAccount.getBankName());
        System.out.println( bankAccount1);
        bankAccount1.deposit(500);
        System.out.println(" new balance is "+bankAccount1.getBalance());
        System.out.println(bankAccount1);
        bankAccount1.withdraw(9000);
        System.out.println(" new balance is "+bankAccount1.getBalance());
        System.out.print(bankAccount1.getAccNum());
        System.out.print(" "+ bankAccount1.getFullName());
        System.out.print(" "+bankAccount1.getBalance());
    }
}