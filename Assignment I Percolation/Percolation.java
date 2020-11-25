import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {
    private final boolean[][] myGrid;
    private final WeightedQuickUnionUF myFinder;
    private final WeightedQuickUnionUF myFinder2;
    private int myOpenCount;
    private final int VTOP;
    private final int VBOTTOM;

    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n){
        if(n <= 0) throw new IllegalArgumentException("Not valid size");
        myGrid = new boolean[n][n];
        myOpenCount = 0;
        myFinder = new WeightedQuickUnionUF(n*n+2);
        myFinder2 = new WeightedQuickUnionUF(n*n+1);
        VTOP = n*n;
        VBOTTOM = n*n + 1;
    }

    private boolean inBounds(int row, int col){
        if(row <= 0 || row > myGrid.length) return false;
        if(col <= 0 || col > myGrid[0].length) return false;
        return true;
    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col){
        if(!inBounds(row, col)){
            throw new IllegalArgumentException(
                    String.format("(%d,%d) not in bounds", row, col));
        }
        int row1 = row;
        int col1 = col;
        row--;
        col--;
        if(!myGrid[row][col]){
            myGrid[row][col] = true;
            myOpenCount++;
            if(row == 0){
                myFinder2.union(VTOP, col);
                myFinder.union(VTOP, col);
            };
            if(row == myGrid.length - 1) myFinder.union(VBOTTOM, row*myGrid.length + col);
            if(inBounds(row1, col1+1) && myGrid[row][col+1]){
                myFinder.union(row * myGrid.length + col, row * myGrid.length + col + 1);
                myFinder2.union(row*myGrid.length + col, row*myGrid.length + col+1);
            }
            if(inBounds(row1, col1 - 1) && myGrid[row][col-1]){
                myFinder.union(row * myGrid.length + col, row * myGrid.length + col - 1);
                myFinder2.union(row*myGrid.length + col, row*myGrid.length + col-1);
            }
            if(inBounds(row1 - 1, col1) && myGrid[row-1][col]){
                myFinder.union(row * myGrid.length + col, (row - 1) * myGrid.length + col);
                myFinder2.union(row*myGrid.length + col, (row-1)*myGrid.length + col);
            }
            if(inBounds(row1 + 1, col1) && myGrid[row+1][col]){
                myFinder.union(row * myGrid.length + col, (row + 1) * myGrid.length + col);
                myFinder2.union(row*myGrid.length + col, (row+1)*myGrid.length + col);
            }
        }
    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col){
        if(!inBounds(row, col)){
            throw new IllegalArgumentException(
                    String.format("(%d,%d) not in bounds", row, col));
        }
        row--;
        col--;
        return myGrid[row][col];
    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col){
        if(!inBounds(row, col)){
            throw new IllegalArgumentException(
                    String.format("(%d,%d) not in bounds", row, col));
        }
        row--;
        col--;
        return myFinder2.connected(VTOP, row*myGrid.length + col);
    }

    // returns the number of open sites
    public int numberOfOpenSites(){
        return myOpenCount;
    }

    // does the system percolate?
    public boolean percolates(){
        return myFinder.connected(VTOP, VBOTTOM);
    }
}
