package ch07_collection.crudmember;

import java.util.List;

public class MemberMain {
    public static void main(String[] args) {
        MemberDao dao = new MemberDao(); //회원 가입

        dao.insetData(new Member("kim", "김만수", 10, "남자"));
        dao.insetData(new Member("park", "박영희", 20, "여자"));
        dao.insetData(new Member("lee", "이수진", 30, "여자"));
        dao.insetData(new Member("choi", "최윤식", 40, "남자"));

        int size = dao.getSize();
        System.out.println("회원은 총 " + size + "명입니다.");

        System.out.println("\n모든 회원 정보를 출력합니다.");

        List<Member> memberList = dao.selectAll();

        for(Member one : memberList){ //toString 이 숨어있음
            String id = one.getId();
            String name = one.getName();
            int age = one.getAge();
            String gender = one.getGender();

            String message = id + "\t" + name + "\t" + age + "\t" + gender;
            System.out.println(message);
        }

        System.out.println("\n특정 아이디를 이용하여 특정 회원 정보를 조회합니다.");
        String findId = "lee";
        Member one = dao.getOne(findId);
        
        if(one == null){
            System.out.println(findId + " 아이디는 존재하지 않습니다.");
        }else{
            String id = one.getId();
            String name = one.getName();
            int age = one.getAge();
            String gender = one.getGender();

            String message = id + "\t" + name + "\t" + age + "\t" + gender;
            System.out.println(message);
        }

        System.out.println("\n특정 아이디를 사용하여 회원 정보를 삭제합니다.");
        String deleteId = "park";

        int result = dao.deleteData(deleteId);

        if(result != -1){
            System.out.println(deleteId + " 아이디 삭제 성공");
        }else{
            System.out.println(deleteId + " 아이디를 발견하지 못했습니다.");
        }

        System.out.println("\nbefore all deleted : " + dao.getSize());

        System.out.println("회원 목록을 전부 삭제합니다.");
        dao.deleteAllData();

        System.out.println("\nafter all deleted : " + dao.getSize());
    }
}
