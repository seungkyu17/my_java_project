package ch07_collection.crudmember01;

public class Member01 {
    private String id;
    private String name;
    private int phonenum;
    private String area;

    public Member01(String id, String name, int phonenum, String area) {
        this.id = id;
        this.name = name;
        this.phonenum = phonenum;
        this.area = area;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(int phonenum) {
        this.phonenum = phonenum;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Member01{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phonenum=" + phonenum +
                ", area='" + area + '\'' +
                '}';
    }
}
