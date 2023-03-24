package Prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CargaTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Carga carga = new Carga(543, "CargaRio", "Carvao Mineral");

        Carga cargaClone = carga.clone();
        cargaClone.setSerial(777);
        cargaClone.setMaterial("Ferro");

        assertEquals("Carga{serial=543, nome='CargaRio', material='Carvao Mineral'}", carga.toString());
        assertEquals("Carga{serial=777, nome='CargaRio', material='Ferro'}", cargaClone.toString());
    }
}
