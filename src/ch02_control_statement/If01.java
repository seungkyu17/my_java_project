package ch02_control_statement;

public class If01 {
    public static void main(String[] args) {
        int su = 10 ;

        if(su%2 == 0){
            System.out.println("짝수 " + su + "야~~놀자");
        }

        if(su%2 == 0){
            System.out.println("숫자 " + su + "은(는) 짝수입니다.");
            System.out.println("하하하");
        }else{
            System.out.println("숫자 " + su + "은(는) 홀수입니다.");
            System.out.println("호호호");
        }
        System.out.println("크크크");
    }
}
