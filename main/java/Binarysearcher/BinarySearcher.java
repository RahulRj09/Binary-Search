package Binarysearcher;

import java.util.Arrays;
import java.util.List;

public class BinarySearcher {
    public static <T extends Comparable<T>> int elementFinder(T userInput, List<T> elements, int firstIndex, int lastIndex) {
        if (firstIndex <= lastIndex) {
            int middileIndex = (firstIndex + lastIndex) / 2;
            if (elements.get(middileIndex).equals(userInput)) {
                return middileIndex;
            } else if (elements.get(middileIndex).compareTo(userInput) < 0) {
                return elementFinder(userInput, elements, middileIndex + 1, lastIndex);
            }
            return elementFinder(userInput, elements, 0, middileIndex - 1);
        }
        return -1;
    }

    public static void main(String[] args) {
        int userInput = 10;
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        int lastIndex = numbers.size() - 1;
        String userInput1 = "c";
        List<String> words = Arrays.asList("a", "b", "c", "d", "e");
        int lastIndex1 = words.size() - 1;
        double userInput2 = 20.2;
        List<Double> decimal = Arrays.asList(10.1, 20.2, 30.3, 40.5);
        int lastIndex2 = numbers.size() - 1;
        System.out.println(elementFinder(userInput, numbers, 0, lastIndex));
        System.out.println(elementFinder(userInput1, words, 0, lastIndex1));
        System.out.println(elementFinder(userInput2, decimal, 0, lastIndex2));
    }
}



