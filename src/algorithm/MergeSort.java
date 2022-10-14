package algorithm;

public class MergeSort {
    public static void main(String[] args) {
        char letter = 'm';
        // arrayList
        char[] letters = {'a','b','c','d','e','f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r','s', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        System.out.println(findLetterFromMiddle(letter,letters));
    }

    public static int findIndx(char target, char[] data){

        int results = -1;
        if(data == null) {
            System.out.println("Data is null");
            return -1;
        }

        for(int i=0; i<data.length; i++){
            char temp = data[i];
            if(temp == target){
                return i;
            }
        }
        return results;
    }

    public static int findIndexBackwards(char target, char[] data){
        int result = -1;

        if(data == null){
            System.out.println("DATA IS NULL");
            return -1;
        }

        for(int i= data.length -1; i>-1; i--){
            char temp = data[i];
            if(temp == target){
                return i;
            }
        }

        return result;
    }

    public static int findLetterFromMiddle(char target, char[] data){
        if(data == null){
            System.out.println("DATA IS NULL");
            return -1;
        }

        //data spliting
        char[] firstPart = new char[data.length / 2];
        char[] secondPart = new char[data.length - data.length/2];

        System.out.println("[FIRST PART]--> " + firstPart.length);
        System.out.println("[SECOND PART]--> " + secondPart.length);

        // first array
        for(int i=0; i< firstPart.length; i++){
            firstPart[i] = data[i];
        }

        // second array
        for(int i =0; i < secondPart.length; i++){
            secondPart[i] = data[i];
        }

        // perform searching
        int firstRes = findIndx(target, firstPart);
        int secondRes = findIndexBackwards(target, secondPart);

        //comparison
        if(firstRes > -1)
            return firstRes;
        else if (secondRes > -1)
            return secondRes + firstPart.length;
        else
            return -1;

    }
}
