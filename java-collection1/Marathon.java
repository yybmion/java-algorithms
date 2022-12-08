// 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

// 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 
// 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

// 입출력 예 (순서대로 참가자,완주자,return)
// ["leo", "kiki", "eden"]	["eden", "kiki"]	"leo"
// ["marina", "josipa", "nikola", "vinko", "filipa"]	["josipa", "filipa", "marina", "nikola"]	"vinko"
// ["mislav", "stanko", "mislav", "ana"]	["stanko", "ana", "mislav"]	"mislav"

import java.util.Hashtable;
import java.util.Map;

class Marathon {
    public String solution(String[] participant, String[] completion){
        Map<String,Integer> map=new Hashtable<>();

        for(String p :participant){
            map.put(p,map.getOrDefault(p, 0)+1);
        }

        for(String c : completion){
            int num1=map.get(c)-1;
            if(num1==0) map.remove(c);
            else map.put(c,num1);
        }

        return map.keySet().iterator().next();
    }
}