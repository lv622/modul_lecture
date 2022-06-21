package programers;

import java.util.ArrayList;
import java.util.Arrays;

class Choosetwo {
    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 4, 1};

        System.out.println(Arrays.toString(solution(numbers)));
    }

    public static int[] solution(int[] numbers) {
        ArrayList<Integer> sum = new ArrayList<Integer>();

        for(int i = 0; i<numbers.length-1; i++) {
            for(int j = i+1; j<numbers.length; j++){
                if(!sum.contains(numbers[i] + numbers[j])){
                    sum.add(numbers[i] + numbers[j]);
                }
            }
        }

        int[] answer = new int[sum.size()];

        for(int i = 0; i<sum.size(); i++){
            answer[i] = sum.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }
}
