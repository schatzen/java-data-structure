package Section1;

public class Code01 {

    public static void main(String[] args) {
        Person1 first = new Person1();
        first.name = "James";
        first.number = "0001";

        System.out.println(first.name + ", " + first.number);
    }

    // count 라는 이름의 변수가 만들어지고 그 안에 정수값 0이 저장된다.
    // 하지만, first의 경우 변수가 만들어지지만 그 안에 사람 이름과 전화번호가 저장되지 않는다.
    // 변수 first 에는 그 객체의 주소(참조)를 저장할 수 있다.

    // Person1 first : 객체는 생성되지 않고 변수 first만 만들어진다. 변수의 값 = null
    // first = new Person1(); : Person1 객체가 만들어지고 first에 그 주소를 저장

    // 요약 : 모든 프리미티브 타입의 변수는 보통 변수이다. 즉 변수 자체에 값이 저장 됨.
    // 프리미티브 타입이 아닌 모든 변수는 참조 변수이다.
    // 즉 실제 데이터가 저장될 "객체"는 new 명령으로 따로 만들어야하고, 참조변수엔 객체의 주소가 저장됨


}
