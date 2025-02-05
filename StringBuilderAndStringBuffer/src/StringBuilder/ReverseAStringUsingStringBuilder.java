//StringBuilder package
package StringBuilder;
//Main class
public class ReverseAStringUsingStringBuilder {
    //Main method
    public static void main(String[] args) {
        // String
        String string = "hello";
        //First StringBuilder
        StringBuilder stringBuilderOne = new StringBuilder();
        // Second StringBuilder
        StringBuilder stringBuilderTwo = new StringBuilder();
        // Reverse String using loop from the end
        for(int i=string.length()-1;i>=0;i--){
            stringBuilderOne.append(string.charAt(i));
        }
        //Display result
        System.out.println(stringBuilderOne);
        // Loop for iterating string from the start
        for(int i=0;i<string.length();i++){
            // Append character of String into StringBuilder
            stringBuilderTwo.append(string.charAt(i));
        }
        //Reverse method
        stringBuilderTwo.reverse();
        //Display method
        System.out.println(stringBuilderTwo);
    }
}
