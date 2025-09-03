package interfaces.impl;

public class FacturaInternacional implements Factura{
    private double subtotal;
    private final double TAX;

    public FacturaInternacional(double subtotal) {
        this.subtotal = subtotal;
        TAX = 0.10;
    }

    @Override
    public double calcularTotal() {
        return subtotal + (subtotal * TAX);
    }

    @Override
    public String obtenerDetalles() {
        return "Factura internacional - Subtotal: " + subtotal + " Total: $" + calcularTotal();
    }
}
