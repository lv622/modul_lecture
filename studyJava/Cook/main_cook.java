package Cook;

import java.util.*;

import Cook.MakeSandwich.Week.*;

public class main_cook {
    // 참고자료
    // arraylist 객체 넣기 https://kkh0977.tistory.com/1057
    // 2차원 arraylist 만들기 https://devyoseph.tistory.com/148

    public static void main(String[] arg) {
        String bread = "빵";
        String butter = "버터";
        String bacon = "베이컨";
        String blueberry = "블루베리";
        String lettuce = "상추";
        String pumpkin = "단호박";
        String egg = "계란";
        String salad = "샐러드";
        String abocado = "아보카도";

        //객체 받는 2차원 ArrayList 생성
        ArrayList<Object>[] arr = new ArrayList[5];

        //각각의 배열 index를 ArrayList로 선언
        for (int i=0; i<arr.length; i++){
            arr[i] = new ArrayList<>();
        }

        //각 번호의 index에 각 객체 추가
        arr[0].add(new Monday("월요일", "블루베리베이컨 샌드위치", bread, butter, bacon, blueberry));
        arr[1].add(new Tuesday("화요일", "상추베이컨 샌드위치", bread, butter, bacon, lettuce));
        arr[2].add(new Wednesday("수요일", "단호박 샌드위치", bread, butter, pumpkin));
        arr[3].add(new Thursday("목요일", "계란샐러드 샌드위치", bread, butter, egg, salad));
        arr[4].add(new Friday("금요일", "계란 아보카도 샌드위치", bread, butter, egg, abocado));

        //객체를 사용해 데이터를 저장한 경우 객체 내부에서 정의된 return 함수를 호출해야 정상적으로 데이터가 출력됨
        System.out.println(((Monday) arr[0].get(0)).printMonday());
        System.out.println(((Tuesday) arr[1].get(0)).printTuesday());
        System.out.println(((Wednesday) arr[2].get(0)).printWednesday());
        System.out.println(((Thursday) arr[3].get(0)).printThursday());
        System.out.println(((Friday) arr[4].get(0)).printFriday());


        // ???
        Object cook[] = new Object[5];

        cook[0] = new Monday("월요일", "블루베리베이컨 샌드위치", bread, butter, bacon, blueberry);
        cook[1] = new Tuesday("화요일", "상추베이컨 샌드위치", bread, butter, bacon, lettuce);

        for(int i=0; i<cook.length; i++){
            System.out.println(cook[i]);
        }
    }
}
