### New 연산자

> 출처 (https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=heartflow89&logNo=220955262405)

___
new는 클래스 타입의 인스턴스(객체)를 생성해주는 역할을 담당한다. 여기에 조금 더 설명을 붙이면 new 연산자를 통해 메모리(Heap 영역)에 데이터를 저장할 공간을 할당받고 그 공간의 참조값(reference value /해시코드)을 객체에게 반환하여 주고(메모리, 객체 및 인스턴스 포스팅 참고) 이어서 생성자를 호출하게 된다. 인스턴스를 핸들하기 위해서는 new 연산자를 통해 참조값을 저장한 객체로만 접근이 가능하다. 정리하면 아래와 같다.

![image Description](https://mblogthumb-phinf.pstatic.net/MjAxNzAzMTFfOTMg/MDAxNDg5MTYyNjE4NzMw.nJSpcbg3xVNe4lVU_KGM15y1yjySr5eREgRABPi38_8g.kOeoQY8MXUaDEC5x4fXjgi9Qma0M-yHTD0P-_VqiW20g.PNG.heartflow89/image.png?type=w800)

```java
public class NewEx01 {
	public static void main(String[] args) {
		NewExSub nes = null; // NewExSub 타입의 nes 객체 선언
		nes = new NewExSub(); 
        // new : 인스턴스 생성, Heap 메모리 공간 할당, 객체(nes)에게 참조값 리턴
		System.out.println(nes); // 출력 : @15db9742(참조값)
		nes.sum(0, 20); // 객체 참조값 이용 NewExSub의 sum메소드 호출 / 매게변수 전달
	}
}
```