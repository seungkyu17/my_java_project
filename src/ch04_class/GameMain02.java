package ch04_class;

public class GameMain02 {
    public static void main(String[] args) {
        Game02 gough = new Game02();
        Game02 ork = new Game02();

        gough.setName("gough");
        gough.setStrength(290);
        gough.setAgility(40);
        gough.setIntelligence(220);
        gough.setStamina(150);
        gough.setLuck(170);
        gough.setMorality("충성스러움");
        gough.setBravery("겁쟁이");
        gough.setCharisma("우물거림");

        System.out.println("이름 : " + gough.getName());
        System.out.println("힘 : " + gough.getStrength());
        System.out.println("민첩성 : " + gough.getAgility());
        System.out.println("지능 : " + gough.getIntelligence());
        System.out.println("체력 : " + gough.getStamina());
        System.out.println("운 : " + gough.getLuck());
        System.out.println("도덕성 : " + gough.getMorality());
        System.out.println("용기 : " + gough.getBravery());
        System.out.println("카리스마 : " + gough.getCharisma());

        ork.setName("ork");
        ork.setStrength(130);
        ork.setAgility(70);
        ork.setIntelligence(210);
        ork.setStamina(190);
        ork.setLuck(180);
        ork.setMorality("게으름");
        ork.setBravery("희생정신");
        ork.setCharisma("재빠른");

        System.out.println("이름 : " + ork.getName());
        System.out.println("힘 : " + ork.getStrength());
        System.out.println("민첩성 : " + ork.getAgility());
        System.out.println("지능 : " + ork.getIntelligence());
        System.out.println("체력 : " + ork.getStamina());
        System.out.println("운 : " + ork.getLuck());
        System.out.println("도덕성 : " + ork.getMorality());
        System.out.println("용기 : " + ork.getBravery());
        System.out.println("카리스마 : " + ork.getCharisma());
    }
}
