package ch06_abstract_interface.beveragetest;

public class Espresso extends Beverage {
    private int shotCount ;

    @Override
    public String toString() {
        String message = "샷 개수 : " + this.shotCount + "\n";
        return super.toString() + message;
    }

    public Espresso(String name, double price, int shotCount) {
        super(name, price);
        this.shotCount = shotCount;
    }
    @Override
    public void drink() {
        String message = "맛이 진하고 강렬한 " + super.getName() + "를 마십니다." ;
        System.out.println(message);
    }

    @Override
    public void make() {
        String message = "원두를 미세하게 갈아서, 탬퍼로 평평하게 눌러줍니다.\n";
        message += "포터 필터를 머신에 장착하고, 25-30초 동안 30ml의 에스프레소를 추출합니다.\n" ;
        System.out.print(super.getProductName() + message);
    }
}
