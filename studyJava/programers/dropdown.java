package programers;

public class dropdown { //나누어 떨어지는 수
    public static void main(String[] args){
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;

        System.out.println(solution(arr, divisor));
    }

    public static int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % divisor == 0){
                answer[i] = 1;
            }
            System.out.println(arr[i]);
        }



        
        return answer;
    }
}
