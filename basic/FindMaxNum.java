package basic;

public class FindMaxNum {

    public static void main(String[] args) {
        // Q. 다음과 같이 숫자로 이루어진 배열이 있을 때, 이 배열 내에서 가장 큰 수를 반환하시오.
        int[] numbers = {1, 100, 500, 2, 10};

        int maxNumber = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (maxNumber < numbers[i]) {
                maxNumber = numbers[i];
            }
        }

        System.out.println("max number is " + maxNumber);
    }

}
