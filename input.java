import java.util.Scanner;

class AcceptInput {
    public static void main(String[] args) {
        String myName;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        myName = input.nextLine();
        
        System.out.println("Nice to meet you " + myName);
        input.close();
    }
}
