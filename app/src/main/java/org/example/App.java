package org.example;

import java.util.Arrays;

public class App {

  public static void main(String[] args) {
    Flip f = new Flip();

    // Acceptance criteria: at least five different n values, three p values, m = 10
    int[] nValues = {100, 200, 500, 1000, 5000};
    double[] pValues = {0.25, 0.5, 0.75};
    int m = 10; // trials per (n,p)

    // Print header
    System.out.println("n\tp\ttrial\theads\tmean_heads\tstddev_heads");

    for (double p : pValues) {
      for (int n : nValues) {
        int[] heads = f.runTrials(n, m, p);

        // compute mean and stddev
        double mean = Arrays.stream(heads).average().orElse(Double.NaN);
        double variance = 0.0;
        for (int h : heads) {
          double diff = h - mean;
          variance += diff * diff;
        }
        variance = variance / heads.length;
        double stddev = Math.sqrt(variance);

        // print each trial row
        for (int t = 0; t < heads.length; t++) {
          System.out.printf("%d\t%.2f\t%d\t%d\t%.2f\t%.2f%n", n, p, t + 1, heads[t], mean, stddev);
        }
      }
    }

    // Short summary printed to separate the output
    System.out.println("\nSimulation complete. Ran " + pValues.length + " p-values x " + nValues.length + " n-values x " + m + " trials each.");
  }
}
