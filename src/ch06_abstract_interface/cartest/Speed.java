package ch06_abstract_interface.cartest;

public interface Speed {
    public static final int ALLOWED_MAX_SPEED = 50;
    public abstract void speedUp(int speed); //가속기
    public abstract void speedDown(int speed); // 감속기
}
