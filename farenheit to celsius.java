import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int f, fin;
        System.out.println("Enter the Farenheit Temperature: ");
        f = s.nextInt();
        fin = (f-32)*5/9;
        System.out.println("The equivalent Celsius value for given is = " + fin);
    }
}
