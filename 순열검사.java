import java.util.Arrays;


// 길이가 n인 배열에 1부터 n까지 숫자가 중복 없이 한 번씩 들어 있는지를 확인하려고 합니다.

// 1부터 n까지 숫자가 중복 없이 한 번씩 들어 있는 경우 true를, 

// 아닌 경우 false를 반환하도록 함수 solution을 완성해주세요.

public class 순열검사 {
    public boolean solution(int[] arr){
        int[] answer =new int[arr.length];
        for(int i=0; i<arr.length;i++) answer[i]=i+1;

        Arrays.sort(arr);

        return Arrays.equals(answer, arr);
    }
}
