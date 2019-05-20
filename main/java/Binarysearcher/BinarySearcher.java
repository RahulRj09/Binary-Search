package Binarysearcher;

public class BinarySearcher{
    public static String numberChecker(int userInput, int[] listOfNumbers, int firstIndex, int lastIndex) {
        if(firstIndex <= lastIndex){
            int middileIndex = (firstIndex + lastIndex) / 2;
            if(listOfNumbers[middileIndex] < userInput){
                firstIndex = middileIndex + 1;
            return numberChecker(userInput, listOfNumbers, firstIndex, lastIndex);
            }else if (listOfNumbers[middileIndex]== userInput){
                return "Element is found at index: "+middileIndex;
            }else {
                lastIndex = middileIndex -1;
                return numberChecker(userInput, listOfNumbers, firstIndex, lastIndex);
            }
        }
        return "Element is not found!";
    }

    public static void main(String[] args){
        int userInput = Integer.parseInt(args[0]);
        int listOfNumbers[] = {10,20,30,40,50};
        int firstIndex = 0;
        int lastIndex = listOfNumbers.length - 1;
        System.out.println(numberChecker(userInput, listOfNumbers, firstIndex, lastIndex));
    }

}



