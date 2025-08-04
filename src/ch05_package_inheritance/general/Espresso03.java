package ch05_package_inheritance.general;

public class Espresso03 extends Beverage03{
    private int shotCount; //샷 추가 개수

    public Espresso03(String name, double price, int shotCount){
        super(name, price);
        this.shotCount = shotCount;
    }
    public void printInfo(){
        super.showInfo();
        System.out.println("샷 추가 개수 : " + this.shotCount);
        System.out.println();
    }
}
