// StringBuffer Package
package StringBuffer;
//Main Class
public class ConcatenateStringsUsingStringBuffer {
    // Main method
    public static void main(String[] args) {
        // String array for concatenation
        String[] strings = {"Hi!,","My ","Name ","is ","Rishav ","Raj ."};
        // Create String Buffer
        StringBuffer stringBuffer = new StringBuffer();
        // Loop for iteration and adding strings in StringBuffer
        for(int i=0;i<strings.length;i++){
            stringBuffer.append(strings[i]); // Add strings in stringBuffer
        }
        //Display result
        System.out.println("Concatenated String : "+stringBuffer);
    }
}
