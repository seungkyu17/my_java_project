package ch04_class;

public class GameMain01 {
    public static void main(String[] args) {
        Game01 gough = new Game01();

        Game01 ork;
        ork = new Game01();

        gough.name = "gough";
        gough.strength = 290;
        gough.agility = 40;
        gough.intelligence = 220;
        gough.stamina = 150;
        gough.luck = 170;
        gough.morality = "충성스러움";
        gough.bravery = "겁쟁이";
        gough.charisma = "우물거림";

        System.out.println("이름 : " + gough.name);
        System.out.println("힘 : " + gough.strength + " (강함)");
        System.out.println("민첩성 : " + gough.agility + " (매우느림)");
        System.out.println("지능 : " + gough.intelligence + " (평범함)");
        System.out.println("체력 : " + gough.stamina + " (약함)");
        System.out.println("운 : " + gough.luck + " (기분나쁨)");
        System.out.println("도덕성 : " + gough.morality + " (우직함)");
        System.out.println("용기 : " + gough.bravery + " (멍청함)");
        System.out.println("카리스마 : " + gough.charisma + " (긍정적)");

        ork.name = "ork";
        ork.strength = 130;
        ork.agility = 70;
        ork.intelligence = 210;
        ork.stamina = 190;
        ork.luck = 180;
        ork.morality = "게으름";
        ork.bravery = "희생정신";
        ork.charisma = "재빠른";

        System.out.println("이름 : " + ork.name);
        System.out.println("힘 : " + ork.strength + " (매우약함)");
        System.out.println("민첩성 : " + ork.agility + " (매우느림)");
        System.out.println("지능 : " + ork.intelligence + " (평범함)");
        System.out.println("체력 : " + ork.stamina + " (평범함)");
        System.out.println("운 : " + ork.luck + " (평범함)");
        System.out.println("도덕성 : " + ork.morality + " (이기적인)");
        System.out.println("용기 : " + ork.bravery + " (똑똑함)");
        System.out.println("카리스마 : " + ork.charisma + " (부정적인)");
    }
}
