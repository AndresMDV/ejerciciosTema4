public class Main {
    public static void main(String[] args) {
        int numero = 0;
        numeromayor();
        System.out.println("--------------------------\n");
        bucleWhile(numero);
        System.out.println("--------------------------\n");
        bucleDoWhile(numero);
        System.out.println("--------------------------\n");
        cicloFor();
        System.out.println("--------------------------\n");
        ejemploSwitch();
        System.out.println("--------------------------\n");
    }
    public static void numeromayor(){
        int numeroIf = 0;
        if (numeroIf == 0){
            System.out.println("El número es el cero.");
        }
        else {
            String resultado = (numeroIf > 0) ? "El numero es positivo" : "El numero es negativo.";
            System.out.println(resultado);
        }
    }
    public static void bucleWhile(int numeroWhile){
        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile ++;
        }
    }
    public static void bucleDoWhile(int numeroDoWhile){
        do{
            System.out.println(numeroDoWhile);
            numeroDoWhile ++;
        }
        while (numeroDoWhile>3);
    }
    public static void cicloFor(){
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }
    }
    public static void ejemploSwitch(){
        String estacion = "verano";
        switch (estacion){
            case "verano":
                System.out.println("La estación es verano.");
                break;
            case "invierno":
                System.out.println("La estación es invierno.");
                break;
            case "otoño":
                System.out.println("La estación es otoño.");
                break;
            case "primavera":
                System.out.println("La estación es primavera.");
                break;
            default:
                System.out.println("El valor solicitado no es una estación.");
        }
    }

}