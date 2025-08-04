package ch04_class;

public class GamepadManagerMain01 {
    public static void main(String[] args) {
        GamepadManager01 xbox_controller = new GamepadManager01();

        GamepadManager01 playStation_controller;
        playStation_controller = new GamepadManager01();

        xbox_controller.name = "X-Pad!!";
        xbox_controller.number_of_buttons = 12;
    }
}
