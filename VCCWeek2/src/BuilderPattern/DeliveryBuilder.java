package BuilderPattern;

public class DeliveryBuilder implements Builder{
    private String name;
    private int weight;
    private String place;
    private int tips;
    private boolean useInsurance;
    private boolean useVoucher;
    private String message;
    @Override
    public Builder giveName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public Builder giveWeight(int weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public Builder givePlace(String place) {
        this.place = place;
        return this;
    }

    @Override
    public Builder giveTips(int tips) {
        this.tips = tips;
        return this;
    }

    @Override
    public Builder giveInsurance(boolean useInsurance) {
        this.useInsurance = useInsurance;
        return this;
    }

    @Override
    public Builder giveVoucher(boolean useVoucher) {
        this.useVoucher = useVoucher;
        return this;
    }

    @Override
    public Builder giveMessage(String message) {
        this.message = message;
        return this;
    }

    @Override
    public Delivery build(){
        return new Delivery(name,weight,place,tips,useInsurance,useVoucher,message);
    }
}
