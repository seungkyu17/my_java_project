package ch06_abstract_interface.animaltest;

public interface Bird {
    int speed = 300;
    //public static final int speed = 300;
    //public abstract - 상속

    void fly();
    //public abstract void fly();

    default void fulltter(){ // 기본 동작 정의
        System.out.println("날개를 펄럭입니다.");
    }
}