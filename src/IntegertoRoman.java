/** 
 * Given an integer, convert it to a roman numeral.
 * 
 * Runtime: 6 ms, faster than 40.83% of  Java online submissions for Integer to Roman.
 * Memory Usage: 39.3 MB, less than 28.96% of Java online submissions for Integer to Roman.
 * 
 * https://leetcode.com/problems/integer-to-roman/
 * 
 * */ 

public class IntegertoRoman {
   
    public static void main(String[] args) throws Exception{

        System.out.println(intToRoman(20));
    }

    // Time O(log10(n)) | Space O(1)
    public static String intToRoman(int num) {
        

        int place = 10;
        int pop;
        String numRoman = "";

        do{
            pop = num % place;
            place = place * 10;
            num = num - pop;

            String temp = "";
            while(pop >= 1000){
                temp += "M";
                pop -= 1000;
            }

            if(pop >= 900){
                temp += "CM";
                pop -= 900;
            }

            if(pop >= 500){
                temp += "D";
                pop -= 500;
            }

            if(pop >= 400){
                temp += "CD";
                pop -= 400;
            }

            while(pop >= 100){
                temp += "C";
                pop -= 100;
            }

            if(pop >= 90){
                temp += "XC";
                pop -= 90;
            }

            if(pop >= 50){
                temp += "L";
                pop -= 50;
            }

            if(pop >= 40){
                temp += "XL";
                pop -= 40;
            }

            while(pop >= 10){
                temp += "X";
                pop -= 10;
            }

            if(pop >= 9){
                temp += "IX";
                pop -= 9;
            }

            if(pop >= 5){
                temp += "V";
                pop -= 5;
            }

            if(pop >= 4){
                temp += "IV";
                pop -= 4;
            }

            while(pop >= 1){
                temp += "I";
                pop -= 1;
            }

            numRoman = temp + numRoman;
        }while(num > 0);


        return numRoman;
    }
}
