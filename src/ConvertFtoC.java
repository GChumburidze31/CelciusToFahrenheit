import java.util.Scanner;

/* First I need to find out what the conversion formula is for
   Celsius to Fahrenheit, and FahrenheitHeit to Celsius
FORMULAS:
C to F = (C * 9) / 5 + 32
F to C = (F - 32) * 5 / 9
 */
public class ConvertFtoC {

    public static final double BASE = 32;
    public static final double DENOMINATOR = 5.0 / 9.0;

    public static void main (String []args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Fahrenheit");

        double fahrenheit = sc.nextDouble();

        double celsius =  (fahrenheit - BASE) * DENOMINATOR;

        System.out.printf("%.1f Fahrenheit is %.1f Celsius%n", fahrenheit, celsius);

    }
}
