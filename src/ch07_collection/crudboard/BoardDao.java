package ch07_collection.crudboard;

import java.util.ArrayList;
import java.util.List;

//DAO 클래스 : 데이터 베이스에게 데이터를 추가/수정/삭제 등의 작업을 요청해주는 중간 middle-ware 성격의 클래스
public class BoardDao {
    private List<Board> boardList = null; //게시물들을 담는 통(bottle)

    public BoardDao() {
        this.boardList = new ArrayList<Board>(); //게시물 담는 통 초기화

    }

    public int insertData(Board board) {
        System.out.println("게시물 번호 " + board.getNo() + "이(가) 추가 됩니다.");
        boardList.add(board);
        return 1;
    }

    public int getSize() {
        return this.boardList.size();
    }

    public List<Board> selectAll() {
        return this.boardList;
    }

    public int removeData(int deleteId) {
        //deleteId는 삭제하고자 하는 게시물 번호
        int cnt = -1; //-1은 '발견' 여부를 나타내는 flag 변수

        for (Board bean : boardList) {
            if (deleteId == bean.getNo()) { //발견됨
                this.boardList.remove(bean);
                cnt = 1;
                break;

            } else {  //발견 못함
            }
        }
        return cnt;
    }

    public Board getOne(int findId) {
        //findId는 찾고자 하는 게시물 번호
        Board findData = null; //반환해줄 데이터 정보

        for (Board bean : boardList) {
            if (bean.getNo() == findId) { //해당 게시물 발견됨
                findData = bean; //해당 객체를 반환하는 데이터에 할당
                break; //이하 다른 게시물은 볼 필요 없음
            }
        }
        return findData;
    }

        public void removeAllBoards() {
        this.boardList.clear();
    }
}