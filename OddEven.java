import java.util.Scanner;
public class OddEven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if((number&1) ==0){
            System.out.println("Even");
        }else{
            System.out.println("ODD");
        }
        sc.close();
    }
}