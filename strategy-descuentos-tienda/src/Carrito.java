import java.util.ArrayList;

public class Carrito {
    private ArrayList<Producto> productos = new ArrayList<>();
    private EstrategiaDescuento estrategia = new SinDesceunto();

    public void agregar(Producto producto) {
        productos.add(producto);
    }

    public void setEstrategia(EstrategiaDescuento e) {
        this.estrategia = e;
    }

    public double getSubtotal() {
        double subtotal = 0;
        for (Producto p : productos) {
            subtotal += p.getSubtotal();
        }
        return subtotal;
    }

    // SINTOMA: cada promocion nueva obliga a abrir y modificar este metodo
    public double calcularTotal() {
        double subtotal = getSubtotal();
        return this.estrategia.aplicar(subtotal);
    }
}
