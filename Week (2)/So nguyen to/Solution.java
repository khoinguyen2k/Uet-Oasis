// Import your library
// Do not change the name of the Solution class
public class Solution {
// Type your main code here

/** check if n is a prime number or not. */
public static boolean isPrime(int n) {
if (n <= 1) {
return false;
}
for (int i = 2; i * i <= n; i++) {
if (n % i == 0) {
return false;
}
}
return true;
}
}    