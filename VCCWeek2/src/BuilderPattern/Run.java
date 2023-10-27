package BuilderPattern;

public class Run {
    public static void main(String[] args) {
        Delivery delivery1 = new DeliveryBuilder().giveName("fan").givePlace("Ha Noi").giveWeight(14).giveMessage("Lam on giao hang cho toi").build();
        System.out.println(delivery1);
    }
}
