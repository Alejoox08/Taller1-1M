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
