
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

// 주어진 입력중 최대값을 구하고, 최대값이 이 위치하는 index 값의 목록을 반환하세요.

// 입력:
// [1, 3, 5, 4, 5, 2, 1]

// 입력된 목록의 최대값은 5입니다.
// 5와 동일한 값을 가진 위치는 3번째, 5번째 위치 입니다.
// 이 위치에 해당하는 index는 [2, 4] 입니다.

// 출력:
// [2, 4]

public class 최대값 {
    //첫번째 방법
    public int[] solution(int[] arr){
        int max=0;
        for(int a : arr) if(a>max) max=a;
        int count =0;
        for(int a: arr) if (a==max) count++;
        int[] answer=new int[count];
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max) answer[index++]=i;
        }  
        return answer;
    }
    //두번째 방법
    public int[] solution2(int[] arr){
        int max=0;
        for(int a : arr) if(a>max) max=a;
        List<Integer> list=new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max) list.add(i);
        }
        int[] answer =new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        return answer;
    }

    //세번째 방법
    public int[] solution3(int[] arr){
        int max=Arrays.stream(arr).max().getAsInt();

        return IntStream.range(0, arr.length)
                .filter(i->arr[i]==max)
                .toArray();
    }
}

   

