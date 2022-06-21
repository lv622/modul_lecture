package programers;

import java.util.*;

public class twonumber {
    public static void main(String[] args){
        int[] numbers = {2,1,3,4,1};

        System.out.println(solution2(numbers));
    }

    public static ArrayList<Integer> solution(int[] numbers) { // 테스트케이스 5, 6
        ArrayList<Integer> sum = new ArrayList<Integer>();
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        for(int i = 0; i < numbers.length - 1; i++){
            for(int j = i + 1; j < numbers.length; j++){
                sum.add(numbers[i] + numbers[j]);
            }
        }

        sum.sort(null);
        sum.add(null);

        for(int i = 0; i < sum.size()-1; i++){
            if(sum.get(i) != sum.get(i+1)){
                answer.add(sum.get(i));
            }
        }
        
        return answer;
    }

    public static ArrayList<Integer> solution1(int[] numbers) { // 테스트케이스 6, 7
        ArrayList<Integer> sum = new ArrayList<Integer>();
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        for(int i = 0; i < numbers.length -1; i++){
            for(int j = i + 1; j < numbers.length; j++){
                sum.add(numbers[i] + numbers[j]);
            }
        }

        sum.sort(null);
        sum.add(null);

        for(int i = 0; i < sum.size()-1; i++){
            if(sum.get(i) != sum.get(i+1)){
                answer.add(sum.get(i));
            }
        }
        
        return answer;
    }

    public static TreeSet<Integer> solution2(int[] numbers) { // TreeSet
        TreeSet<Integer> answer = new TreeSet<Integer>();
        
        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                answer.add(numbers[i] + numbers[j]);
            }
        }

        return answer;
    }

    public static ArrayList<Integer> solution3(int[] numbers) { // HashSet
        HashSet<Integer> sum = new HashSet<Integer>();
        
        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                sum.add(numbers[i] + numbers[j]);
            }
        }

        ArrayList<Integer> answer = new ArrayList<Integer>(sum);
        Collections.sort(answer);

        return answer;
    }
}
