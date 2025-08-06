package ch06_abstract_interface.beveragetest;

public class Americano extends Beverage {
    private double waterAmount;

    @Override
    public String toString() {
        String message = "물의 양 : " + this.waterAmount + "\n";
        return super.toString() + message;
    }

    public Americano(String name, double price, double waterAmount) {
        super(name, price);
        this.waterAmount = waterAmount;
    }

    @Override
    public void drink() {
        String message = super.getName() + "을(를) 홀짝 홀짝 마십니다." ;
        System.out.println(message);
    }

    @Override
    public void make() {
        String message = "먼저 에스프레소를 추출한 뒤, 그 위에 뜨거운 물을 부어 희석해주면 완성됩니다.\n" ;
        message += "물과 에스프레소의 비율은 2:1 또는 3:1 정도로 조절합니다.";
        System.out.println(super.getProductName() + message);
    }
}
