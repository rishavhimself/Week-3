package LinearSearch;

public class LinearSearch {
    public static int firstNegativeNumber(int [] array){
        for(int i=0;i<array.length;i++) {
            if (array[i] <0)return i;
        }
        return -1;
    }

    public static int indexOfWord(String[] words, String specificWord) {
        for (int i=0;i<words.length;i++) {
            String [] subWords = words[i].split(" ");
            for (int j = 0; j < subWords.length; j++) {
                if (subWords[j].equals(specificWord)) return i;
            }
        }
        return -1;
    }
}
