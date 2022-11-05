// Import your library
// Do not change the name of the Solution class
public class Solution {
/** find gdc. */
public static int gcd(int a, int b) {
int c = Math.max(a, b);
int d = Math.min(a, b);
while (d != 0) {
int tmp = d;
d = c % d;
c = tmp;
}
return Math.abs(c);
}
}  