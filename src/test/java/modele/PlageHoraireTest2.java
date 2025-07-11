package modele;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder( MethodOrderer.OrderAnnotation.class) class PlageHoraireTest2 {

    @Test @Order(1)
    void testPlageAvant() {
            PlageHoraire plage1 = new PlageHoraire(new Horaire(8, 0), new Horaire(9, 0));
            PlageHoraire plage2 = new PlageHoraire(new Horaire(9, 30), new Horaire(10, 0));
            assertEquals(-1, plage1.compareTo(plage2));
    }

    @Test @Order(2)
    void testPlageApres() {
            PlageHoraire plage1 = new PlageHoraire(new Horaire(11, 0), new Horaire(12, 0));
            PlageHoraire plage2 = new PlageHoraire(new Horaire(9, 0), new Horaire(10, 0));
            assertEquals(1, plage1.compareTo(plage2));
    }

    @Test @Order(3)
    void testPlageChevauchement() {
            PlageHoraire plage1 = new PlageHoraire(new Horaire(9, 0), new Horaire(10, 30));
            PlageHoraire plage2 = new PlageHoraire(new Horaire(10, 0), new Horaire(11, 0));
            assertEquals(0, plage1.compareTo(plage2));
    }

    @Test @Order(4)
    void testDuree(){
        PlageHoraire plage3 = new PlageHoraire(new Horaire(9, 0), new Horaire(10, 0));
        assertTrue(new Horaire(1,0).compareTo(plage3.duree())==0);
    }

}
