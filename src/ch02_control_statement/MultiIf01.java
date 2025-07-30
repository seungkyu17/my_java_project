package ch02_control_statement;

public class MultiIf01 {
    public static void main(String[] args) {
        int temperature = 24;
        String status = "";

        if(temperature >= 35){
            status = "폭염 경보";

        }else if(temperature >= 30){
            status = "무더운 날씨";

        }else if(temperature >= 20){
            status = "쾌적한 날씨";

        }else if(temperature >= 10){
            status = "쌀쌀한 날씨";

        }else{
            status = "추운 날씨";
        }

        String message = temperature + "도는 " + status + "입니다." ;
        System.out.println(message);
    }
}
/*
파일 : MultiIf01.java
int temperature = 24;

35도 이상 : "폭염 경보"
30도 이상 : "무더운 날씨"
20도 이상 : "쾌적한 날씨"
10도 이상 : "쌀쌀한 날씨"
이외 : "추운 날씨"

출력 예시 : 24도는 쾌적한 날씨입니다.
* */