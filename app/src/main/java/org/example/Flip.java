package org.example;

import java.util.Random;

/**
 * Simple utility to simulate biased coin flips.
 * Provides a method to run a single trial (n flips) and a method
 * to run multiple trials (m trials) returning the number of heads
 * per trial.
 */
public class Flip {

    private final Random rng = new Random();

    /**
     * Simulate a single trial of n biased coin flips and return number of heads.
     * @param n number of flips
     * @param p probability of heads (0.0 - 1.0)
     * @return number of heads observed
     */
    public int simulateHeads(int n, double p) {
        int heads = 0;
        for (int i = 0; i < n; i++) {
            if (rng.nextDouble() < p) {
                heads++;
            }
        }
        return heads;
    }

    /**
     * Run m independent trials of n flips with probability p and return an array
     * with the head counts for each trial.
     */
    public int[] runTrials(int n, int m, double p) {
        int[] results = new int[m];
        for (int t = 0; t < m; t++) {
            results[t] = simulateHeads(n, p);
        }
        return results;
    }
}
