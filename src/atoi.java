public class atoi {
    public static void main(String[] args) throws Exception {
        System.out.println(myAtoi("-2147483649"));
    }

    public static int myAtoi(String s) {
               
        int num = 0;
        int i = 0;
        int sign = 1;

        if(s.equals("")) return 0;
        
        // Skip white spaces
        while(i < s.length() && s.charAt(i) == ' '){
            i++;
        }

        // Return 0 if first charcter is not a number or -/+
        if(i >= s.length()) {
            return 0;
        }
        
        // Check that first char is -/+
        if(s.charAt(i) == '-'){
            sign =  -1;
            i++;
        }else if(s.charAt(i) == '+'){
            i++;
        }

        // Return 0 if first charcter is not a number or -/+
        if(i >= s.length() || s.charAt(i) > 57 || s.charAt(i) < 48 ) {
            return 0;
        }

        // loop through numbers until another character is found
        while(i < s.length()){
            if(s.charAt(i) <= 57 && s.charAt(i) >= 48){
                
                // Check for positive overflow
                if(sign == 1 && (num > Integer.MAX_VALUE / 10 || 
                        (num == Integer.MAX_VALUE / 10 && (s.charAt(i) - '0') > 7))) 
                    return Integer.MAX_VALUE;

                // Check for negative overflow
                if(sign == -1 && (((num * -1) < Integer.MIN_VALUE / 10) || 
                        ((num * -1)== Integer.MIN_VALUE / 10 && ((s.charAt(i) - '0') * -1) < -8)))
                    return Integer.MIN_VALUE;

                // Add number to interger
                num = num * 10 + (s.charAt(i) - '0');
            }

            // Check if next character is not a number
            if(s.charAt(i) > 57 || s.charAt(i) < 48){
                return num * sign;
            }
            i++;
        }
        return num * sign; 
    
    }
}
