import java.util.LinkedList;
import java.util.List;

// 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 
// 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

public class reverseInteger {
    public int[] solution(long n){
        List<Integer> list=new LinkedList<>();

        while(n>0){
            list.add((int)(n%10));
            n/=10;
        }
        
        //리스트를 배열로 return 받고 싶을때
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
