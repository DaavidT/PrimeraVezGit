
public class Main {
    public static void main(String[] args) {

        int[] arregloInt;
        arregloInt = new int[10];
        rellenarArregloDoWhile(arregloInt);
        mostrarArregloDoWhile(arregloInt);

        int i = 10;
        if (i == 5) {
            System.out.println("Es el numero 5");
        } else if (i == 7) {
            System.out.println("Es el numero 7");
        } else if (i == 10) {
            System.out.println("Es el numero 10");
        } else {
            System.out.println("Es cualquier otro numero");
        }
        switch (i) {
            case 5:
                System.out.println("Es el numero 5");
                break;
            case 7:
                System.out.println("Es el numero 7");
                break;
            case 10:
                System.out.println("Es el numero 10");
                break;
            default:
                System.out.println("Es cualquier otro numero");
        }
    }

    private static void rellenarArregloWhile(int[] arregloInt) {

        int i = 0;
        while (i < arregloInt.length) {
            arregloInt[i] = i * 2;
            i++;
        }
    }

    private static void mostrarArregloDoWhile(int[] arregloInt) {
        int i = 0;
        do {
            System.out.println("En el indice i = " + i + " esta el valor: " + arregloInt[i]);
            i++;
        } while (i < arregloInt.length);

    }

    private static void rellenarArregloDoWhile(int[] arregloInt) {

        int i = 0;
        do {
            arregloInt[i] = i * 2;
            i++;
        } while (i < arregloInt.length);
    }

    private static void mostrarArregloWhile(int[] arregloInt) {
        int i = 0;
        while (i < arregloInt.length) {
            System.out.println("En el indice i = " + i + " esta el valor: " + arregloInt[i]);
            i++;
        }

    }

    private static void mostrarArregloFor(int[] arregloInt) {

        for (int i = 0; i < arregloInt.length; i++) {

            System.out.println("En el indice i = " + i + " esta el valor: " + arregloInt[i]);
        }

    }

    private static void rellenarArregloFor(int[] arregloInt) {

        for (int i = 0; i < arregloInt.length; i++) {
            // [1,2,3,4,5] Siempre se empieza en 0
            arregloInt[i] = i * 2;
        }

    }

}