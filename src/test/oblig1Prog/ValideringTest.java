package oblig1Prog;

import static org.junit.jupiter.api.Assertions.*;

class ValideringTest {

    @org.junit.jupiter.api.Test
    void datoSjekk() {
    }

    @org.junit.jupiter.api.Test
    void epostSjekk() {
        assertTrue(Validering.epostSjekk("henrik.lieng@oslomet.no"));
    }

    @org.junit.jupiter.api.Test
    void telefonSjekk() {
    }
}