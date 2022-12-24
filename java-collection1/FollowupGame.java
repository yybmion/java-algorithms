// 입력되는 단어가 순서대로 배치될 때 끝말잇기로 끝까지 이어지는지 확인하세요.
// 끝말잇기는 사용했던 단어가 다시 사용되면 안됩니다.
// 단어의 첫 글자는 앞 단어의 마지막 글자로 시작되어야 합니다.
// (단, 첫 단어의 첫 글자는 확인하지 않습니다.)

// 입력1: ["tank", "kick", "know", "wheel", "land", "dream"]
// 출력1: true

// 단어의 연결이 모두 이어지고, 중복되는 단어가 없었습니다.

// 입력2: ["tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"]
// 출력2: false

// 사용되었던 tank 단어가 다시 사용되었습니다.
import java.util.*;

public class FollowupGame {
    public boolean solution(String[] words){
        Set<String> set= new HashSet<>();

        set.add(words[0]);
        char last= words[0].charAt(words[0].length()-1);

        for(int i=1;i<words.length;i++){
            String w = words[i];
            char first=w.charAt(0);
            if(last!=first) return false;
            if(!set.add(words[i])) return false;

            last= w.charAt(w.length()-1);
        }

        return true;
    }
}
