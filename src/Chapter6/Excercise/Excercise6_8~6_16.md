### 6-8
**내 답 : 2, 5**  
**답 : 2, 5**  
**풀이**  
2번 : 생성자가 객체를 생성하는 것이 아닌 new가 객체를 생성해주는 것이다. 생성자는 객체를 초기화하는 목적으로 사용된다.  
5번 : 오버로딩 가능하다.  

### 6-9
**내 답 : 2**  
**답 : 2**  
**풀이**  
인스턴스 메서드 내에서만 사용 가능하다.  

### 6-10
**내 답 : 3, 4**  
**답 : 3, 4**  
**풀이**  
리턴 타입과 매개변수 이름은 오버로딩과 무관하다.  

### 6-11
**내 답 : 2, 3, 4**  
**답 : 2, 3, 4**  

### 6-12  
**내 답 : 3, 5**  
**답 : 3, 5**  
**풀이**  
3번 : 초기화 블럭이 먼저 초기화된다.  
5번 : 클래스 변수가 먼저 초기화된다.  

### 6-13
**내 답 : 4**  
**답 : 1**   
**풀이**  
인스턴스 변수는 기본값-명시적초기화-초기화블럭-생성자  
클래스 변수는 기본값-명시적초기화-초기화블럭  

### 6-14
**내 답 : 1**  
**답 : 1, 5**   
**풀이**  
1번 : 무조건 초기화 해줘야된다.  
5번 : 힙 영역에 올라가는건 인스턴스 변수이다. 지역변수는 스택에 저장된다.  

### 6-15
**내 답 : 2, 6**  
**답 : 2**   
**풀이**  
모두 종료된 상태가 아닌 대기 상태이다. 같은 맥락으로 6번도 대기 상태기 때문에, 실행중인 메서드는 println 뿐이다.  

### 6-16
**내 답 : ABC123 \ After change:ABC123**  
**답 : ABC123 \ After change:ABC123**   
**풀이**  
change 메소드는 복사본을 만들어서 456이 추가된 "ABC123456" 을 return 해준다.  
하지만 이 반환된 "ABC123456" 은 원본에 영향을 끼치지 않고, 할당된 변수가 없으니 GC에 의해 사라지게 된다.  