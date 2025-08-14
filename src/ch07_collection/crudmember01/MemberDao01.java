package ch07_collection.crudmember01;

import java.util.ArrayList;
import java.util.List;

public class MemberDao01 {
    private List<Member01> memberList = null;

    public MemberDao01() {
        this.memberList = new ArrayList<Member01>();
    }

    public int Data(Member01 member01) {
        System.out.println("아이디가 " + member01.getId() + "인 회원이 가입합니다.");
        this.memberList.add(member01);
        return 1;
    }

    public int getSize() {
        return this.memberList.size();
    }

    public List<Member01> selectAll() {
        return this.memberList;
    }


    public Member01 getTwo(String findId) {
        Member01 what = null;

        for(Member01 bean : memberList) {
            if (findId == bean.getId()) {
                what = bean;
                break;
            } else {
            }
        }
        return what;
    }

    public int deleteData(String deleteId) {
        int cnt = -1;

        for(Member01 bean : memberList){
            if(deleteId.equals(bean.getId())){
                this.memberList.remove(bean);
                cnt = 1;
                break;
            }
        }
        return cnt;
    }

    public void deleteAllData() {
        this.memberList.clear();
    }
}