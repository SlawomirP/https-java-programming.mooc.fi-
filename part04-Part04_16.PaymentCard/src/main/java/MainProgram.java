
public class MainProgram {

    public static void main(String[] args) {
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);

        paulsCard.eatHeartily();
        mattsCard.eatAffordably();

        System.out.println(paulsCard);
        System.out.println(mattsCard);

        paulsCard.addMoney(20);
        mattsCard.eatHeartily();

        System.out.println(paulsCard);
        System.out.println(mattsCard);

        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        mattsCard.addMoney(50);

        System.out.println(paulsCard);
        System.out.println(mattsCard);
    }
}
