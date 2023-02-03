import java.time.LocalDate;
public class TarjetaCredito {
    protected String emisor;
    protected long cupo;
    protected String numeroTarjeta;
    protected int cvv;
    protected LocalDate fechaVencimiento;

    public TarjetaCredito() {
    }

    public TarjetaCredito(String emisor, long cupo, String numeroTarjeta, int cvv, LocalDate fechaVencimiento) {
        this.emisor = emisor;
        this.cupo = cupo;
        this.numeroTarjeta = numeroTarjeta;
        this.cvv = cvv;
        this.fechaVencimiento = fechaVencimiento;
    }

    public void imprimir(){
        System.out.println("Emisor: "+this.emisor);
        System.out.println("Cupo: "+this.cupo);
        System.out.println("Numero tarjeta: "+this.numeroTarjeta);
        System.out.println("cvv: "+this.cvv);
        System.out.println("Fecha de vencimiento: "+this.fechaVencimiento);
    }
}
