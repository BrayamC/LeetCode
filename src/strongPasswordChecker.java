class strongPasswordChecker{

    public static void main(String[] args) throws Exception {
        System.out.println(passwordChecker("a"));
    }

    public static int passwordChecker(String password){
      
        int insertChars = 0;
        int deleteChars = 0;

        // 6 <= size <= 20?
        if(password.length() < 6){
            insertChars = 6 - password.length();
        }else if(password.length() > 20){
            deleteChars = password.length() - 20;
        }
        
        // Count how many times three characters were repeated

        // Digit?
        
        // Upper?
        
        // lower?
    }
    }
}