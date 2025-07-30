package ch03_array;

public class MyArr01 {
    public static void main(String[] args) {
        // 정수 데이터 25개를 취급하기 위한 배열 jumsu 선언
        // int[] jumsu = new int[25];
        int[] jumsu = new int[25];

        int x = 3;
        int y = 5;

        // 정수 데이터 3개를 취급하기 위한 배열 arr 선언
        int[] arr = new int[3];

        arr[0] = x - y + 6;
        arr[2] = arr[0] + 3;
        arr[1] = arr[0] + arr[2];

        System.out.println("요소들 출력");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        System.out.println("배열 초기화 기법");
        int[] arr2 = {50, 20, 30};

        for (int i = 0; i < arr2.length; i++) {
            System.out.println("arr2[" + i + "] = " + arr2[i]);
        }

        String[] bts = new String[7];

        bts[0] = "진";
        bts[1] = "뷔";
        bts[2] = "정국";
        bts[3] = "rm";
        bts[4] = "지민";
        bts[5] = "슈가";
        bts[6] = "제이홉";

        System.out.println("연예인 출력");

        for (int i = 0; i < bts.length; i++) {
            System.out.println((i+1) + "연예인 : " + bts[i]);
        }

        for (int i = 0; i < bts.length; i++) {
            if(i != (bts.length - 1)) {
                System.out.print(bts[i]+ ", ");
            }else{
                System.out.print(bts[i]);
            }
        }
    }
}