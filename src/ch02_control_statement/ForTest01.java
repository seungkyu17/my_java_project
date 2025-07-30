package ch02_control_statement;

public class ForTest01 {
    public static void main(String[] args) {
        int dan = 3;

        for (int i = 1; i < 10; i++) {
            String message = dan + "*" + i + " = " + (dan*i) ;
            System.out.println(message);
        }
    }
}
