import java.util.Scanner;
public class Ejercicio3Division {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int a, b,residuo = 0;
        int cociente = 0;
        System.out.println("Ingrese dos números enteros");
        System.out.print("Dividendo:");
        a = lector.nextInt();
        System.out.print("Divisor:");
        b = lector.nextInt();
        if (b !=0 ){
            residuo = a % b;
            cociente = a / b;
            if (residuo == 0) {
                System.out.println("La división es exacta.");
                System.out.println("Cociente: "+ cociente);
                System.out.println("Residuo: " + residuo);
            } else {
                System.out.println("La división no es exacta.");
                System.out.println("Cociente: " + cociente);
                System.out.println("Residuo: " + residuo);
            }
        } else
            System.out.print("La división es indeterminada");
    }
}
