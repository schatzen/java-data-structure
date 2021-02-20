package section02;

public class Code18 {

    public static void main(String[] args) {

        int[] nums = new int[3];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;

        // nums와 data는 둘 다 동일한 배열을 가리키고 있다.
        // 따라서 bubbleSort를 통해 값이 변경되면 main 메소드 안에 있는 nums의 값도 바뀌게 된다.
        bubbleSort(nums);
        System.out.println(nums[2]);
    }

    public static void bubbleSort(int[] data) {

        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] <= data[i + 1]) {
                int value = data[i];
                data[i] = data[i + 1];
                data[i + 1] = value;
            }
        }
    }
}
