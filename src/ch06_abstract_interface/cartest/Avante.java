package ch06_abstract_interface.cartest;

public class Avante extends Car{
    private String comment;

    @Override
    public String toString() {
        String message = "코멘트 : " + comment;
        return super.toString() + message;
    }

    public Avante(String name, int price, Key key, String comment) {
        super(name, price, key);
        this.comment = comment;
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
