package ch04_class;

public class Game03 {
    private String name;
    private int strength;
    private int agility;
    private int intelligence;
    private int stamina;
    private int luck = 170;
    private String morality;
    private String bravery;
    private String charisma;

    public Game03(String name, int strength, int agility, int intelligence, int stamina, String morality, String bravery, String charisma) {
        this.name = name;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.stamina = stamina;
        this.morality = morality;
        this.bravery = bravery;
        this.charisma = charisma;
    }
    public Game03(String name, int strength, int agility, int intelligence, int stamina, int luck, String morality, String bravery, String charisma) {
        this.name = name;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.stamina = stamina;
        this.luck = luck;
        this.morality = morality;
        this.bravery = bravery;
        this.charisma = charisma;
    }
    public void display() {
        System.out.println("이름 : " + this.name);
        System.out.println("힘 : " + this.strength);
        System.out.println("민첩성 : " + this.agility);
        System.out.println("지능 : " + this.intelligence);
        System.out.println("체력 : " + this.stamina);
        System.out.println("운 : " + this.luck);
        System.out.println("도덕성 : " + this.morality);
        System.out.println("용기 : " + this.bravery);
        System.out.println("카리스마 : " + this.charisma);
    }
}