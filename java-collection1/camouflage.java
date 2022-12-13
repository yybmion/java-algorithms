// 스파이들은 매일 다른 옷을 조합하여 입어 자신을 위장합니다.

// 예를 들어 스파이가 가진 옷이 아래와 같고 오늘 스파이가 동그란 안경, 긴 코트, 
// 파란색 티셔츠를 입었다면 다음날은 청바지를 추가로 입거나 동그란 안경 대신 검정 선글라스를 착용하거나 해야 합니다.

// [["yellow_hat", "headgear"], ["blue_sunglasses", "eyewear"], ["green_turban", "headgear"]]	return 5
// [["crow_mask", "face"], ["blue_sunglasses", "face"], ["smoky_makeup", "face"]]	return 3

// 예제 #1
// headgear에 해당하는 의상이 yellow_hat, green_turban이고 
// eyewear에 해당하는 의상이 blue_sunglasses이므로 아래와 같이 5개의 조합이 가능합니다.

// 1. yellow_hat
// 2. blue_sunglasses
// 3. green_turban
// 4. yellow_hat + blue_sunglasses
// 5. green_turban + blue_sunglasses

import java.util.*;
class camouflage{
    public int solution(String[][] clothes){

        Map<String,Integer> cloth=new HashMap<>();
        for(String[] c: clothes){
            String str1=c[1];
            cloth.put(str1, cloth.getOrDefault(str1, 0)+1);
            // 결과 무엇을 넣었느냐? (headgear,2),(eyewear,1) 이거 넣은거랑 같음
        }

        int answer=1;
        var iter=cloth.values().iterator();
        while(iter.hasNext()){
            answer*=iter.next()+1;
        }

        return answer-1;
    }

}