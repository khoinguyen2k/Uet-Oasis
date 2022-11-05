// Import your library
// Do not change the name of the Solution class
public class Solution {
/**
* fibonacci.
*/
public long fibonacci(long n) {
if (n < 0) {
return -1;
}
if (n <= 1) {
return n;
}
int m = (int) n;
long[] f = new long[m + 1];
f[0] = 0;
f[1] = 1;
for (int i = 2; i <= m; i++) {
f[i] = f[i - 1] + f[i - 2];
if (f[i] < 0) {
return Long.MAX_VALUE;
}
}
return f[m];
}

}  