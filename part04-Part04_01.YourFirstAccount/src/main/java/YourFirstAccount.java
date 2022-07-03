
public class YourFirstAccount {

    public static void main(String[] args) {
        Account slawAccount = new Account("slaw", 100.0);
        slawAccount.deposit(20.0);
        System.out.println(slawAccount.toString());
    }
}
