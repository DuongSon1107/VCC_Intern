package AdapterPattern;

public class Chef {
    public void receive(String info){
        System.out.println("Receive order from Waiter");
        System.out.println(info);
    }
}
