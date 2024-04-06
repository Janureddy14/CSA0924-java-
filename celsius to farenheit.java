import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int c, fin;
        System.out.println("Enter the Celsius Temperature: ");
        c = s.nextInt();
        fin = (c * 9 / 5) + 32;
        System.out.println("The equivalent Farenheit value for given is = " + fin);
    }
}
