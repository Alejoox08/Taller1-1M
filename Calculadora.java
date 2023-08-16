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
