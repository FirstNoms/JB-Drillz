import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input= new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int h = input.nextInt();

        if(h < a){
            System.out.println("Deficiency");
        }else if(h > b){
            System.out.println("Excess");
        }else System.out.println("Normal");
    }
}