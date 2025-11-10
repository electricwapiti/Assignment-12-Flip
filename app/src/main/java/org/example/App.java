package org.example;

public class App {
     public static void main(String[] args) {
      Flip f = new Flip();
      System.out.println("Number of Steps (N)\tTrial Number (M)\tFinal Position (D)\tTime Taken (ms)");
      // n = 100, m = 10

      flipAndPrint(f, 100, 10, 0.5);
      flipAndPrint(f, 100, 10, 0.5);
    }

    private static void flipAndPrint(Flip f, int steps, int trials, int prob) {
      for (int i = 0; i < trials; i++) {
          int[] result = f.modelFlips(steps, trials, prob); // single trial
          System.out.printf("%d\t%d\t%d%n", steps, i + 1, result[0]);
          //Compute timing information thru benchmark, then manually create table
          
          // for each combination of steps & trials
          //main fxn -- final output distance
          //benchmark -- avg time over trials


      }
    }
}
