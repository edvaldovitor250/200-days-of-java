
public class Day063 {

    public static void main(String[] args) {
        Day063 obj = new Day063();
        obj.numerosRomanos(12);
    }


    public void numerosRomanos(int n){
        String[] roman = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C"};
        int[] decimal = {1, 4, 5, 9, 10, 40, 50, 90, 100};

        int i = decimal.length - 1;
        while(n > 0){
            if(n >= decimal[i]){
                System.out.print(roman[i]);
                n -= decimal[i];
            }else{
                i--;
            }
        }
    }




}
