package programers;

import java.util.*;

public class makePrimeNum {
    public static void main(String[] args) {
        // int[] nums = {1,2,3,4};
        int[] nums = {1,2,7,6,4};

        System.out.println(solution1(nums));
    }

    //ArrayList
    public static int solution(int[] nums) {
        ArrayList<Integer> sum = new ArrayList<Integer>();
        
        for (int i = 0; i < nums.length -2; i++){
            for (int j = i + 1; j < nums.length -1; j++){
                for (int k = j + 1; k < nums.length; k++){
                    sum.add(nums[i] + nums[j] + nums[k]);

                    System.out.println("i: " + i + " j: " + j + " k: " + k);
                }
            }
        }

        System.out.println("sum: " + sum);

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < sum.size(); i++){
            int count = 0;

            for(int j = 1; j <= sum.get(i); j++){
                if (sum.get(i) % j == 0){
                    count++;
                }
            }

            if (count == 2){
                result.add(sum.get(i));
            }
        }

        int answer = result.size();

        return answer;
    }

    //배열 없이
    public static int solution1(int[] nums) {
        int sum = 0;
        int answer = 0;
        
        for (int i = 0; i < nums.length -2; i++){
            for (int j = i + 1; j < nums.length -1; j++){
                for (int k = j + 1; k < nums.length; k++){
                    sum = nums[i] + nums[j] + nums[k];

                    int count = 0;
                    for (int n = 2; n < sum; n++){
                        if (sum % n == 0){
                            count++;
                        }
                    }

                    if (count == 0){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}