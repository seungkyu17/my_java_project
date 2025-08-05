package animalpkg01;

public class Lion01 extends Animal01{
    private int leg; //다리 개수

    @Override
    public void showInfo() {
        super.showInfo();
        String message = super.getName() + "의 다리 개수는 " + this.leg + "개 입니다.";
        System.out.println(message);
    }
    public Lion01(String name, int lifespan, String habitat, int speed, int leg) {
        super(name, lifespan, habitat, speed);
        this.leg = leg;
    }
    public void run(){ //뛰어 다니는 동작
        String message = super.getName() + "이(가) " + super.getSpeed() + "의 속도로 달려 갑니다.";
        System.out.println(message);
    }
}
