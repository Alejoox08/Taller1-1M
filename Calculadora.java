 import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Calculadora: ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Seno");
        System.out.println("6. Coseno");
        System.out.println("7. Tangente");
        System.out.println("8. Raiz enesima");
        System.out.println("9. Potencia enesima");
        System.out.println("10. Calcular IVA");
        
        System.out.print("Seleccione una opcion (1-10): ");
        int opcion = scanner.nextInt();
        
        double resultado = 0.0;
        
        switch (opcion) {
            case 1: 
                resultado = realizarSuma(scanner);
                break;
            case 2: 
                resultado = realizarResta(scanner);
                break;
            case 3: 
                resultado = realizarMultiplicacion(scanner);
                break;
            case 4: 
                resultado = realizarDivision(scanner);
                break;
            case 5: 
                resultado = realizarSeno(scanner);
                break;
            case 6: 
                resultado = realizarCoseno(scanner);
                break;
            case 7: 
                resultado = realizarTangente(scanner);
                break;
            case 8: 
                resultado = realizarRaiz(scanner);
                break;
            case 9: 
                resultado = realizarPotencia(scanner);
                break;
            case 10: 
                resultado = calcularIVA(scanner);
                break;
            default:
                System.out.println("No valido.");
                return;
        }
        
        System.out.println("Resultado: " + resultado);
    }
    
