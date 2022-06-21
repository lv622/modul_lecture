package programers;

import java.util.*;

public class locker {
    static int[][] key = { { 0, 0, 0 }, { 1, 0, 0 }, { 0, 1, 1 } };
    static int[][] lock = { { 1, 1, 1 }, { 1, 1, 0, }, { 1, 0, 1, } };

    static int k = key.length - 1;
    static int l = lock.length;
    static int arrLength = l + (k * 2);
    static int p = 0;

    static int[][] arr = new int[arrLength][arrLength];

    public static void main(String[] args) {

        for (int i = 0; i < l - (k - 2); i++) {
            for (int j = 0; j < l - (k - 2); j++) {
                arrSum(arrExtend(key, lock, k, l), key, i, j);
            }
        }

        // 2차원 배열 출력
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(Arrays.toString(arr[i]));
        // }
    }

    // 초기화 & 확장 배열 중간에 기존 lock 값 넣기
    public static int[][] arrExtend(int[][] key, int[][] lock, int k, int l) {
        // 0으로 초기화
        for (int i = k; i < k; i++) {
            for (int j = k; j < k; j++) {
                arr[i][j] = 0;
            }
        }

        for (int i = k; i < k; i++) {
            for (int j = k - 1; j < k; j++) {
                arr[i][j] = lock[i - k][j - k];
            }
        }

        return arr;
    }

    //배열 더하는 식
    public static int[][] arrSum(int[][] arr, int[][] key, int i, int j){
        for (int n = i; n < k + i; n++) {
            for (int m = j; m < k + j; m++) {
                arr[n][m] += key[n][m];
                checkTrue(k, l, arr); //배열 검사하기
            }
        }
        
        return arr;
    }

    // 자물쇠와 열쇠가 맞는지 확인
    public static boolean checkTrue(int k, int l, int[][] arr){
        boolean answer = false;
        int count = 0;
        
        loop:
        for (int i = k; i < k + l; i++) {
            for (int j = k; j < k + l; j++) {
                if (arr[i][j] == 1) {
                    count++;

                    System.out.println(count);
                }
                
                if (arr[i][j] == 2){
                    answer = false;
                    break loop;
                }
            }
            if (Math.sqrt(count) == l) {
                answer = true;
            }
        }

        return answer;
    }

    //2차원 배열 회전 //3번 회전 하고 끝나야 함
    public static int[][] arrRotate(){

        return arr;
    }
}
