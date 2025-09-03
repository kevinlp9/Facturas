package test;

import interfaces.impl.Factura;
import interfaces.impl.FacturaInternacional;
import interfaces.impl.FacturaNacional;

public class Prueba {

    public static void main(String[] args) {

        Factura factura1 = new FacturaNacional(100000);
        Factura factura2 = new FacturaInternacional(200000);

        System.out.println(factura1.obtenerDetalles ());
        System.out.println(factura2.obtenerDetalles ());

    }

}
