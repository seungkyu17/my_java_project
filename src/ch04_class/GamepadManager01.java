package ch04_class;

public class GamepadManager01 {
    String name;
    String connection_mode;
    String compatible;
    String input_device;
    String battery;
    String oscillatory_function;
    String sensor;
    String material;
    int weight;

    String getGamepadType(int num) {
        String getGamepadType = "";

        if (num == 1 || num == 2) {
            getGamepadType = "Xbox Controller";
        } else {
            getGamepadType = "PlayStation Controller";
        }
        String message = name + " 게임패드는" + getGamepadType + "정식 라이센스 제품입니다.";
        return message;
    }
    void display() {
        System.out.println("- " + name + "Controller Specifications" + " -");
    }
}