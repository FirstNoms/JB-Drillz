import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(number > 0){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}