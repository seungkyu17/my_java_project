package ch05_package_inheritance.mysports;

public class SportMain {
    public static void main(String[] args) {
        FootBall football = new FootBall("축구", 11, 1, 5);

        BaseBall baseball = new BaseBall("야구", 9, 9, 0.412);

        football.printInfo();
        baseball.printInfo();
    }
}
