### Queue

## FIFO 주고, 제일 먼저 저장한 것을 제일 먼저 꺼냅니다.

***

큐 메서드

add
 Queue에 객체를 저장합니다. 

성공하면 true, 실패하면 false를 반환합니다.

element
 삭제없이 저장된 요소를 읽어옵니다. peek와 다른 점은 queue가 비었을 때 Exception을 발생시킵니다. (peek()는 null을 반환합니다.) 

offer
 Queue에 객체를 저장합니다. 성공하면 true, 실패하면 false를 반환합니다.

peek
 삭제없이 읽어옵니다. Queue가 비었을 때 null을 반환합니다.

poll
 Queue에서 꺼내옵니다. 비어있으면 null을 반환합니다.

remove
 Queue에서 꺼내옵니다. 비어있으면 예외를 발생시킵니다.