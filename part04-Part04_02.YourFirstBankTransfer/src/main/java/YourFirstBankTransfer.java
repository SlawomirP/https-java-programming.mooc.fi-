
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account mathewAccount = new Account("Matthews account", 1000.0);
        Account myAccount = new Account("My account", 0);
        mathewAccount.withdrawal(100.0);
        System.out.println(mathewAccount.toString());
        myAccount.deposit(100.0);
        System.out.println(myAccount.toString());
    }
}
