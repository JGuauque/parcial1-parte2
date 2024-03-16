public class Main {
    public static void main(String[] args) {
        LibroDeTextoIUAJC libro1 = new LibroDeTextoIUAJC("Examenes Imposibles", "Dario Bautista", "Programacion II", "tec_sistemas");
        libro1.setPrecio(150.0);
        libro1.setPropietario("Jorge");

        Novela libro2 = new Novela("Cincuenta sombras de Grey", "E. L. James", "Relista");
        libro2.setPrecio(200.0);
        libro2.setPropietario("Laura");

        libro1.imprimirInfo();
        System.out.println();
        libro2.imprimirInfo();
    }
}
