package AdapterPattern;

public class Run {
    public static void main(String[] args) {
        Guest guest = new Waiter(new Chef());
        guest.sendOrder("I'm thirsty");
    }
}
