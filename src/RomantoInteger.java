import java.util.Hashtable;

public class RomantoInteger {


    public static void main(String[] args) throws Exception {

        int a = 2;
        System.out.println(("ABC").substring(a - 1, (a - 1) + 2));
        System.out.println(myRomantoInteger("IV"));
    }

    public static int myRomantoInteger(String s){
        
        int total = 0;

        Hashtable<String, Integer> h = 
              new Hashtable<String, Integer>();

        h.put("M", 1000);
        h.put("CM", 900);
        h.put("D", 500);
        h.put("CD", 400);
        h.put("C", 100);
        h.put("XC", 90);
        h.put("L", 50);
        h.put("XL", 40);
        h.put("X", 10);
        h.put("IX", 9);
        h.put("V", 5);
        h.put("IV", 4);
        h.put("I", 1);

        int i = s.length()-1;
        String temp;
        while(i > 0){

            temp = s.substring(i - 1, (i - 1) + 2);
            if(h.containsKey(temp)){
                total += h.get(temp);
                i -= 2;
            }else{
                temp = s.substring(i, i + 1);
                total += h.get(temp);
                i--;
            }
        }

        if(i == 0){
            total += h.get(s.substring(0, 1));
        }
        
        return total;
    }
}
