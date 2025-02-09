package RecursiveVSIterativeFibonacciComputation;

public class RecursiveVSIterativeFibonacciComputation {
    public static int fibonacciByRecursion(int number){
        if(number==1)return 1;
        if(number==0)return 0;
        int element = fibonacciByRecursion(number-1)+fibonacciByRecursion(number-2);

        return element;
    }

    public static int fibonacciIterative(int number) {
        int first = 0, second = 1, sum;
        for (int i = 2; i <= number; i++) {
            sum = first + second;
            first = second;
            second = sum;
        }
        return second;
    }


    public static void main(String[] args) {
        long startTime=System.nanoTime();
        fibonacciByRecursion(10);
        long endTime = System.nanoTime();
        System.out.println("Time taken to find an element in Fibonacci Series using Recursion : "+(endTime-startTime)+" ms\n");

        startTime=System.nanoTime();
        fibonacciIterative(10);
        endTime=System.nanoTime();
        System.out.println("Time taken to find an element in Fibonacci Series using Iteration : "+(endTime-startTime)+" ms");
    }
}
