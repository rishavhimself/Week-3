package StringConcatenation;

public class PerformanceComparison {
    public static void main(String[] args) {
        String string = "R";

        String newString="";
        long startTime = System.nanoTime();
        for(int i=0;i<1000;i++){
            newString+=string;
        }
        long endTime = System.nanoTime();
        System.out.println("Time taken for Concatenation of 1000 String in Strings :"+(endTime-startTime)+" ms");

        newString ="";
        startTime = System.nanoTime();
        for(int i=0;i<10000;i++){
            newString+=string;
        }
        endTime = System.nanoTime();
        System.out.println("Time taken for Concatenation of 10000 String in Strings :"+(endTime-startTime)+" ms");

        newString="";
        startTime = System.nanoTime();
        for(int i=0;i<100000;i++){
            newString+=string;
        }
        endTime = System.nanoTime();
        System.out.println("Time taken for Concatenation of 100000 String in Strings :"+(endTime-startTime)+" ms\n");

        StringBuffer stringBuffer = new StringBuffer();
        startTime = System.nanoTime();
        stringBuffer.append(string.repeat(1000));
        endTime = System.nanoTime();
        System.out.println("Time taken for Concatenation of 1000 String in StringBuffer :"+(endTime-startTime)+" ms");

        stringBuffer.delete(0,stringBuffer.length());
        stringBuffer.append(string.repeat(10000));
        endTime = System.nanoTime();
        System.out.println("Time taken for Concatenation of 10000 String in StringBuffer :"+(endTime-startTime)+" ms");

        stringBuffer.delete(0,stringBuffer.length());
        stringBuffer.append(string.repeat(100000));
        endTime = System.nanoTime();
        System.out.println("Time taken for Concatenation of 1000 String in StringBuffer :"+(endTime-startTime)+" ms\n");

        StringBuilder stringBuilder = new StringBuilder();
        startTime=System.nanoTime();
        stringBuilder.append(string.repeat(1000));
        endTime = System.nanoTime();
        System.out.println("Time taken for Concatenation of 1000 String in StringBuilder :"+(endTime-startTime)+" ms");

        stringBuilder.delete(0,stringBuilder.length());
        startTime=System.nanoTime();
        stringBuilder.append(string.repeat(10000));
        endTime = System.nanoTime();
        System.out.println("Time taken for Concatenation of 10000 String in StringBuilder :"+(endTime-startTime)+" ms");

        stringBuilder.delete(0,stringBuilder.length());
        startTime=System.nanoTime();
        stringBuilder.append(string.repeat(100000));
        endTime = System.nanoTime();
        System.out.println("Time taken for Concatenation of 100000 String in StringBuilder :"+(endTime-startTime)+" ms");


    }
}
