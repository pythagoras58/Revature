package algorithm;

public class LinearSearch {
    public static void main(String[] args) {

        // arrayList
        char[] letters = {'a','b','c','d','e','f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r','s', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        char letter = 'm';

        // method calling
        System.out.println(findLetter(letter, letters));
    }

    public static int findLetter(char targert, char[] data){
        int results = -1;

        for(int i=0; i<data.length; i++){
            char temp = data[i];

            if(temp == targert){
                return i;
            }
        }

        return results;
    }
}
