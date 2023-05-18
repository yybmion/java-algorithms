### 백준 조합론 
___

> 15439 베라의 패션

> 베라는 상의 N 벌과 하의 N 벌이 있다. i 번째 상의와 i 번째 하의는 모두 색상 i를 가진다. N 개의 색상은 모두 서로 다르다.
상의와 하의가 서로 다른 색상인 조합은 총 몇 가지일까?

**n*(n-1)**

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int answer=0;

        answer=(N-1)*N;

        System.out.println(answer);

    }
}
```

> 24723 녹색거탑

> 녹색거탑의 정상에서 바닥으로 내려오는 경우의 수를 출력한다.

![image](https://github.com/yybmion/java-algorithms/assets/113106136/a34fa972-2a58-488c-9e05-219553f03caf)

![image](https://github.com/yybmion/java-algorithms/assets/113106136/6621c93d-14e3-452f-99cf-6a07038dc130)


- 파스칼의 삼각형

![image](https://github.com/yybmion/java-algorithms/assets/113106136/c3a5cf10-e743-400c-9fef-f476a5765d45)

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int answer=0;

        answer= (int) Math.pow(2,N);

        System.out.println(answer);
    }
}
```

> 10872 팩토리얼

> 첫째 줄에 N!을 출력한다.


```java
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		in.close();
		
		int sum = 1;
        
		// N 이 0이 아닐 때 까지 1씩 감소하면서 sum에 반복적으로 곱해준다
		while(N != 0) {
			sum = sum * N;
			N--;
		}
        
		System.out.println(sum);
		
	}
}
```

> 11050 이항 계수1
> 출처 ( https://st-lab.tistory.com/159 ) 

![image](https://github.com/yybmion/java-algorithms/assets/113106136/c80ed3c7-5d76-4c51-a0a0-87361ec386db)

- (a + b)^n 을 전개하였을 때 계수
![image](https://github.com/yybmion/java-algorithms/assets/113106136/ff33285f-3b59-4504-bf6c-6232b0407aa4)
![image](https://github.com/yybmion/java-algorithms/assets/113106136/f9a46fb2-c3a0-4645-b27c-b98df9134224)

![image](https://github.com/yybmion/java-algorithms/assets/113106136/616b62c2-f0a1-4a87-bb5a-06e368886a59)


![image](https://github.com/yybmion/java-algorithms/assets/113106136/71b859dc-aa1e-4a1d-ac97-833d6bba48ec)

> n = 3 이고, r = 2 라면, a^1*b^2의 계수를 말하는 것이고, 이 때의 계수는 3이다.

 
```java
import java.util.*;
 
class Main {
  public static void main(String[] args) throws Exception {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int k=sc.nextInt();
      int answer=factorial(n)/(factorial(k)*factorial(n-k));
      System.out.println(answer);
      }
  public static int factorial(int n) {
      int total=1;
      for(int i=1;i<=n;i++) {
          total*=i;
      }
      return total;
  }
      }
```

![image](https://github.com/yybmion/java-algorithms/assets/113106136/74d89606-14c4-48e4-bad9-d0d7685fe7e9)

![image](https://github.com/yybmion/java-algorithms/assets/113106136/0cde21ab-84a0-420f-914c-d2a7d546da53)

> 1010 다리놓기

- 예로들어 (1, 2, 3, 4, 5) 에서 (1, 3, 4) 를 뽑았다고 해보자. 이는 (3, 1, 4)이나, (3, 4, 1) 등 순서가 다르게 뽑혀도 조합은 뽑는 순서를 고려하지 않기 때문에 모두 1개의 경우로 보는 것이다.

```java
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		double num1=scanner.nextInt();
		int num2=0;
		int num3=0;
		for(int i=0;i<num1;i++) {
			num2=scanner.nextInt();
			num3=scanner.nextInt();
			
			System.out.printf("%.0f\n",Comb(num3,num2));
		}
		
	}
	public static double Comb(double n3,double n2) {
		double res1=1;
		double res2=1;
		
		for(double j=n3;j>n3-n2;j--) {
			res1*=j;
		}
		
		for(double j=n2;j>0;j--) {
			res2*=j;
		}
		
		return res1/res2;
	}

}
```

