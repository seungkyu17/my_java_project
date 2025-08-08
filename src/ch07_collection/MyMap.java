package ch07_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMap {
    public static void main(String[] args) {
        Map<String, Integer> teamMap = new HashMap<String, Integer>();

        teamMap.put("lg", 1);
        teamMap.put("ssg", 2);
        teamMap.put("두산", 3);
        teamMap.put("kt", 4);

        String findItem = "nc";
        boolean bool = teamMap.containsKey(findItem);
        System.out.println(findItem + "팀이 목록에 있나요? " + bool);

        //'nc' 팀이 존재하는 지 체크하고, 없으면 순위 5위로 추가해 주세요.
        findItem = "nc";
        if (teamMap.containsKey(findItem) == false) {
            teamMap.put(findItem, 5);
        }

        //순위가 6위인 팀이 존재하는지 체크하고, 존재하지 않으면 'kia'를 추가해 주세요.
        //그리고 존재 여부를 적절한 문구로 출력해 주세요.
        final int pos = 6; //순위

        findItem = "nc";
        if (teamMap.containsValue(pos) == true) {
            System.out.println(pos + "위 팀은 존재합니다.");
        } else {
            System.out.println(pos + "위 팀은 존재하지 않아서 추가합니다.");
            teamMap.put("kia", pos);
        }

        String[] teams = {"롯데", "한화", "키움", "삼성"};
        for (int i = 0; i < teams.length; i++){
            teamMap.put(teams[i], i + 7);
        }

        findItem = "한화";
        Integer rank = teamMap.get(findItem);

        if(rank == null){
            System.out.println(findItem + "팀은 존재하지 않습니다.");
        }else{
            String message = "팀명 : " + findItem + ", 순위 : " + rank;
            System.out.println(message);
        }

        System.out.println("다음 팀들의 순위 정보를 출력해 주세요.");
        String[] findTeams = {"두산", "kt", "빙그레"};

        for(String one : findTeams){
            rank = teamMap.get(one);

            if(rank != null) {
                String message = "팀명 : " + findItem + ", 순위 : " + rank;
                System.out.println(message);
            }else{
                System.out.println(one + "팀이 존재하지 않아서 추가합니다.");
                teamMap.put(one, 11);
            }
        }
        System.out.println("전체 목록을 출력해 봅니다.");
        Set<String> items = teamMap.keySet();

        for(String key : items) {
            String message = key + " 팀은 순위가 " + teamMap.get(key) + "위입니다.";
            System.out.println(message);
        }

        System.out.println("요소 크기 : " + teamMap.size());
        System.out.println(teamMap.toString());

        teamMap.clear();

        if(teamMap.isEmpty()){
            System.out.println("teamMap is emprty");
        }else{
            System.out.println("teamMap is not empry");
        }
    }
}