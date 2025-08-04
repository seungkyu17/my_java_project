package ch05_package_inheritance.mysports;

public class Sport {
    private String name;
    private int entry;

    public Sport(){
    }
    public Sport(String name, int entry){
        this.name = name;
        this.entry = entry;
    }
    protected void showInfo() {
        System.out.println(this.name + " 경기는 " + this.entry + "명의 " + "엔트리로 구성이 됩니다");
    }
}
