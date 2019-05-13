public class BinarySearcher{
    private static void numberChecker(int userInput) {
        int listOfNumbers[] = {10,20,30,40,50};
        int firstIndex = 0;
        int lastIndex = listOfNumbers.length - 1;
        while (firstIndex <= lastIndex){
            int middileIndex = (firstIndex + lastIndex) / 2;
            if(listOfNumbers[middileIndex] < userInput){
                firstIndex = middileIndex + 1;
            }else if (listOfNumbers[middileIndex]== userInput){
                System.out.println("Element is found at index: "+middileIndex);
                break;
            }else {
                lastIndex = middileIndex -1;
            }
        }
        if(firstIndex > lastIndex){
            System.out.println("Element is not found!");
        }

    }

    public static void main(String[] args){
        int userInput = Integer.parseInt(args[0]);
        numberChecker(userInput);
    }

}




