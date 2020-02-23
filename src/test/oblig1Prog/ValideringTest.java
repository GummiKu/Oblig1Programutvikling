package oblig1Prog;

import static org.junit.jupiter.api.Assertions.*;

class ValideringTest {

    @org.junit.jupiter.api.Test
    void datoSjekk() {
    }

    @org.junit.jupiter.api.Test
    void validEpostSjekk() {
        assertTrue(Validering.epostSjekk("henrik.lieng@oslomet.no"));
        assertTrue(Validering.epostSjekk("example@example.com"));
        assertTrue(Validering.epostSjekk("uk@domain.co.uk"));
    }

    @org.junit.jupiter.api.Test
    void invalidEpostSjekk() {
        assertFalse(Validering.epostSjekk(""));
        assertFalse(Validering.epostSjekk("henrik.lieng"));
        assertFalse(Validering.epostSjekk("@oslomet.no"));
        assertFalse(Validering.epostSjekk("henrik.lieng@invalid"));
        assertFalse(Validering.epostSjekk("test@"));
        assertFalse(Validering.epostSjekk(";bot@evil.com"));
    }


    @org.junit.jupiter.api.Test
    void validTelefonSjekk() {
        assertTrue(Validering.telefonSjekk("12233212"));
        assertTrue(Validering.telefonSjekk("+4712233212"));
        assertTrue(Validering.telefonSjekk("+47 12233212"));
        assertTrue(Validering.telefonSjekk("(+47)12233212"));
        assertTrue(Validering.telefonSjekk("(+47) 12233212"));
        //assertTrue(Validering.telefonSjekk("(+47) 12 23 32 12"));
        assertTrue(Validering.telefonSjekk("07911 123456"));
        assertTrue(Validering.telefonSjekk("+44 7911 123456"));
        //assertTrue(Validering.telefonSjekk("754-3010"));
        assertTrue(Validering.telefonSjekk("(541) 754-3010"));
        assertTrue(Validering.telefonSjekk("+1-541-754-3010"));
        assertTrue(Validering.telefonSjekk("1-541-754-3010"));
        //assertTrue(Validering.telefonSjekk("001-541-754-3010"));

        //de kommenterte nummerne matcher ikke regex-koden
    }

    @org.junit.jupiter.api.Test
    void invalidTelefonSjekk() {
        assertFalse(Validering.telefonSjekk(""));
        assertFalse(Validering.telefonSjekk("Not a number"));
        assertFalse(Validering.telefonSjekk("-231"));
        assertFalse(Validering.telefonSjekk("123-norway"));
        assertFalse(Validering.telefonSjekk("1-541-æøå-3010"));
        assertFalse(Validering.telefonSjekk("1-541-abc-3010"));
        assertFalse(Validering.telefonSjekk("!%&/"));
        assertFalse(Validering.telefonSjekk("123 123     123 12"));

    }
}