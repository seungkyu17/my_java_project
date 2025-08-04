package ch04_class;

public class GameMain00 {
    public static void main(String[] args) {
        String gough_name;
        int gough_strength;
        int gough_agility;
        int gough_intelligence;
        int gough_stamina;
        int gough_luck;
        String gough_morality;
        String gough_bravery;
        String gough_charisma;

        gough_name = "gough";
        gough_strength = 500;
        gough_agility = 40;
        gough_intelligence = 220;
        gough_stamina = 150;
        gough_luck = 170;
        gough_morality = "충성스러움";
        gough_bravery = "겁쟁이";
        gough_charisma = "우물거림";

        System.out.println("이름 : " + gough_name);
        System.out.println("힘 : " + gough_strength + " (강함)");
        System.out.println("민첩성 : " + gough_agility + " (매우느림)");
        System.out.println("지능 : " + gough_intelligence + " (평범함)");
        System.out.println("체력 : " + gough_stamina + " (약함)");
        System.out.println("운 : " + gough_luck + " (기분나쁨)");
        System.out.println("도덕성 : " + gough_morality + " (우직함)");
        System.out.println("용기 : " + gough_bravery + " (멍청함)");
        System.out.println("카리스마 : " + gough_charisma + " (긍정적)");

        String ork_name;
        int ork_strength;
        int ork_agility;
        int ork_intelligence;
        int ork_stamina;
        int ork_luck;
        String ork_morality;
        String ork_bravery;
        String ork_charisma;

        ork_name = "ork";
        ork_strength = 130;
        ork_agility = 70;
        ork_intelligence = 210;
        ork_stamina = 190;
        ork_luck = 180;
        ork_morality = "게으름";
        ork_bravery = "희생정신";
        ork_charisma = "재빠른";

        System.out.println("이름 : " + ork_name);
        System.out.println("힘 : " + ork_strength + " (매우약함)");
        System.out.println("민첩성 : " + ork_agility + " (매우느림)");
        System.out.println("지능 : " + ork_intelligence + " (평범함)");
        System.out.println("체력 : " + ork_stamina + " (평범함)");
        System.out.println("운 : " + ork_luck + " (평범함)");
        System.out.println("도덕성 : " + ork_morality + " (이기적인)");
        System.out.println("용기 : " + ork_bravery + " (똑똑함)");
        System.out.println("카리스마 : " + ork_charisma + " (부정적인)");
    }
}
