package ch06_abstract_interface.beveragetest;

public class Latte extends Beverage {
    private String milkType ;

    @Override
    public String toString() {
        String message = "우유 타입 : " + this.milkType + "\n";
        return super.toString() + message;
    }

    public Latte(String name, double price, String milkType) {
        super(name, price);
        this.milkType = milkType;
    }
    @Override
    public void drink() {
        String message = "부드럽고 크리미한 " + super.getName() + "을(를) 마십니다." ;
        System.out.println(message);
    }

    @Override
    public void make() {
        String message = "진한 에스프레소를 추출한 뒤, 따뜻하게 데운 우유를 부드럽게 부어 줍니다.\n";
        message += "마지막으로 우유 거품을 얹어 마무리합니다.\n" ;
        System.out.print(super.getProductName() + message);
    }
}