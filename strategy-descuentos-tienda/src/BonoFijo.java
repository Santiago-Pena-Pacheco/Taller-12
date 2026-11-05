public class BonoFijo implements EstrategiaDescuento {
    private double montoMinimo;
    private double valorDescuento;

    public BonoFijo(double montoMinimo, double valorDescuento) {
        this.montoMinimo = montoMinimo;
        this.valorDescuento = valorDescuento;
    }

    @Override
    public double aplicar(double subtotal) {
        if (subtotal >= montoMinimo){
            return subtotal - valorDescuento;
        }
        return subtotal;
    }
}
