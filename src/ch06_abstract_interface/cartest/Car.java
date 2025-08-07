package ch06_abstract_interface.cartest;

public abstract class Car implements Speed, Display, Radio {
    //일반화) 모든 차들에게 공통적으로 적용할 수 있는 변수들을 여기에 정의합니다.
    private String name; //차량 이름
    private int price; // 단가
    private Key key; //열쇠의 종류

    protected int speed; //차량 현재 속도

    @Override
    public String toString() {
        String message = "이름 : " + this.name + "\n";
        message += "단가 : " + this.price + "원\n";
        message += "열쇠 타입 : " + this.key + "\n";
        message += "한글 이름 : " + this.key.getName() + "\n";
        return message;
    }

    public String getName() {
        return name;
    }

    public Car() {
    }

    public Car(String name, int price, Key key) {
        this.name = name;
        this.price = price;
        this.key = key;
    }

    public final void turnOn() {
        String message = this.key.getName() + "로 " + this.name + "의 시동을 켭니다.";
        System.out.println(message);
    }

    public final void turnOff() {
        String message = this.name + "의 시동을 끕니다.";
        System.out.println(message);
    }
    //최소 속도를 초과하면 허용 최고 속도로 제한시키기
    protected int checkSpeed() {
        int maxSpeed = Speed.ALLOWED_MAX_SPEED;

        if(this.speed >= maxSpeed) {
            String message = maxSpeed + "km 이상 과속하지 마세요.";
            System.out.println(message);

            return maxSpeed;
        }else{
            return this.speed;
        }
    }
}