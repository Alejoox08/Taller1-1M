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
