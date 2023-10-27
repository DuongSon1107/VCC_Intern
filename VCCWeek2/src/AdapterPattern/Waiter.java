package AdapterPattern;

import java.sql.SQLOutput;

public class Waiter implements Guest{
    private Chef chef;
    public Waiter(Chef chef){
        this.chef=chef;
    }
    @Override
    public void sendOrder(String order) {
        System.out.println("What would you like ?");
        System.out.println(order);
        String info = this.request(order);
        System.out.println("Sending order to the Chef");
        chef.receive(info);
    }

    private String request(String order ){
        return "Give some drinks";
    }
}
