
public class PaymentCard {

    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void addMoney(double increase) {
        if (increase > 0) {
            this.balance = this.balance + increase;
        }
    }

    public boolean takeMoney(double amount) {
        if (this.balance >= amount && amount > 0) {
            this.balance -= amount;
            return true;
        }
        return false;
    }
}
