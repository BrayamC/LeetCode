public class ReverseString {
    public static void main(String[] args) throws Exception{

        char[] temp = new char[3];
        temp[0] = 'a';
        temp[1] = 'b';
        temp[2] = 'c';
        reverseString(temp);
    }

    public static void reverseString(char[] s) {
    
        char temp;
        int i = s.length - 1;
        int j = 0;

        while(i > j && i != j){
            temp = s[i];
            s[i] = s[j++];
            s[j] = temp;
        }
    
    }

}
