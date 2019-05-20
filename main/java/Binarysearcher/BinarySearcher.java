package Binarysearcher;

public class BinarySearcher{
    public static int numberChecker(int userInput, int[] numbers, int firstIndex, int lastIndex) {
        if(firstIndex <= lastIndex){
            int middileIndex = (firstIndex + lastIndex) / 2;
            if(numbers[middileIndex] < userInput){
                return numberChecker(userInput, numbers, middileIndex+1, lastIndex);
            }else if (numbers[middileIndex]== userInput){
                return middileIndex;
            }else {
                return numberChecker(userInput, numbers, middileIndex-1, lastIndex);
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int userInput = 60;
        int numbers[] = {10,20,30,40,50};
        int lastIndex = numbers.length - 1;
        System.out.println(numberChecker(userInput, numbers, 0, lastIndex));
    }
}



