import java.util.Scanner;

public class TransportCompany {
    public static void main(String[] args) {
        // Paso 1: Declarar el arreglo de conductores y km
        String[] truckDriver = new String[3];
        int[][] dailyKms = new int[3][7]; // 3 conductores, 7 días de la semana
        int[] totalKms = new int[3]; // Kilómetros totales por conductor
        
        Scanner scanner = new Scanner(System.in);
        
        // Paso 2: Entrada de nombres de los conductores
        for (int i = 0; i < truckDriver.length; i++) {
            System.out.print("Ingrese el nombre del conductor " + (i + 1) + ": ");
            truckDriver[i] = scanner.nextLine();
        }
        
        // Entrada de kilómetros diarios
        for (int i = 0; i < truckDriver.length; i++) {
            System.out.println("Ingrese los km recorridos por " + truckDriver[i] + " durante la semana:");
            for (int j = 0; j < 7; j++) {
                System.out.print("Día " + (j + 1) + ": ");
                dailyKms[i][j] = scanner.nextInt();
            }
        }

        // Paso 3: Calcular el total de km por conductor
        for (int i = 0; i < truckDriver.length; i++) {
            for (int j = 0; j < 7; j++) {
                totalKms[i] += dailyKms[i][j];
            }
        }

        // Paso 4: Mostrar resultados
        System.out.println("\nTotal de kilómetros recorridos por cada conductor:");
        for (int i = 0; i < truckDriver.length; i++) {
            System.out.println(truckDriver[i] + ": " + totalKms[i] + " km");
        }

        scanner.close();
    }
}