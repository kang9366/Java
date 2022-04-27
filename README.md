# Java

#### Attributes of OOP
1. 다형성(Polymorphism) : 한 메소드나 클래스가 다양한 방식으로 동작하는 것
2. 상속(Inheritance) : 
3. 캡슐화(Encapsulation) : 
4. 추상화(Abstraction) : 


오버라이딩(Overriding) : 상속받은 함수를 그대로 사용하지 않고 재정의하여 사용\
오버로딩(Overloading) : 같은 기능의 함수에 같은 이름을 사용할 수 있음


### Buffer로 입력받기
```java
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int n = Integer.parseInt(br.readLine());
```
* 각 값의 경계는 엔터만 인식 가능
* Scanner에 비해 입출력 속도가 빠르다.
* 입력받은 데이터는 String으로 인식되기 때문에 다른 자료형으로 쓸 경우 형변환 필수
