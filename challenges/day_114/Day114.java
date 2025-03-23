
public class Day114 {

    public static void main(String[] args) {
        numeroAmigo(220);
    }

    public static void numeroAmigo(int amigo){
     int count = 0;

     for(int i = 1; i < amigo; i++){
         if(amigo % i == 0){
             count += i;
         }

         System.out.println(count);
     }
    }

}
