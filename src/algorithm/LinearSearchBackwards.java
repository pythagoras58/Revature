package algorithm;

public class LinearSearchBackwards {
    public static void main(String[] args) {
        char letter = 'm';
        // arrayList
        char[] letters = {'a','b','c','d','e','f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r','s', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        System.out.println(findLetter(letter,letters));
    }

    public static int findLetter(char targert, char[] data){
        int results = -1;
        if(data == null){
            return -1;
        }

        for(int i=data.length-1; i>-1; i--){
            char temp = data[i];

            if(temp == targert){
                return i;
            }
        }

        return results;
    }
}
