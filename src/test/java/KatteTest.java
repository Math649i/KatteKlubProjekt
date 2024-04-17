import ModelKlasser.Katte;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class KatteTest {

        @Test
        public void testKatteConstructor() {

            Katte kat = new Katte(1, "abi", "Abe", 44, 2, "2/2-2003");


            assertEquals("abi", kat.getNavn());
            assertEquals("Abe", kat.getRace());
            assertEquals(44, kat.getAlder());
            assertEquals(1, kat.getId());
            assertEquals("2/2-2003", kat.getFodselsdag());
            assertEquals(2, kat.getVegt());
        }
    @Test
    public void testKatteAlder() {
        Katte kat = new Katte(56, "Osama Bin Laden", "Nigga",2,3,"3/3-2023");

        kat.setAlder(2);
        assertEquals(2, kat.getAlder());

    }
}




