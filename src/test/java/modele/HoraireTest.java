package modele;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HoraireTest {

    @Test
    void compareToAnterieur() {
        Horaire h1 = new Horaire (8,0);
        Horaire h2 = new Horaire (8,15);
        assertTrue(h1.compareTo(h2) < 0);

    }

    @Test
    void compareToPosterieur() {
        Horaire h1 = new Horaire (10,20);
        Horaire h2 = new Horaire (10,0);
        assertTrue(h1.compareTo(h2) > 0);

    }

    @Test
    void compareToEgal(){
        Horaire h1 = new Horaire (8,0);
        Horaire h2 = new Horaire (8,0);
        assertTrue(h1.compareTo(h2) == 0);

    }

    @Test
    @Order(0)
    void toMinute() {
        Horaire h1 = new Horaire (1,0);
        assertTrue(h1.toMinute() == 60);
    }
}