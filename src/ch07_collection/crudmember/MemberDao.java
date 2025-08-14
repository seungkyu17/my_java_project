package ch07_collection.crudmember;

import java.util.ArrayList;
import java.util.List;

public class MemberDao {
    private List<Member> memberList = null; //회원 목록을 담을 컬렉션

    public MemberDao() {
        this.memberList = new ArrayList<Member>();
    }

    public int insetData(Member member) {// 회원 1명 추가하기
        System.out.println("아이디가 " + member.getId() + "인 회원이 가입합니다.");
        this.memberList.add(member);
        return 1;
    }

    public int getSize() {
        return this.memberList.size();
    }

    public List<Member> selectAll() {
        return this.memberList;
    }

    public Member getOne(String findId) {
        //특정 아이디 findId를 사용하여 회원이 존재하는 지 검색합니다.
        Member who = null; //발견되면 여기에 값 할당

        for(Member bean : memberList){
            if(findId == bean.getId()){
                who = bean;
                break;
            }else{
                //그런 사람 없음
            }
        }
        return who;
    }

    public int deleteData(String deleteId) {
        int cnt = -1;
        
        for(Member bean : memberList){
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
