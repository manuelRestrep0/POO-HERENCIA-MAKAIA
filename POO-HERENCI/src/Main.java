import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        TarjetaCredito clasica = new Clasica("Visa",5000000,"1001",123, LocalDate.now());
        TarjetaCredito platinum = new Platinum("MasterCard",10000000,"1002",124,LocalDate.now());
        TarjetaCredito dorada = new Dorada("Amex",4000000,"1003",125,LocalDate.now());
        TarjetaCredito black = new Black("Visa",90000000,"1004",126,LocalDate.now());

        clasica.imprimir();
        System.out.println("----------------");
        platinum.imprimir();
        System.out.println("----------------");
        dorada.imprimir();
        System.out.println("----------------");
        black.imprimir();
    }
}