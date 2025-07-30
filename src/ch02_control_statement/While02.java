package ch02_control_statement;

public class While02 {
    public static void main(String[] args) {
        int i = 1;
        int odd = 0, even = 0;
        while(i < 11) {
            if(i%2 ==0) {
                even += i;
            }else{
                odd += i;
            }
            i += 1;
            }

        System.out.println("홀수의 총합 : " + odd);
        System.out.println("짝수의 총합 : " + even);
    }
}