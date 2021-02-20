package Section1;

public class Code01_2 {

    public static void main(String[] args) {
        Person1 first = new Person1();
        first.name = "James";
        first.number = "0001";

        System.out.println(first.name + ", " + first.number); //James, 0001

        Person1 second = first;
        second.name = "Emily";
        System.out.println(first.name + ", " + first.number); //Emily, 0001

        // first 와 second 는 동일한 주소를 참조하게 되기 때문에 first의 값도 당연하게 바뀌게 되는 것

        int[] numbers = new int[10];
        // int는 primitive 타입이지만 numbers는 배열이므로 primitive 타입이 아니다
        // 하지만 정수가 참조로 저장되는게 아닌, 직접 저장되는 한 칸 한 칸은 primitive 타입이다.

        Person1[] persons = new Person1[10];
        persons[0] = first;
        persons[1] = second;

//        다음을 출력하면 NulPointerException이 뜬다. persons[2] 에게 객체 주소를 참조해주지 않았기 때문.
//        persons[2].name = "Sarah";
//        persons[2].number = "0003";
//        System.out.println(persons[2].name + ", " + persons[2].number);

        // 객체를 참조해야지만, 에러가 안뜬다.
        persons[2] = new Person1();
        persons[2].name = "Sarah";
        persons[2].number = "0003";
        System.out.println(persons[2].name + ", " + persons[2].number);


    }
}
