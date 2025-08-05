package animalpkg01;

public class Eagle01 extends Animal01 {
    private int wing; //날개 개수

    @Override
    public void showInfo() {
        super.showInfo();
        String message = super.getName() + "의 날개 개수는 " + this.wing + "개 입니다.";
        System.out.println(message);
    }
    public Eagle01(String name, int lifespan, String habitat, int speed, int wing) {
        super(name, lifespan, habitat, speed);
        this.wing = wing;
    }
    public void fly() { //날아 다니는 동작
        String message = super.getName() + "이(가) " + super.getSpeed() + "의 속도로 날아 다닙니다.";
        System.out.println(message);
    }
}