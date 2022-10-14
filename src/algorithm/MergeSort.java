package algorithm;

public class MergeSort {
    public static void main(String[] args) {
        char letter = 'm';
        // arrayList
        char[] letters = {'a','b','c','d','e','f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r','s', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

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
}
