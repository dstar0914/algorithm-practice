package basic;

import java.util.HashMap;
import java.util.Map;

public class FindMaxOccurredAlphabet {

    public static void main(String[] args) {
        // Q. 다음과 같은 문자열을 입력받았을 때, 어떤 알파벳이 가장 많이 포함되어 있는지 반환하시오. (단 최빈값을 가진 알파벳이 여러개일 경우 알파벳 순서가 가장 앞에 위치한 알파벳을 출력하시오)
        String input = "hello my name is dingcodingco";

        input = input.replaceAll(" ", "");

        Map<Character, Integer> frequencyMap = new HashMap<Character, Integer>();

        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        char maxOccurredAlphabet = Character.MIN_VALUE;
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            char currentChar = entry.getKey();
            int currentCount = entry.getValue();

            if (currentCount > maxCount || (currentCount == maxCount && currentChar < maxOccurredAlphabet)) {
                maxOccurredAlphabet = currentChar;
                maxCount = currentCount;
            }
        }

        System.out.println("max occurred alphabet is " + maxOccurredAlphabet);
    }

}
