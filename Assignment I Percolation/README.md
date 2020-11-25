Score: 95/100

```
ASSESSMENT SUMMARY

Compilation:  FAILED (0 errors, 2 warnings)
API:          PASSED

SpotBugs:     PASSED
PMD:          FAILED (2 warnings)
Checkstyle:   FAILED (0 errors, 45 warnings)

Correctness:  38/38 tests passed
Memory:       8/8 tests passed
Timing:       20/20 tests passed

Aggregate score: 95.00%
[Compilation: 5%, API: 5%, SpotBugs: 0%, PMD: 0%, Checkstyle: 0%, Correctness: 60%, Memory: 10%, Timing: 20%]

ASSESSMENT DETAILS

The following files were submitted:
----------------------------------
3.5K Nov 25 01:42 Percolation.java
2.1K Nov 25 01:42 PercolationStats.java


********************************************************************************
*  COMPILING                                                                    
********************************************************************************


% javac Percolation.java
*-----------------------------------------------------------
Percolation.java:84: warning: [deprecation] connected(int,int) in WeightedQuickUnionUF has been deprecated
        return myFinder2.connected(VTOP, row*myGrid.length + col);
                        ^
Percolation.java:94: warning: [deprecation] connected(int,int) in WeightedQuickUnionUF has been deprecated
        return myFinder.connected(VTOP, VBOTTOM);
                       ^
2 warnings

% javac PercolationStats.java
*-----------------------------------------------------------


================================================================


Checking the APIs of your programs.
*-----------------------------------------------------------
Percolation:

PercolationStats:

================================================================


********************************************************************************
*  CHECKING STYLE AND COMMON BUG PATTERNS                                       
********************************************************************************


% spotbugs *.class
*-----------------------------------------------------------


================================================================


% pmd .
*-----------------------------------------------------------
Percolation.java:44: There appears to be a spurious semicolon. [EmptyStatementNotInLoop]
PercolationStats.java:6: The private instance (or static) variable 'stats' can be made 'final'; it is initialized only in the declaration or constructor. [ImmutableField]
PMD ends with 2 warnings.


================================================================


% checkstyle *.java
*-----------------------------------------------------------
[WARN] Percolation.java:8:23: The instance variable 'VTOP' must start with a lowercase letter and use camelCase. [MemberName]
[WARN] Percolation.java:9:23: The instance variable 'VBOTTOM' must start with a lowercase letter and use camelCase. [MemberName]
[WARN] Percolation.java:12:30: '{' is not preceded with whitespace. [WhitespaceAround]
[WARN] Percolation.java:13:9: 'if' is not followed by whitespace. [WhitespaceAround]
[WARN] Percolation.java:22:47: '{' is not preceded with whitespace. [WhitespaceAround]
[WARN] Percolation.java:23:9: 'if' is not followed by whitespace. [WhitespaceAround]
[WARN] Percolation.java:24:9: 'if' is not followed by whitespace. [WhitespaceAround]
[WARN] Percolation.java:29:39: '{' is not preceded with whitespace. [WhitespaceAround]
[WARN] Percolation.java:30:9: 'if' is not followed by whitespace. [WhitespaceAround]
[WARN] Percolation.java:30:32: '{' is not preceded with whitespace. [WhitespaceAround]
[WARN] Percolation.java:38:9: 'if' is not followed by whitespace. [WhitespaceAround]
[WARN] Percolation.java:38:30: '{' is not preceded with whitespace. [WhitespaceAround]
[WARN] Percolation.java:41:13: 'if' is not followed by whitespace. [WhitespaceAround]
[WARN] Percolation.java:41:25: '{' is not preceded with whitespace. [WhitespaceAround]
[WARN] Percolation.java:44:14: Are you sure you want an empty statement here? An empty statement might indicate a superfluous semicolon. [EmptyStatement]
[WARN] Percolation.java:45:13: 'if' is not followed by whitespace. [WhitespaceAround]
[WARN] Percolation.java:46:13: 'if' is not followed by whitespace. [WhitespaceAround]
[WARN] Percolation.java:46:61: '{' is not preceded with whitespace. [WhitespaceAround]
[WARN] Percolation.java:50:13: 'if' is not followed by whitespace. [WhitespaceAround]
[WARN] Percolation.java:50:63: '{' is not preceded with whitespace. [WhitespaceAround]
[WARN] Percolation.java:54:13: 'if' is not followed by whitespace. [WhitespaceAround]
[WARN] Percolation.java:54:63: '{' is not preceded with whitespace. [WhitespaceAround]
[WARN] Percolation.java:58:13: 'if' is not followed by whitespace. [WhitespaceAround]
[WARN] Percolation.java:58:63: '{' is not preceded with whitespace. [WhitespaceAround]
[WARN] Percolation.java:66:44: '{' is not preceded with whitespace. [WhitespaceAround]
[WARN] Percolation.java:67:9: 'if' is not followed by whitespace. [WhitespaceAround]
[WARN] Percolation.java:67:32: '{' is not preceded with whitespace. [WhitespaceAround]
[WARN] Percolation.java:77:44: '{' is not preceded with whitespace. [WhitespaceAround]
[WARN] Percolation.java:78:9: 'if' is not followed by whitespace. [WhitespaceAround]
[WARN] Percolation.java:78:32: '{' is not preceded with whitespace. [WhitespaceAround]
[WARN] Percolation.java:88:35: '{' is not preceded with whitespace. [WhitespaceAround]
[WARN] Percolation.java:93:32: '{' is not preceded with whitespace. [WhitespaceAround]
[WARN] PercolationStats.java:9:47: '{' is not preceded with whitespace. [WhitespaceAround]
[WARN] PercolationStats.java:10:9: 'if' is not followed by whitespace. [WhitespaceAround]
[WARN] PercolationStats.java:12:9: 'for' is not followed by whitespace. [WhitespaceAround]
[WARN] PercolationStats.java:12:40: '{' is not preceded with whitespace. [WhitespaceAround]
[WARN] PercolationStats.java:28:25: '{' is not preceded with whitespace. [WhitespaceAround]
[WARN] PercolationStats.java:33:27: '{' is not preceded with whitespace. [WhitespaceAround]
[WARN] PercolationStats.java:38:33: '{' is not preceded with whitespace. [WhitespaceAround]
...
Checkstyle ends with 0 errors and 41 warning.

% custom checkstyle checks for Percolation.java
*-----------------------------------------------------------
[WARN] Percolation.java:1: We recommend defining at least one private helper method, e.g., to validate the row and column indices or to map from 2D to 1D indices. [Design]
[WARN] Percolation.java:84:26: Do not call 'connected(p, q)'; it is deprecated. Instead, use 'find(p) == find(q)'. [IllegalMethodCall]
[WARN] Percolation.java:94:25: Do not call 'connected(p, q)'; it is deprecated. Instead, use 'find(p) == find(q)'. [IllegalMethodCall]
Checkstyle ends with 0 errors and 3 warnings.

% custom checkstyle checks for PercolationStats.java
*-----------------------------------------------------------
[WARN] PercolationStats.java:1:1: The constant '1.96' appears more than once. Define a constant variable (such as 'CONFIDENCE_95') to hold the constant '1.96'. [NumericLiteralCount]
Checkstyle ends with 0 errors and 1 warning.


================================================================


********************************************************************************
*  TESTING CORRECTNESS
********************************************************************************

Testing correctness of Percolation
*-----------------------------------------------------------
Running 21 total tests.

Tests 1 through 7 create a Percolation object using your code, then repeatedly
open sites by calling open(). After each call to open(), it checks the return
values of isOpen(), percolates(), numberOfOpenSites(), and isFull() in that order.
Tests 12 through 15 create a Percolation object using your code, then repeatedly
call the methods open(), isOpen(), isFull(), percolates(), and, numberOfOpenSites()
in random order with probabilities p = (p1, p2, p3, p4, p5). The tests stop
immediately after the system percolates.

Tests 18 through 21 test backwash.

Except as noted, a site is opened at most once.

Test 1: open predetermined list of sites using file inputs
  * filename = input6.txt
  * filename = input8.txt
  * filename = input8-no.txt
  * filename = input10-no.txt
  * filename = greeting57.txt
  * filename = heart25.txt
==> passed

Test 2: open random sites until the system percolates
  * n = 3
  * n = 5
  * n = 10
  * n = 10
  * n = 20
  * n = 20
  * n = 50
  * n = 50
==> passed

Test 3: open predetermined sites for n = 1 and n = 2 (corner case test)
  * filename = input1.txt
  * filename = input1-no.txt
  * filename = input2.txt
  * filename = input2-no.txt
==> passed

Test 4: check predetermined sites with long percolating path
  * filename = snake13.txt
  * filename = snake101.txt
==> passed

Test 5: open every site
  * filename = input5.txt
==> passed

Test 6: open random sites until the system percolates,
        allowing open() to be called on a site more than once
  * n = 3
  * n = 5
  * n = 10
  * n = 10
  * n = 20
  * n = 20
  * n = 50
  * n = 50
==> passed

Test 7: open random sites with large n
  * n = 250
  * n = 500
  * n = 1000
  * n = 2000
==> passed

Test 8: call methods with invalid arguments
  * n = 10, (row, col) = (-1, 5)
  * n = 10, (row, col) = (11, 5)
  * n = 10, (row, col) = (0, 5)
  * n = 10, (row, col) = (5, -1)
  * n = 10, (row, col) = (5, 11)
  * n = 10, (row, col) = (5, 0)
  * n = 10, (row, col) = (-2147483648, -2147483648)
  * n = 10, (row, col) = (2147483647, 2147483647)
==> passed

Test 9: call constructor with invalid argument
  * n = -10
  * n = -1
  * n = 0
==> passed

Test 10: create multiple Percolation objects at the same time
        (to make sure you didn't store data in static variables)
==> passed

Test 11: open predetermined list of sites using file inputs,
         but permute the order in which methods are called
  * filename = input8.txt;  order =     isFull(),     isOpen(), percolates()
  * filename = input8.txt;  order =     isFull(), percolates(),     isOpen()
  * filename = input8.txt;  order =     isOpen(),     isFull(), percolates()
  * filename = input8.txt;  order =     isOpen(), percolates(),     isFull()
  * filename = input8.txt;  order = percolates(),     isOpen(),     isFull()
  * filename = input8.txt;  order = percolates(),     isFull(),     isOpen()
==> passed

Test 12: call open(), isOpen(), and numberOfOpenSites()
         in random order until just before system percolates
  * n = 3, trials = 40, p = (0.4, 0.4, 0.0, 0.0, 0.3)
  * n = 5, trials = 20, p = (0.4, 0.4, 0.0, 0.0, 0.3)
  * n = 7, trials = 10, p = (0.4, 0.4, 0.0, 0.0, 0.3)
  * n = 10, trials = 5, p = (0.4, 0.4, 0.0, 0.0, 0.3)
  * n = 20, trials = 2, p = (0.4, 0.4, 0.0, 0.0, 0.3)
  * n = 50, trials = 1, p = (0.4, 0.4, 0.0, 0.0, 0.3)
==> passed

Test 13: call open() and percolates() in random order until just before system percolates
  * n = 3, trials = 40, p = (0.5, 0.0, 0.0, 0.5, 0.0)
  * n = 5, trials = 20, p = (0.5, 0.0, 0.0, 0.5, 0.0)
  * n = 7, trials = 10, p = (0.5, 0.0, 0.0, 0.5, 0.0)
  * n = 10, trials = 5, p = (0.5, 0.0, 0.0, 0.5, 0.0)
  * n = 20, trials = 2, p = (0.5, 0.0, 0.0, 0.5, 0.0)
  * n = 50, trials = 1, p = (0.5, 0.0, 0.0, 0.5, 0.0)
==> passed

Test 14: call open() and isFull() in random order until just before system percolates
  * n = 3, trials = 40, p = (0.5, 0.0, 0.5, 0.0, 0.0)
  * n = 5, trials = 20, p = (0.5, 0.0, 0.5, 0.0, 0.0)
  * n = 7, trials = 10, p = (0.5, 0.0, 0.5, 0.0, 0.0)
  * n = 10, trials = 5, p = (0.5, 0.0, 0.5, 0.0, 0.0)
  * n = 20, trials = 2, p = (0.5, 0.0, 0.5, 0.0, 0.0)
  * n = 50, trials = 1, p = (0.5, 0.0, 0.5, 0.0, 0.0)
==> passed

Test 15: call all methods in random order until just before system percolates
  * n = 3, trials = 40, p = (0.2, 0.2, 0.2, 0.2, 0.2)
  * n = 5, trials = 20, p = (0.2, 0.2, 0.2, 0.2, 0.2)
  * n = 7, trials = 10, p = (0.2, 0.2, 0.2, 0.2, 0.2)
  * n = 10, trials = 5, p = (0.2, 0.2, 0.2, 0.2, 0.2)
  * n = 20, trials = 2, p = (0.2, 0.2, 0.2, 0.2, 0.2)
  * n = 50, trials = 1, p = (0.2, 0.2, 0.2, 0.2, 0.2)
==> passed

Test 16: call all methods in random order until almost all sites are open
         (with inputs not prone to backwash)
  * n = 3
  * n = 5
  * n = 7
  * n = 10
  * n = 20
  * n = 50
==> passed

Test 17: substitute WeightedQuickUnionUF data type that sets root nondeterministically;
         call all methods in random order until almost all sites are open
         (with inputs not prone to backwash)
  * n = 3
  * n = 5
  * n = 7
  * n = 10
  * n = 20
  * n = 50
==> passed

Test 18: check for backwash with predetermined sites
  * filename = input20.txt
  * filename = input10.txt
  * filename = input50.txt
  * filename = jerry47.txt
  * filename = sedgewick60.txt
  * filename = wayne98.txt
==> passed

Test 19: check for backwash with predetermined sites that have
         multiple percolating paths
  * filename = input3.txt
  * filename = input4.txt
  * filename = input7.txt
==> passed

Test 20: call all methods in random order until all sites are open
         (these inputs are prone to backwash)
  * n = 3
  * n = 5
  * n = 7
  * n = 10
  * n = 20
  * n = 50
==> passed

Test 21: substitute WeightedQuickUnionUF data type that sets root nondeterministically;
         call all methods in random order until all sites are open
         (these inputs are prone to backwash)
  * n = 3
  * n = 5
  * n = 7
  * n = 10
  * n = 20
  * n = 50
==> passed


Total: 21/21 tests passed!


================================================================
********************************************************************************
*  TESTING CORRECTNESS (substituting reference Percolation)
********************************************************************************

Testing correctness of PercolationStats
*-----------------------------------------------------------
Running 17 total tests.

Test 1: check formatting of output of main()
  % java-algs4 PercolationStats 20 10
  mean                    = 0.579250
  stddev                  = 0.042558
  95% confidence interval = [0.552872, 0.605628]

  % java-algs4 PercolationStats 200 100
  mean                    = 0.594132
  stddev                  = 0.009753
  95% confidence interval = [0.592220, 0.596043]

==> passed

Test 2: check that methods in PercolationStats do not print to standard output
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
==> passed

Test 3: check that mean() returns value in expected range
  * n =   2, trials = 10000
  * n =   5, trials = 10000
  * n =  10, trials = 10000
  * n =  25, trials = 10000
==> passed

Test 4: check that stddev() returns value in expected range
  * n =   2, trials = 10000
  * n =   5, trials = 10000
  * n =  10, trials = 10000
  * n =  25, trials = 10000
==> passed

Test 5: check that PercolationStats constructor creates
        trials Percolation objects, each of size n-by-n
  * n =  15, trials =  15
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
==> passed

Test 6: check that PercolationStats.main() creates
        trials Percolation objects, each of size n-by-n
  * n =  15, trials =  15
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
==> passed

Test 7: check that PercolationStats calls open() until system percolates
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
==> passed

Test 8: check that PercolationStats does not call open() after system percolates
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
==> passed

Test 9: check that mean() is consistent with the number of intercepted calls to open()
        on blocked sites
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
==> passed

Test 10: check that stddev() is consistent with the number of intercepted calls to open()
         on blocked sites
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
==> passed

Test 11: check that confidenceLo() and confidenceHigh() are consistent with mean() and stddev()
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
==> passed

Test 12: check that exception is thrown if either n or trials is out of bounds
  * n = -23, trials =  42
  * n =  23, trials =   0
  * n = -42, trials =   0
  * n =  42, trials =  -1
  * n = -2147483648, trials = -2147483648
==> passed

Test 13: create two PercolationStats objects at the same time and check mean()
         (to make sure you didn't store data in static variables)
  * n1 =  50, trials1 =  10, n2 =  50, trials2 =   5
  * n1 =  50, trials1 =   5, n2 =  50, trials2 =  10
  * n1 =  50, trials1 =  10, n2 =  25, trials2 =  10
  * n1 =  25, trials1 =  10, n2 =  50, trials2 =  10
  * n1 =  50, trials1 =  10, n2 =  15, trials2 = 100
  * n1 =  15, trials1 = 100, n2 =  50, trials2 =  10
==> passed

Test 14: check that the methods return the same value, regardless of
         the order in which they are called
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
==> passed

Test 15: check that no calls to StdRandom.setSeed()
  * n = 20, trials = 10
  * n = 20, trials = 10
  * n = 40, trials = 10
  * n = 80, trials = 10
==> passed

Test 16: check distribution of number of sites opened until percolation
  * n = 2, trials = 100000
  * n = 3, trials = 100000
  * n = 4, trials = 100000
==> passed

Test 17: check that each site is opened the expected number of times
  * n = 2, trials = 100000
  * n = 3, trials = 100000
  * n = 4, trials = 100000
==> passed


Total: 17/17 tests passed!


================================================================
********************************************************************************
*  MEMORY (substituting reference Percolation)
********************************************************************************

Analyzing memory of PercolationStats
*-----------------------------------------------------------
Running 4 total tests.

Test 1a-1d: check memory usage as a function of T trials for n = 100
            (max allowed: 8*T + 128 bytes)

                 T        bytes
--------------------------------------------
=> passed       16          176         
=> passed       32          304         
=> passed       64          560         
=> passed      128         1072         
==> 4/4 tests passed


Estimated student memory = 8.00 T + 48.00   (R^2 = 1.000)

Total: 4/4 tests passed!


================================================================



********************************************************************************
*  TIMING (substituting reference Percolation)
********************************************************************************

Timing PercolationStats
*-----------------------------------------------------------
Running 4 total tests.

Test 1: Call PercolationStats constructor and instance methods and
        count calls to StdStats.mean() and StdStats.stddev().
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
==> passed

Test 2: Call PercolationStats constructor and instance methods and
        count calls to methods in StdRandom.
  * n = 20, trials = 10
  * n = 20, trials = 10
  * n = 40, trials = 10
  * n = 80, trials = 10
==> passed

Test 3: Call PercolationStats constructor and instance methods and
        count calls to methods in Percolation.
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
==> passed

Test 4: Call PercolationStats constructor and instance methods with trials = 3
        and values of n that go up by a multiplicative factor of sqrt(2).
        The test passes when n reaches 2,896.

     The approximate order-of-growth is n ^ (log ratio)

         n  seconds log ratio
     ------------------------
       724     0.16       2.5
      1024     0.37       2.4
      1448     1.06       3.0
      2048     2.48       2.5
      2896     6.51       2.8
==> passed


Total: 4/4 tests passed!


================================================================



********************************************************************************
*  MEMORY
********************************************************************************

Analyzing memory of Percolation
*-----------------------------------------------------------
Running 4 total tests.

Test 1a-1d: check that total memory <= 17 n^2 + 128 n + 1024 bytes

                 n        bytes
--------------------------------------------
=> passed       64        71984         
=> passed      256      1122608         
=> passed      512      4473136         
=> passed     1024     17858864         
==> 4/4 tests passed


Estimated student memory = 17.00 n^2 + 32.00 n + 304.00   (R^2 = 1.000)


Test 2 (bonus): check that total memory <= 11 n^2 + 128 n + 1024 bytes
   -  failed memory test for n = 64
==> FAILED


Total: 4/4 tests passed!


================================================================



********************************************************************************
*  TIMING
********************************************************************************

Timing Percolation
*-----------------------------------------------------------
Running 16 total tests.

Test 1a-1e: Creates an n-by-n percolation system; open sites at random until
            the system percolates, interleaving calls to percolates() and open().
            Count calls to connected(), union() and find().

                                       2 * connected()
                 n       union()              + find()        constructor
-----------------------------------------------------------------------------------
=> passed       16          344                   290                   2         
=> passed       32         1458                  1216                   2         
=> passed       64         6036                  4966                   2         
=> passed      128        22198                 19022                   2         
=> passed      256        89490                 76408                   2         
=> passed      512       373023                312356                   2         
=> passed     1024      1484890               1247718                   2         
==> 7/7 tests passed


If one of the values in the table violates the performance limits
the factor by which you failed the test appears in parentheses.
For example, (9.6x) in the union() column indicates that it uses
9.6x too many calls.


Tests 2a-2f: Check whether the number of calls to union(), connected(), and find()
             is a constant per call to open(), isOpen(), isFull(), and percolates().
             The table shows the maximum number of union() and find() calls made
             during a single call to open(), isOpen(), isFull(), and percolates().
             One call to connected() counts as two calls to find().

                 n     per open()      per isOpen()    per isFull()    per percolates() 
---------------------------------------------------------------------------------------------
=> passed       16        8               0               2               2         
=> passed       32        8               0               2               2         
=> passed       64        8               0               2               2         
=> passed      128        8               0               2               2         
=> passed      256        8               0               2               2         
=> passed      512        8               0               2               2         
=> passed     1024        8               0               2               2         
==> 7/7 tests passed



Running time (in seconds) depends on the machine on which the script runs.


Test 3: Create an n-by-n percolation system; interleave calls to percolates()
        and open() until the system percolates. The values of n go up by a
        factor of sqrt(2). The test is passed if n >= 4096 in under 10 seconds.

     The approximate order-of-growth is n ^ (log ratio)

                        log   union-find     log
         n  seconds   ratio   operations   ratio
     -------------------------------------------
      1024     0.16     2.8      4222978     2.0
      1448     0.44     3.0      8466254     2.0
      2048     1.13     2.7     16672070     2.0
      2896     3.01     2.8     33360878     2.0
      4096     6.35     2.2     67045800     2.0
==> passed



Test 4: Create an n-by-n percolation system; interleave calls to open(),
        percolates(), isOpen(), isFull(), and numberOfOpenSites() until.
        the system percolates. The values of n go up by a factor of sqrt(2).
        The test is passed if n >= 4096 in under 10 seconds.

                        log   union-find     log
         n  seconds   ratio   operations   ratio
     -------------------------------------------
       724     0.13     2.5      2691696     2.0
      1024     0.29     2.4      5405262     2.0
      1448     0.77     2.9     10883596     2.0
      2048     1.43     1.8     21689190     2.0
      2896     3.09     2.2     43319462     2.0
      4096     6.88     2.3     87066676     2.0
==> passed


Total: 16/16 tests passed!


================================================================

```
