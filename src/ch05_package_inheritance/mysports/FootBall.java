package ch05_package_inheritance.mysports;

public class FootBall extends Sport {
    private int halves;
    private int goals;

    public FootBall(String name, int entry, int halves, int goals) {
        super(name, entry);
        this.halves = halves;
        this.goals = goals;
    }

    public void printInfo() {
        super.showInfo();
        System.out.println(this.halves + "개의 " + "하프타임으로 구성이 되며," + this.goals + " 골이 들어갔습니다.");
    }
}