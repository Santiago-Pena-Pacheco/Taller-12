public class SinDesceunto implements EstrategiaDescuento {

    @Override
    public double aplicar(double subtotal) {
        return subtotal; //no tiene descusto solo retorna el subtotal
    }
}
