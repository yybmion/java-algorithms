import java.util.HashMap;
import java.util.Map;

public class pokemon {
    public int solution(int[] nums){

    // 포켓몬의 종류의 개수를 구한다.
     Map<Integer,Integer> map=new HashMap<>();
     for (int n : nums){
        map.put(n,0);
     }

     int n1=map.keySet().size();
     // 배열 크기의 1/2를 구한다.
     int n2=nums.length /2 ;

     //최소값을 선택한다.
    return Math.min(n1,n2);
    }
}
