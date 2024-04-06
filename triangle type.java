import java.util.Scanner;
class TriangleType {
    private int sideA, sideB, sideC, angle;
    public TriangleType(int sideA, int sideB, int sideC, int angle) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.angle = angle;
    }
    public boolean isRight() {
        return angle == 90;
    }
    public boolean isScalene() {
        return sideA != sideB && sideB != sideC && sideC != sideA;
    }
    public boolean isIsosceles() {
        return sideA == sideB || sideB == sideC || sideC == sideA;
    }
    public boolean isEquilateral() {
        return sideA == sideB && sideB == sideC;
    }
}

class TType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side A: ");
        int sideA = scanner.nextInt();
        System.out.print("Enter side B: ");
        int sideB = scanner.nextInt();
        System.out.print("Enter side C: ");
        int sideC = scanner.nextInt();
        System.out.print("Enter the Angle: ");
        int angle = scanner.nextInt();
        TriangleType triangle = new TriangleType(sideA, sideB, sideC, angle);
        System.out.println("Is Right Triangle: " + triangle.isRight());
        System.out.println("Is Scalene Triangle: " + triangle.isScalene());
        System.out.println("Is Isosceles Triangle: " + triangle.isIsosceles());
        System.out.println("Is Equilateral Triangle: " + triangle.isEquilateral());
    }
}
