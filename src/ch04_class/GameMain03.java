package ch04_class;

public class GameMain03 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Game03[] game = new Game03[2];

        game[0] = new Game03("gough", 290, 40, 220, 150, "충성스러움", "겁쟁이", "우물거림");

        game[1] = new Game03("ork", 130, 70, 210, 190, 180, "게으름", "희생정신", "재빠른");

        for (int i = 0; i < game.length; i++) {
            game[i].display();
        }
        Game03[] mylist = {
                new Game03("gough", 290, 40, 220, 150, "충성스러움", "겁쟁이", "우물거림"),
                new Game03("ork", 130, 70, 210, 190, 180, "게으름", "희생정신", "재빠른")};

        for (int i = 0; i < game.length; i++) {
            mylist[i].display();
        }
    }
}