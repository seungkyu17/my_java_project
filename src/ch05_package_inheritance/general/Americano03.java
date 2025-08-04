package ch05_package_inheritance.general;

//            서브클래스   extends  슈퍼클래스
public class Americano03 extends Beverage03{
    private double waterAmount; //투입하는 물의 양

    public Americano03(String name, double price, double waterAmount){
        //super(); //부모님의 생성자 호출
        super(name, price);
        this.waterAmount = waterAmount;
    }
    public void printInfo(){
        super.showInfo();
        System.out.println("투입된 물의 양 : " + this.waterAmount);
        System.out.println();
    }
}