import java.util.Scanner;
public class Ejercicio5Ordenamiento {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        int num1,num2,num3,maximo,minimo,numero2,numero3,num4=0;
        System.out.println("Ingrese cuatro números.");
        System.out.print("Número 1: ");
        num1 = lector.nextInt();
        System.out.print("Número 2: ");
        num2 = lector.nextInt();
        System.out.print("Número 3: ");
        num3 = lector.nextInt();
        System.out.print("Número 4: ");
        num4 = lector.nextInt();
        maximo = Math.max(Math.max(num1, num2), Math.max(num3, num4));
        minimo = Math.min(Math.min(num1, num2), Math.min(num3, num4));
        numero2 = Math.max(Math.min(num1, num2), Math.min(num3, num4));
        numero3 = Math.min(Math.max(num3, num4), Math.max(num1, num2));
        System.out.println("El orden de menor a mayor de los números ingresados es: "+ minimo +", "+ numero2 +", "+ numero3 +", "+maximo);
    }
}
