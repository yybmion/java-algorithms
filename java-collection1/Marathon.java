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