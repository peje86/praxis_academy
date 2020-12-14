
package Junits;
 
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
 
/**
 *
 * @author awanlabs
 */
//public class KalkulatorTest extends KalkulatorRevisi {
    public class KalkulatorTest   {

    KalkulatorRevisi kalkulator;
    
    @Before
    public void init(){
        kalkulator=new Kalkulator();
    }
 
    @Test
    public void testKali() {
        assertEquals(20, kalkulator.kali(10, 2),0);
    }
 
    @Test
    public void testBagi() {
        assertEquals(5, kalkulator.bagi(10, 2),0);
    }
 
    @Test
    public void testTambah() {
        assertEquals(12, kalkulator.tambah(10, 2),0);
    }
 
    @Test
    public void testKurang() {
        assertEquals(8, kalkulator.kurang(10, 2),0);
    }
}