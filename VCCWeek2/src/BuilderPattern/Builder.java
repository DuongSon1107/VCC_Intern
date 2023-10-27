package BuilderPattern;

public interface Builder {
    Builder giveName(String name);
    Builder giveWeight(int weight);
    Builder givePlace(String place);
    Builder giveTips(int tips);
    Builder giveInsurance(boolean useInsurance);
    Builder giveVoucher(boolean useVoucher);
    Builder giveMessage(String Message);

    Delivery build();
}
