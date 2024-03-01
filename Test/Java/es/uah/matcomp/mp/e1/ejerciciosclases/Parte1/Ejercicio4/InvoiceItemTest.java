package es.uah.matcomp.mp.e1.ejerciciosclases.Parte1.Ejercicio4;

import es.uah.matcomp.mp.e1.ejerciciosclases.Ejercicio4.InvoiceItem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceItemTest {

    @Test
    void getId() {

        String id = "001";
        InvoiceItem item = new InvoiceItem(id, "Item 1", 1, 9.0);

        assertEquals(id, item.getId());

    }

    @Test
    void getDesc() {

        String desc = "Item 2";
        InvoiceItem item = new InvoiceItem("002", desc, 7, 13.0);

        assertEquals(desc, item.getDesc());

    }

    @Test
    void getQty() {

        int qty = 4;
        InvoiceItem item = new InvoiceItem("003", "Item 3", qty, 18.0);

        assertEquals(qty, item.getQty());

    }

    @Test
    void setQty() {

        InvoiceItem item = new InvoiceItem("004", "Item 4", 5, 25.0);

        int newQty = 6;
        item.setQty(newQty);

        assertEquals(newQty, item.getQty());

    }

    @Test
    void getUnitPrice() {

        double unitPrice = 23.0;
        InvoiceItem item = new InvoiceItem("005", "Item 5", 20, unitPrice);

        assertEquals(unitPrice, item.getUnitPrice());

    }

    @Test
    void setUnitPrice() {

        InvoiceItem item = new InvoiceItem("006", "Item 6", 2, 35.0);

        double UnitPriceNuevo = 42.0;
        item.setUnitPrice(UnitPriceNuevo);

        assertEquals(UnitPriceNuevo, item.getUnitPrice());

    }

    @Test
    void getTotal() {

        int qty = 9;
        double unitPrice = 5.0;
        InvoiceItem item = new InvoiceItem("007", "Item 7", qty, unitPrice);

        double TotalEsperado = qty * unitPrice;
        assertEquals(TotalEsperado, item.getTotal());

    }

    @Test
    void testToString() {

        InvoiceItem item = new InvoiceItem("008", "Item 8", 23, 23.0);

        String StringEsperada = "InvoiceItem[id=008, desc=Item 8, qty=23, unitPrice=23.0]";
        assertEquals(StringEsperada, item.toString());

    }
}