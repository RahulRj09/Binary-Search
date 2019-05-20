package Binarysearcher;

public class BinarySearcher{
    public static int numberChecker(int userInput, int[] numbers, int firstIndex, int lastIndex) {
        if(firstIndex <= lastIndex){
            int middileIndex = (firstIndex + lastIndex) / 2;
            if(numbers[middileIndex] < userInput){
                firstIndex = middileIndex + 1;
            return numberChecker(userInput, numbers, firstIndex, lastIndex);
            }else if (numbers[middileIndex]== userInput){
                return middileIndex;
            }else {
                lastIndex = middileIndex -1;
                return numberChecker(userInput, numbers, firstIndex, lastIndex);
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int userInput = 20;
        int numbers[] = {10,20,30,40,50};
        int lastIndex = numbers.length - 1;
        System.out.println(numberChecker(userInput, numbers, 0, lastIndex));
    }
}



