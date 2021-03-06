class Solution {
    public int tribonacci(int n) {
        if(n <= 1) return n;
        else if (n == 2) return 1;
        else{
            int a = 0, b = 1, c = 1, d;
            while(n-- > 2){
                d = a + b + c;
                a = b;
                b = c;
                c = d;
            }
            return c;
        }
    }
}