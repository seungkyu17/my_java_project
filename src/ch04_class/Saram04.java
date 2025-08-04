package ch04_class;

import java.util.Scanner;

public class Saram04 {
    private String name;
    private double height;
    private double weight;
    private String hobby;
    private String blood;

    Scanner scan = null; // 이런 변수가 있다라고 선언

    // public 반환타입 이름(매개변수){...}
    public Saram04(String name, double height, double weight, String hobby, String blood) {
        this.name = name;
        this.height = height;
        this.blood = blood;
        this.hobby = hobby;
        this.weight = weight;
    }
    public Saram04() {
        this.name = "김철수";

        scan = new Scanner(System.in); // 해당 장치를 생성자에서 초기화 시킴
    }
    public Saram04(String name, double height, double weight, String blood) {
        this.name = name;
        this.height = height;
        this.blood = blood;
        this.hobby = "볼링";
        this.weight = weight;
    }
    public void display() {
        System.out.println("이름 : " + this.name);
        System.out.println("키 : " + this.height);
        System.out.println("몸무게 : " + this.weight);
        System.out.println("취미 : " + this.hobby);
        System.out.println("혈액형 : " + this.blood);

        //if(scan == null) {
        //System.out.print("정수 입력 : ");
        //int su = this.scan.nextInt();
        //System.out.println("입력된 정수 : " + su);
        }
    }