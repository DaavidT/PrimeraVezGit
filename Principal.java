import java.util.Scanner;
import java.util.InputMismatchException;

public class Principal {
    public static void main(String[] args) {

        int x; // Variable 1 para suma de numeros
        int y; // Variable 2 para suma de numeros
        int z; // Resultado de la suma de la variable 1 y 2

        Persona p = new Persona();
        Persona p2 = new Persona(18, 100, "Angel");
        Persona p3 = new Persona(15, 250, "Lucia");
        /*
         * !qeqwe ?13123123 TODO ASDASD
         * 
         * @param hola
         */
        System.out.println(p);
        p.setEdad(11);
        System.out.println(p);
        p2.setNombre("Rocio");
        System.out.println(p2);

        Punto punto = new Punto();
        Punto punto2 = new Punto(-12, 0);

        Perro perro = new Perro();

        System.out.println(punto);
        try {
            System.out.println(punto2.raizX());
        } catch (ExcepcionNumeroInvalido e) {
            System.out.println(e);

        } finally {
            System.out.println("Ya determinamos el resultado");
        }
        System.out.println(perro);

        /*
         * System.out.println("Dame un numero x: "); Scanner s = new Scanner(System.in);
         * try { int x = s.nextInt(); } catch (InputMismatchException e) {
         * System.out.println("Ingresa un numero entero por favor "); }
         */

        x = 0;
        y = 0;
        z = 0;

        System.out.println("Ponga dos numeros para sumarlos");
        Scanner numero = new Scanner(System.in);
        try {
            x = numero.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Ingresa numeros enteros por favor");
            System.exit(-1);
        }
        try {
            y = numero.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Ingresa numeros enteros por favor");
            System.exit(-1);
        }
        z = x + y;
        System.out.println("La suma de los numeros es: " + z);
    }

}