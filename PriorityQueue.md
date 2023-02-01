## PriorityQueue
___

> 출처(https://velog.io/@gillog/Java-Priority-Queue%EC%9A%B0%EC%84%A0-%EC%88%9C%EC%9C%84-%ED%81%90)

Priority Queue 특징

1. 높은 우선순위의 요소를 먼저 꺼내서 처리하는 구조이다.
우선순위 큐에 들어가는 원소는 비교가 가능한 기준이 있어야한다.

2. 내부 요소는 힙으로 구성되어 이진트리 구조로 이루어져 있다.

3. 내부구조가 힙으로 구성되어 있기에 시간 복잡도는 O(NLogN)이다.

4. 우선순위를 중요시해야 하는 상황에서 주로 쓰인다.

예) add

Priority Queue Add

```java
// add(value) 메서드의 경우 만약 삽입에 성공하면 true를 반환, 
// 큐에 여유 공간이 없어 삽입에 실패하면 IllegalStateException을 발생
priorityQueueLowest.add(1);
priorityQueueLowest.add(10);
priorityQueueLowest.offer(100);

priorityQueueHighest.add(1);
priorityQueueHighest.add(10);
priorityQueueHighest.offer(100);
```

![description](https://velog.velcdn.com/images%2Fgillog%2Fpost%2F7645823c-565c-4ee0-ae47-c8332ef0bc7c%2Fimg1.daumcdn.png)

> remove도 같음


```java
// 첫번째 값을 반환하고 제거 비어있다면 null
priorityQueueLowest.poll();

// 첫번째 값 제거 비어있다면 예외 발생
priorityQueueLowest.remove(); 

// 첫번째 값을 반환만 하고 제거 하지는 않는다.
// 큐가 비어있다면 null을 반환
priorityQueueLowest.peek();

// 첫번째 값을 반환만 하고 제거 하지는 않는다.
// 큐가 비어있다면 예외 발생
priorityQueueLowest.element();

// 초기화
priorityQueueLowest.clear();      
```
