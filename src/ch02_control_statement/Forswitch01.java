package ch02_control_statement;

public class Forswitch01 {
    public static void main(String[] args) {
        int odd = 0, even = 0;

        for (int i = 1; i < 11; i++) {
            switch (1%2){
                case 0:
                    even += i;
                    break;
                case 1:
                    odd += i;
                    break;


            }
        }
    }
}
