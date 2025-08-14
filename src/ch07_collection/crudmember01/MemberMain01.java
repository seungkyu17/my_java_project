package ch07_collection.crudmember01;

import java.util.List;

public class MemberMain01 {
    public static void main(String[] args) {
        MemberDao01 dao = new MemberDao01();

        dao.Data(new Member01("hong", "홍수철", 3578, "양천구"));
        dao.Data(new Member01("kong", "공지순", 6565, "금천구"));
        dao.Data(new Member01("do", "도마연", 9373, "도봉구"));
        dao.Data(new Member01("son", "손석후", 2599, "오정구"));

        int size = dao.getSize();
        System.out.println("회원은 모두 " + size + "명입니다.");

        System.out.println("\n모든 회원 정보를 출력합니다.");

        List<Member01> memberList = dao.selectAll();

        for (Member01 two : memberList) {
            String id = two.getId();
            String name = two.getName();
            int phonenum = two.getPhonenum();
            String area = two.getArea();

            String message = id + "\t" + name + "\t" + phonenum + "\t" + area;
            System.out.println(message);
        }

        System.out.println("\n특정 아이디를 이용하여 특정 회원 정보를 조회합니다.");
        String findId = "Hong";
        Member01 two = dao.getTwo(findId);

        if(two == null){
            System.out.println(findId + "아이디는 존재하지 않습니다.");
        }else{
            String id = two.getId();
            String name = two.getName();
            int phonenum = two.getPhonenum();
            String area = two.getArea();

            String message = id + "\t" + name + "\t" + phonenum + "\t" + area;
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