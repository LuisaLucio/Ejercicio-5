package elementomaxmin;
import java.util.Random;

/**
 *
 * @author Felipe Alzate
 */
public class ElementoMaxMin {

    public static void main(String[] args) {
        
        // Paso 1: Declarar e inicializar un array de enteros con 100 elementos
        int[] array = new int[100];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(1000) + 1; // Rellenar el array con números aleatorios entre 1 y 1000
        }

        // Paso 2: Encontrar el valor máximo y mínimo en el array
        int valorMaximo = array[0];
        int valorMinimo = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > valorMaximo) {
                valorMaximo = array[i];
            }
            if (array[i] < valorMinimo) {
                valorMinimo = array[i];
            }
        }

        // Paso 3: Mostrar los valores máximo y mínimo en la consola
        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nValor Máximo: " + valorMaximo);
        System.out.println("Valor Mínimo: " + valorMinimo);
    }
}
