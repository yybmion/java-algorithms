public class MostMinNumRe {
    public int[] solution(int[] arr){
        if(arr.length==1) return new int[] {-1};

        //최소값 구하기
        int min=Integer.MAX_VALUE;
        for(int a:arr) if(a<min) min=a;
        // 다른 방법 int min=Arrays.stream(arr).min().getAsInt();
        //return Arrays.stream(arr)
        //            .filter(a->a!=min)
        //           .toArray();
        //최소값 빼고 나머지 배열 만들기
        int[] answer =new int[arr.length-1];
        int index =0;
        for(int a:arr){
            if(a==min) continue;
            answer[index++]=a;
        }
        return answer;
    }
    
}
