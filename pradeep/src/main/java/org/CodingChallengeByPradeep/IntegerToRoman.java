import java.util.Scanner;
import java.util.StringTokenizer;

public class IntegerToRoman {


    public static void main(String[] args) {
        int num;
        for (;;){
            Scanner scanner=new Scanner(System.in);
            num=scanner.nextInt();
            System.out.println("Roman value of "+num+" is "+numToRoman(num));
        }
    }

    private static String numToRoman(int num) {
        String[] thousand ={"", "M", "MM", "MMM"};
        String[] hundred={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] tens={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] units={"","I","II","III","IV","V","VI","VII","VIII","IX"};
        return thousand[(num%10000)/1000]+hundred[(num%1000)/100]+tens[(num%100)/10]+units[num%10] ;
     }
}
