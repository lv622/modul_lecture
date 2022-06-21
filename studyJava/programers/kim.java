package programers;

import java.util.ArrayList;

public class kim {
    public static void main(String[] args){
        System.out.println("Programmers start!");

        ArrayList<String> inputArray = new ArrayList<>();

        inputArray.add("Jane");
        inputArray.add("Kim");

        // System.out.println(inputArray);
        System.out.println(solution(inputArray));
    }

    public static String solution (ArrayList<String> seoul){
        String answer = "";

        for(int i = 0; i < seoul.size(); i++){
            if(seoul.get(i) == "Kim"){
                answer = "김서방은 " + i + "에 있다.";
            }
        }

        return answer;
    }
}
