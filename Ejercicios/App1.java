import java.util.Scanner;

public class App1 {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner (System.in);

        System.out.println("Cuanto elementos desea ingresar?");
        int cantidadElementos = lector.nextInt();

        int Arreglo[] = new int[cantidadElementos];
        System.out.println("Ingrese los " + cantidadElementos + " elenmentos: ");

        for (int i = 0; i < Arreglo.length; i++) {
            Arreglo[i] = lector.nextInt();
        }
        //Pedir al usuario que ingrese los valores enteros a ordenar

        System.out.println("Arreglo original: ");
        mostrarArreglo(Arreglo, Arreglo.length);

        OrdenarPorInsercion(Arreglo, Arreglo.length);
        System.out.println("Arreglo ordenado: ");
        mostrarArreglo(Arreglo, Arreglo.length);
    }

    public static void OrdenarPorInsercion(int Arr[], int n){
        for (int  i = 0; i < Arr.length; i++) {
            int valorC = Arr[i];
            int posicion = i;
            //Verificar si se esta trabajando con el elemento que esta despues del primero
            //y si el elemento que esta de primero es mayor que el segundo
            while((posicion > 0) && (Arr[posicion - 1] > valorC)){
                Arr[posicion] = Arr[posicion - 1]; //Cambiamos de posicion
                posicion = posicion - 1;
            }
            Arr[posicion] = valorC;

        }
    }

    public static void mostrarArreglo(int Arr[], int n){
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + " ");
        }
        System.out.println();
    }



}