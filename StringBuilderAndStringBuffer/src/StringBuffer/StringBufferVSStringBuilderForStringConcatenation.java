//String Buffer Package
package StringBuffer;
//Main Class
public class StringBufferVSStringBuilderForStringConcatenation {
    //Main method
    public static void main(String[] args) {
        long startTime, endTime;
        // String Array
        String[] strings = {"Hi!,nm,.","My ","Name ","is ","Rishav ","Raj ."};

        // Testing StringBuilder Performance
        startTime = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        //Outer loop for iterating 100k times
        for(int j=0;j<1000000;j++) {
            //Inner loop for iterating String array
            for (String string : strings) {
                stringBuilder.append(string);
            }
        }
        endTime = System.nanoTime();

        //Display result
        System.out.println("StringBuilder Time: " + (endTime - startTime) + " ns");

        // Testing StringBuffer Performance
        startTime = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        //Outer loop for iterating 100k times
        for(int j=0;j<1000000;j++) {
            //Inner loop for iterating the String array
            for (String string : strings) {
                stringBuffer.append(string);
            }
        }
        endTime = System.nanoTime();

        //Display result
        System.out.println("StringBuffer Time: " + (endTime - startTime) + " ns");
    }

}
