package ch06_abstract_interface.cartest;

public class Sonata extends Car{
    private String maker;

    @Override
    public String toString() {
        String message = "메이커 : " + this.maker + "\n";
        return super.toString() + message;
    }

    public Sonata(String name, int price, Key key, String maker) {
        super(name, price, key);
        this.maker = maker;
    }

    @Override
    public void display() {
        String message = super.getName() + "의 현재 속도 : " + super.speed + "km";
        System.out.println(message);
    }

    @Override
    public void speedUp(int speed) {
        super.speed += speed;
        super.speed = super.checkSpeed();

    }

    @Override
    public void speedDown(int speed) {
        super.speed -= speed < 0 ? -speed : speed;

    }
}
