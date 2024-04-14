package deneme2;

import org.junit.Test;
import junit.framework.TestCase;

public class TesterAll extends TestCase {
    
    MathOperations islem = new MathOperations(0);
    CustomTimer time = new CustomTimer();
    User1_GUI user = new User1_GUI();
    deneme3 admin = new deneme3();
    
    @Test
    public void testMathOperations() {         
        islem.setKarar(1);
        int kararKontrol = islem.getKarar();
        assertEquals(1, kararKontrol);
    }
    
    @Test
    public void testMathOperations2() {
        String kontrol = islem.getDosyaYol();
        assertEquals("resources/user1.txt", kontrol);
    }
    
    @Test
    public void testTimer() { 
        int timer = time.getSeconds();
        assertEquals(0, timer);
    }
    
    @Test
    public void testUser() {
        user.setSkor(0);
        int kontrol = user.getSkor();
        assertEquals(0, kontrol);
    }
    
    @Test
    public void testTimerStart1() {
        time.start();
        int timer = time.getSeconds();
        assertEquals(0, timer);
        time.stop();
    }
    @Test
    public void testTimerStart() {
        time.start();
        int timer = time.getSeconds();
        assertEquals(0, timer);
        time.stop();
    }
    @Test
    public void testAdmin() {
    	String dosya= admin.getDosyaYolu();
    	assertEquals("resources/dosya.txt", dosya);  	
    }
    
}