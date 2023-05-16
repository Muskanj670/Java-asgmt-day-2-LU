public class Letsupgrade{
    public static void main(String ar[]) {
        int M = Integer.parseInt(ar[0]);
        if(M % 5 == 0 && M % 3 == 0){
            System.out.println("Good Number");
        }
        else if(M % 3 == 0){
            System.out.println("Bad Number");
        }
        else if(M % 5 == 0){
            System.out.println("Poor Number");
        }
        else{
            System.out.println("-1");
        }
    }
}