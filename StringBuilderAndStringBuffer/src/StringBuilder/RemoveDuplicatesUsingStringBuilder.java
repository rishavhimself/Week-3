// StringBuilder Package
package StringBuilder;
//Import Hashset from util package
import java.util.HashSet;
//Main class
public class RemoveDuplicatesUsingStringBuilder {
    //Main method
    public static void main(String[] args) {
        // Primary String
        String string = "asdasasfmsaofniofefencoan";
        //Create Hashset for removing duplicate
        HashSet<Character> hashSet = new HashSet<>();

        StringBuilder stringBuilder = new StringBuilder();

        //Loop to iterate the String
        for(int i=0;i<string.length();i++){
            if(!hashSet.contains(string.charAt(i))) {
                //Insert characters of string in hashset
                hashSet.add(string.charAt(i));
                //Update String Builder
                stringBuilder.append(string.charAt(i));
            }
        }
        //Display output
        System.out.print("Given string without duplicates : "+stringBuilder+" ");
        System.out.println();
    }
}
