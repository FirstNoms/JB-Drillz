import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int value = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();
        boolean Success;
        
        if((value >= 10 && value <= 20 && weekend == false) || (value >= 15 && value <=25 && weekend == true)){
            Success = true;
         }
        else{
            Success = false;
        }
        System.out.println(Success);
    }
}
