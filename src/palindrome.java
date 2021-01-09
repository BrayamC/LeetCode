public class palindrome {
    public static void main(String[] args) throws Exception {
        System.out.println(isPalindrome(767));
    }

    // T(n) = O(log10(n)), since input is divided by 10 every iteration
    public static boolean isPalindrome(int x) {
            
        boolean pali = false;
        if (x < 0) return pali;
        
        // Reverse pos interger
        int pop;
        int rev = 0;
        
        int num = x;
        while(num > 0){
            pop = num % 10;
            num /= 10;
            rev = rev * 10 + pop;
        }
        
        System.out.println(rev);
        System.out.println(x);

        if(rev == x){
            System.out.println("equals");
        }
        pali = (num == x) ? true : false;

        return pali;
    }
}