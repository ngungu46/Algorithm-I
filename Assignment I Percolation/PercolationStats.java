import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;

public class PercolationStats {
    private double[] stats;

    // perform independent trials on an n-by-n grid
    public PercolationStats(int n, int trials){
        if(n <= 0 || trials <= 0) throw new IllegalArgumentException("Invalid inputs");
        stats = new double[trials];
        for(int i = 0; i < trials; i++){
            Percolation percolation = new Percolation(n);
            double numberOfOpenedCells = 0;
            while (!percolation.percolates()) {
                int x = StdRandom.uniform(1, n + 1);
                int y = StdRandom.uniform(1, n + 1);
                if (!percolation.isOpen(y, x)) {
                    percolation.open(y, x);
                    numberOfOpenedCells++;
                }
            }
            stats[i] = numberOfOpenedCells/(n*n);
        }
    }

    // sample mean of percolation threshold
    public double mean(){
        return StdStats.mean(stats);
    }

    // sample standard deviation of percolation threshold
    public double stddev(){
        return StdStats.stddev(stats);
    }

    // low endpoint of 95% confidence interval
    public double confidenceLo(){
        return mean() - 1.96*stddev()/Math.sqrt(stats.length);
    }

    // high endpoint of 95% confidence interval
    public double confidenceHi(){
        return mean() + 1.96*stddev()/Math.sqrt(stats.length);
    }

    // test client (see below)
    public static void main(String[] args){
        int gridSize = Integer.parseInt(args[0]);
        int nbTrials = Integer.parseInt(args[1]);
        PercolationStats stats = new PercolationStats(gridSize, nbTrials);
        StdOut.printf("mean                    = %f\n", stats.mean());
        StdOut.printf("stddev                  = %f\n", stats.stddev());
        StdOut.printf("95%% confidence interval = [%f, %f]\n", stats.confidenceLo(), stats.confidenceHi());
    }
}