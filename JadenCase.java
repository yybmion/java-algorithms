// 문제 설명
// JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다. 단, 첫 문자가 알파벳이 아닐 때에는 이어지는 알파벳은 소문자로 쓰면 됩니다. (첫 번째 입출력 예 참고)
// 문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.

// 제한 조건
// s는 길이 1 이상 200 이하인 문자열입니다.
// s는 알파벳과 숫자, 공백문자(" ")로 이루어져 있습니다.
// 숫자는 단어의 첫 문자로만 나옵니다.
// 숫자로만 이루어진 단어는 없습니다.
// 공백문자가 연속해서 나올 수 있습니다.
// 입출력 예
//         s	                   return
// "3people unFollowed me"	"3people Unfollowed Me"
// "for the last week"	"For The Last Week"

public class JadenCase {
    public String solution(String s){
        StringBuilder sb = new StringBuilder();

        String s2=s.toLowerCase();
        char last=' ';
        for(char c:s2.toCharArray()){
            if(last==' ') c=Character.toUpperCase(c);
            sb.append(c);
            last=c;
        }
        return sb.toString();
    }
}

// StringBuilder 란???

// 자바에서 String 객체는 변경 불가능하다. 한 번 생성되면 내용을 바꿀 수 없단 뜻이다. 따라서 하나의 문자열을 다른 문자열과 연결하면 새 문자열이 생성되고, 이전 문자열은 가비지 컬렉터로 들어간다.

// 100만 개의 문자열을 연결해야 하는 상황이 왔다고 가정하자. 그리고 100만 개의 문자열을 추가로 생성했다고 하자.
// 문자열끼리 연결하는 작업 시에는 내부적으로 여러 작업이 발생하고, 기존 문자열 값의 길이에 추가된 문자열의 크기를 더한 크기의 새로운 문자열이 생성된다.
// 이걸 100만 번 수행해야 하니 메모리를 많이 잡아먹게 되는 건 어찌보면 그렇게 되겠구나 싶다.

// 이 경우 고려해볼 수 있는 것 중 하나가 이 포스팅의 주제인 StringBuilder다. 
// Stirng은 변경 불가능한 문자열을 생성하지만 StringBuilder는 변경 가능한 문자열을 만들어 주기 때문에, String을 합치는 작업 시 하나의 대안이 될 수 있다.

// public class Main
// {
//     public static void main(String[] args)
//     {
//         StringBuilder stringBuilder = new StringBuilder();
//         ArrayList<String> list = new ArrayList<>();
//         list.add("첫 번째, ");
//         list.add("두 번째, ");
//         list.add("세 번째, ");
//         list.add("네 번째, ");
//         list.add("다섯 번째");
//         for (int i = 0; i < list.size(); i++)
//         {
//             stringBuilder.append(list.get(i));
//         }
//         System.out.println(stringBuilder);
//     }

// }
// // >> 첫 번째, 두 번째, 세 번째, 네 번째, 다섯 번째

// 먼저 StringBuilder의 객체를 생성한 후, append()의 인자로 연결하고자 하는 문자열을 넣어서 StringBuilder의 객체를 통해 호출한다. 
// 그리고 출력 시에는 toString()을 붙여야 하고, String 변수에 넣을 때도 마찬가지다.

 
