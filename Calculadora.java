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
