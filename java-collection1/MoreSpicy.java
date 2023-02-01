// 문제 설명
// 매운 것을 좋아하는 Leo는 모든 음식의 스코빌 지수를 K 이상으로 만들고 싶습니다. 
// 모든 음식의 스코빌 지수를 K 이상으로 만들기 위해 Leo는 스코빌 지수가 가장 낮은 두 개의 음식을 아래와 같이 특별한 방법으로 섞어 새로운 음식을 만듭니다.

// 섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)

// Leo는 모든 음식의 스코빌 지수가 K 이상이 될 때까지 반복하여 섞습니다.
// Leo가 가진 음식의 스코빌 지수를 담은 배열 scoville과 원하는 스코빌 지수 K가 주어질 때,
// 모든 음식의 스코빌 지수를 K 이상으로 만들기 위해 섞어야 하는 최소 횟수를 return 하도록 solution 함수를 작성해주세요.

// 입출력 예
// scoville	            K   return
// [1, 2, 3, 9, 10, 12]	7	2
// 입출력 예 설명
// 스코빌 지수가 1인 음식과 2인 음식을 섞으면 음식의 스코빌 지수가 아래와 같이 됩니다.
// 새로운 음식의 스코빌 지수 = 1 + (2 * 2) = 5
// 가진 음식의 스코빌 지수 = [5, 3, 9, 10, 12]

// 스코빌 지수가 3인 음식과 5인 음식을 섞으면 음식의 스코빌 지수가 아래와 같이 됩니다.
// 새로운 음식의 스코빌 지수 = 3 + (5 * 2) = 13
// 가진 음식의 스코빌 지수 = [13, 9, 10, 12]

// 모든 음식의 스코빌 지수가 7 이상이 되었고 이때 섞은 횟수는 2회입니다.
import java.util.*;

public class MoreSpicy {
  public int solution(int[] scoville, int k)  {

    int answer = 0;

    // 힙 사용 - 계속해서 최소값을 구해야할때!!
    Queue<Integer> list = new PriorityQueue<>();
    for (Integer s : scoville) {

        while(list.size()>=2 && list.peek() < k){
            int s1= list.poll();
            int s2 = list.poll();
            int s3 = s1+s2*2;
            list.offer(s3); // 자동으로 노드에서 값을 비교해서 최소값을 맨 위에 둔다.
            answer++;

            // Collections.sort(list);  //여기서 문제가 된다 while 문을 돌 때마다 sort를 해주고 있으니 효율성이 떨어진다.
        }

    }

    if(list.peek()<k) return -1;

        return answer;
  }
}
