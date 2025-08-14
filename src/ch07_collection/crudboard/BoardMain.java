package ch07_collection.crudboard;

import java.util.ArrayList;
import java.util.List;

public class BoardMain {
    public static void main(String[] args) {
        Board data01 = new Board(10, "여름 폭염", "김철수", "2025/08/10", 5);
        Board data02 = new Board(9, "우크라이나 전쟁", "푸틴", "2025/07/17", 3);
        Board data03 = new Board(8, "홈플러스", "이수정", "2025/11/11", 8);

        BoardDao dao = new BoardDao();
        dao.insertData(data01);
        dao.insertData(data02);
        dao.insertData(data03);
        dao.insertData(new Board(7, "서이초등학교", "금잔디", "2025/11/11", 4));
        dao.insertData(new Board(6, "남극탐험", "이강우", "2025/11/11", 11));

        System.out.println("요소 개수 : " + dao.getSize());

        System.out.println("\n전체 게시물 목록을 조회합니다.");

        List<Board> boardList = dao.selectAll();
        System.out.println("글번호\t제목\t작성자\t작성 일자\t조회수");

        for (Board bean : boardList) {
            int no = bean.getNo();
            String title = bean.getTitle();
            String writer = bean.getWriter();
            String regdate = bean.getRegdate();
            int readcount = bean.getReadcount();

            String message = no + "\t" + title + "\t" + writer + "\t" + regdate + "\t" + readcount;
            System.out.println(message);
        }

        System.out.println("\n게시물 번호를 이용하여 특정 게시물을 조회합니다.");
        int findId = 7; //찾고자 하는 게시물 번호

        Board bean = dao.getOne(findId);

        if (bean == null) {
            System.out.println(findId + "게시물은 존재하지 않습니다.");

        }else{
            System.out.println("글번호\t제목\t작성자\t작성 일자\t조회수");

            int no = bean.getNo();
            String title = bean.getTitle();
            String writer = bean.getWriter();
            String regdate = bean.getRegdate();
            int readcount = bean.getReadcount();

            String message = no + "\t" + title + "\t" + writer + "\t" + regdate + "\t" + readcount;
            System.out.println(message);
        }

        System.out.println("\n게시물 번호를 이용하여 특정 게시물을 삭제합니다.");
        int deleteId = 8; //삭제하고자 하는 게시물 번호

        int result = dao.removeData(deleteId);

        if (result != -1) {
            System.out.println(deleteId + " 게시물 삭제 성공");
        } else {
            System.out.println(deleteId + " 게시물을 발견하지 못했습니다.");
        }

        System.out.println("\nbefore all deleted : " + dao.getSize());
        System.out.println("게시물 목록을 전부 삭제합니다.");
        dao.removeAllBoards();

        System.out.println("after all deleted : " + dao.getSize());
    }
}