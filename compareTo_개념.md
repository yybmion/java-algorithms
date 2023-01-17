### CompareTo

문자열 기준으로 설명

public int compareTo(String anotherString)
Compares two strings lexicographically. The comparison is based on the Unicode value of each character in the strings. The character sequence represented by this String object is compared lexicographically to the character sequence represented by the argument string. The result is a negative integer if this String object lexicographically precedes the argument string. The result is a positive integer if this String object lexicographically follows the argument string. The result is zero if the strings are equal; compareTo returns 0 exactly when the equals(Object) method would return true.

This is the definition of lexicographic ordering. If two strings are different, then either they have different characters at some index that is a valid index for both strings, or their lengths are different, or both. If they have different characters at one or more index positions, let k be the smallest such index; then the string whose character at position k has the smaller value, as determined by using the < operator, lexicographically precedes the other string. In this case, compareTo returns the difference of the two character values at position k in the two string -- that is, the value:

this.charAt(k)-anotherString.charAt(k)

Returns:
the value 0 if the argument string is equal to this string; a value less than 0 if this string is lexicographically less than the string argument; and a value greater than 0 if this string is lexicographically greater than the string argument.

즉, 두 문자열을 비교한 리턴값이 0 이면 같은 문자열 0보다 작으면 아규먼트보다 작은거 0보다 크면 아규먼트보다 큰거

**이것으로 문자열 정렬을 할 수있다.**  
**사전순으로 정렬**

```java
Arrays.sort(strings,(s1, s2) -> {
            if(s1.charAt(n)==s2.charAt(n)) return s1.compareTo(s2);
            return s1.charAt(n)-s2.charAt(n); -- 이렇게 원하는 방식(특정)으로 정렬 가능
        });
```

String_sort 예제
![description](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FcfyCSI%2Fbtrhgj4CeYg%2Flvq7NQkSsNWpSEN87EV8X0%2Fimg.png)

> 출처(https://sinsucoding.tistory.com/14)


