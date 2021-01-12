public class IntegertoEnglishWords {
    public static void main(String[] args) throws Exception {
        System.out.println(numberToWords(13015));
    }

    public static String numberToWords(int num) {
        
        String numS = Integer.toString(num);

        String words = "", temp = "";
        String[] ones = new String[] {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        String[] tens = new String[] {"", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] tens_ones = new String[] {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety", "Hundred"};
        String[] illions = new String[] {"Thousand", "Million", "Billion", "Trillion"};

        if((numS.charAt(0) - '0') != 0){
            temp = ones[numS.charAt(0) - '0'];
            words = temp;
        }else{
            temp = tens[numS.charAt(0) - '0'];
            words = temp;
        }

        temp = "";
        int n;
        for(int i = numS.length() - 1; i >= 0; i--){

            switch(numS.length() - i){
                case 2:
                case 5:
                case 8:
                case 11:
                    temp = tens_ones[numS.charAt(i) - '0'];
                    break;
                case 3:
                case 6:
                case 9:
                case 12:
                    num = numS.charAt(i) - '0';
                    if(num != 0)
                        temp = ones[num] + " Hundred";
                    break;
                case 4:
                    temp = ones[numS.charAt(i) - '0'] + " Thousand";
                    break;
                case 7:
                    temp = ones[numS.charAt(i) - '0'] + " Million";
                    break;
                case 10:
                    temp = ones[numS.charAt(i) - '0'] + " Billion";
                    break;
                case 13:
                    temp = ones[numS.charAt(i) - '0'] + " Trillion";
                    break;
                default:
                    break;
            }

            words = temp + " " + words;
            
        }

        return words;
    }
}