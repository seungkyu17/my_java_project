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

    String getRaceName(int num){
        String getRaceName = "";

        if (num == 1 || num == 2){
            getRaceName = "리자드맨";
        }else{
            getRaceName = "오크";
        }
        String message = name + "캐릭터는 정직한 스타일의 기사입니다";
        return message;
    }


}