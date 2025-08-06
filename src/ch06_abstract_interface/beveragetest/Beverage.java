package ch06_abstract_interface.beveragetest;

public abstract class Beverage {
    private String name ;
    private double price ;

    @Override
    public String toString() {
        String message = "이름 : " + this.name + "\n";
        message += "단가 : " + this.price + "원\n";
        return message ;
    }

    public String getName() {
        return name;
    }

    public abstract void drink();
    public abstract void make();

    public Beverage() {
    }

    public Beverage(String name, double price) {
        this.name = name;
        this.price = price;
    }

    protected final String getProductName() {
        return this.name + " 제조법\n";
    }
}
