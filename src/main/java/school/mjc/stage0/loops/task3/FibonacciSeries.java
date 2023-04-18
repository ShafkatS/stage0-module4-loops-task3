package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
           int numberOne = 1;
           int numberTwo = 1;
           int numberThree = 0;
           int getSumNumbersOneAndTwo;
         System.out.print(numberThree + " " + numberOne + " " + numberTwo + " ");
        for (int i = 4; i <= lastFibonacci; i++) {
            getSumNumbersOneAndTwo = numberOne + numberTwo;
            System.out.print(getSumNumbersOneAndTwo + " ");
            numberOne = numberTwo;
            numberTwo = getSumNumbersOneAndTwo;
    }
}
