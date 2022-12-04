import java.util.Arrays;

public class 순열검사 {
    public boolean solution(int[] arr){
        int[] answer =new int[arr.length];
        for(int i=0; i<arr.length;i++) answer[i]=i+1;

        Arrays.sort(arr);

        return Arrays.equals(answer, arr);
    }
}
