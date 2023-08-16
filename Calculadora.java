import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Calculadora:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Seno");
            System.out.println("6. Coseno");
            System.out.println("7. Tangente");
            System.out.println("8. Raíz enésima");
            System.out.println("9. Potencia enésima");
            System.out.println("10. Calcular IVA");
            System.out.println("11. Salir");
            System.out.print("Seleccione una opción: ");
            
            int opcion = scanner.nextInt();
            
            if (opcion == 11) {
                System.out.println("¡Hasta luego!");
                break;
            }
            
            double resultado;
            
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
                    resultado = realizarDividision(scanner);
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
                    System.out.println("No valido");
                    return;
            }
            
            System.out.println("Resultado: " + resultado);
        }
        
        scanner.close();
    }
    
    public static double realizarSuma(Scanner scanner) {
        System.out.print("Digite el primer numero: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite el segundo numero: ");
        double num2 = scanner.nextDouble();
        return num1 + num2;
    }
    
    public static double realizarResta(Scanner scanner) {
        System.out.print("Digite el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite el segundo número: ");
        double num2 = scanner.nextDouble();
        return num1 - num2;
    }
    
    public static double realizarMultiplicacion(Scanner scanner) {
        System.out.print("Digite el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite el segundo número: ");
        double num2 = scanner.nextDouble();
        return num1 * num2;
    }
    
    public static double realizarDividision(Scanner scanner) {
        System.out.print("Digite el dividendo: ");
        double dividendo = scanner.nextDouble();
        System.out.print("Digite el divisor: ");
        double divisor = scanner.nextDouble();
        
        if (divisor == 0) {
            System.out.println("Ups, no es posible dividir entre cero. ");
            return 0;
        }
        
        return dividendo / divisor;
    }
    
    public static double realizarSeno(Scanner scanner) {
        System.out.print("Digite el angulo en grados: ");
        double angulo = Math.toRadians(scanner.nextDouble());
        return Math.sin(angulo);
    }
    
    public static double realizarCoseno(Scanner scanner) {
        System.out.print("Digite el angulo en grados: ");
        double angulo = Math.toRadians(scanner.nextDouble());
        return Math.cos(angulo);
    }
    
    public static double realizarTangente(Scanner scanner) {
        System.out.print("Digite el angulo en grados: ");
        double angulo = Math.toRadians(scanner.nextDouble());
        return Math.tan(angulo);
    }
    
    public static double realizarRaiz(Scanner scanner) {
        System.out.print("Digite el numero: ");
        double num = scanner.nextDouble();
        System.out.print("Digite el indice de la raiz: ");
        double indice = scanner.nextDouble();
        
        return Math.pow(num, 1.0 / indice);
    }
    
    public static double realizarPotencia(Scanner scanner) {
        System.out.print("Digite la base: ");
        double base = scanner.nextDouble();
        System.out.print("Digite el exponente: ");
        double exponente = scanner.nextDouble();
        
        return Math.pow(base, exponente);
    }
    
    public static double calcularIVA(Scanner scanner) {
        System.out.print("Digite el monto: ");
        double monto = scanner.nextDouble();
        System.out.print("Digite el porcentaje del IVA: ");
        double porcentajeIVA = scanner.nextDouble();
        
        return monto * (porcentajeIVA / 100.0);
    }
}
