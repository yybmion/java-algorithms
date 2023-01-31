// 문제 설명
// 두 개의 단어 begin, target과 단어의 집합 words가 있습니다. 아래와 같은 규칙을 이용하여 begin에서 
// target으로 변환하는 가장 짧은 변환 과정을 찾으려고 합니다.

// 1. 한 번에 한 개의 알파벳만 바꿀 수 있습니다.
// 2. words에 있는 단어로만 변환할 수 있습니다.
// 예를 들어 begin이 "hit", target가 "cog", words가 
// ["hot","dot","dog","lot","log","cog"]라면 "hit" -> "hot" -> "dot" -> "dog" -> "cog"와 같이 4단계를 거쳐 변환할 수 있습니다.

// 두 개의 단어 begin, target과 단어의 집합 words가 매개변수로 주어질 때, 최소 몇 단계의 과정을 거쳐 
// begin을 target으로 변환할 수 있는지 return 하도록 solution 함수를 작성해주세요.
// 입출력 예
// begin	target	words	                                   return
// "hit"	"cog"	["hot", "dot", "dog", "lot", "log", "cog"]	4
// "hit"	"cog"	["hot", "dot", "dog", "lot", "log"]	        0

import java.util.*;

public class WordConvert {

    class Word{
        String word;
        int depth;
        Word(String w, int d){ 
            word = w;
            depth = d;
        };
    }
    public int solution(String begin, String target, String[] words){
        if(!Arrays.asList(words).contains(target)) return 0;
        
        // DFS
        Set<String> used = new HashSet<>();

        Stack<Word> stack = new Stack<>();
        stack.add(new Word(begin, 0));
        while(!stack.isEmpty()){
            Word now = stack.pop();

            if(now.word.equals(target)){
                return now.depth;
            }
                for (String w : words) {
                    //한 글자만 다른 단어 
                    //사용하지 않은 단어
                    if(!changable(now.word,w)) continue;
                    if(used.contains(w)) continue;

                    used.add(w);
                    stack.push(new Word(w,now.depth+1));
            }
        }

        return 0;
    }

    boolean changable(String w1, String w2){
        int len = Math.min(w1.length(),w2.length());
        int count = 0;
        for(int i =0; i<len && count <2 ; i++){
            if(w1.charAt(i)!=w2.charAt(i)) count++;
        }
        return count ==1;
    }
}
