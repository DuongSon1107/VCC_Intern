package BuilderPattern;

public class Delivery {
    private String name;
    private int weight;
    private String place;

    private int tips;
    private boolean useInsurance;

    private boolean useVoucher;

    private String message;

    public Delivery(String name, int weight, String place, int tips, boolean useInsurance, boolean useVoucher, String message) {
        this.name = name;
        this.weight = weight;
        this.place = place;
        this.tips = tips;
        this.useInsurance = useInsurance;
        this.useVoucher = useVoucher;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getPlace() {
        return place;
    }



    public int getTips() {
        return tips;
    }

    public boolean isUseInsurance() {
        return useInsurance;
    }

    public boolean isUseVoucher() {
        return useVoucher;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", place='" + place + '\'' +
                ", tips=" + tips +
                ", useInsurance=" + useInsurance +
                ", useVoucher=" + useVoucher +
                ", message='" + message + '\'' +
                '}';
    }
}
