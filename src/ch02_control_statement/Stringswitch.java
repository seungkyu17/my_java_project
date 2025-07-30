package ch02_control_statement;

public class Stringswitch {
    public static void main(String[] args) {
        String month = "January" ;
        int monthNumber = 0 ;

        switch (month) {
            case "January":
                monthNumber = 1 ;
                break;
            case "February":
                monthNumber = 1 ;
                break;
            case "March":
                monthNumber = 1 ;
                break;
            case "April":
                monthNumber = 1 ;
                break;
            case "May":
                monthNumber = 1 ;
                break;
            case "June":
                monthNumber = 1 ;
                break;
            case "July":
                monthNumber = 1 ;
                break;
            case "August":
                monthNumber = 1 ;
                break;
            case "September":
                monthNumber = 1 ;
                break;
            case "October":
                monthNumber = 1 ;
                break;
            case "November":
                monthNumber = 1 ;
                break;
            case "December":
                monthNumber = 1 ;
                break;
        }

        String message = month + "은(는)" + monthNumber + "월입니다.";
        System.out.println(message);
    }
}
