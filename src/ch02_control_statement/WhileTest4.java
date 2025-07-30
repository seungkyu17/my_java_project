package ch02_control_statement;

import java.util.Scanner;

public class WhileTest4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int total = 0;
        int count = 0;
        double average = 0.0;
        while (true){
            System.out.print("점수 입력 : ");
            int grade = scan.nextInt();

            if(grade < -10) {
                System.out.println("-10 미만이어서 종료합니다.");
                break;

            }else if(grade <0) {
                grade = -grade;
            }else{

            }

            total += grade;
            count++;
        }

        System.out.println("총점 : " + total);
        average = (double) total / count;
        System.out.println("평균 : " + average);
    }
}