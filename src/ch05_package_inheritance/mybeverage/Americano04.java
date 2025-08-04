package ch05_package_inheritance.mybeverage;

public class Americano04 extends Beverage04{
    private double waterAmount;

    public void sipAmericano(){
        //sip : 음료를 홀짝이다. 조금씩 마시다.
        String message = "아케리카노를 홀짝 홀짝 마십니다.";
        System.out.println(message);
    }

    public Americano04(String name, double price, double waterAmount) {
        super(name, price);
        this.waterAmount = waterAmount;
    }
}
