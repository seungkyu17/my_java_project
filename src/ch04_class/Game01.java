package ch04_class;

public class Game01 {
    String name;
    int strength;
    int agility;
    int intelligence;
    int stamina;
    int luck;
    String morality;
    String bravery;
    String charisma;

    String getRaceName(int num) {
        String getRaceName = "";

        if (num == 1 || num == 2) {
            getRaceName = " 리자드 파이어맨";
        } else {
            getRaceName = " 오크 매직";
        }
        String message = name + " 캐릭터는" + getRaceName + "으로 보인다.";
        return message;
    }

    void display() {
        System.out.println("- " + name + " 캐릭터의 Stats" + " -");
    }
}