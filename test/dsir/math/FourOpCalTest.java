package dsir.math;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Assert;
import org.junit.Test;

class FourOpCalTest {
	
	@Test
	void testAdd() {
		//on prépare le scénario de test
		FourOpCalculator calculator = new FourOpCalculator();
		int resultat = calculator.add(1,6); 
	    
	    assertEquals(7, resultat); 
	    
	    // données d'entrées
//	    FourOpCalculator calculator1 = new FourOpCalculator();
	    // résultat attendu
//	    int resultatAttendu = 9;// résultat effectif
//	    int resultatEffectif = calculator1.add(3,6);
	    // vérification
//	    assertEquals(resultatEffectif, resultatAttendu);

	}

	@Test
	void testSub() {
		//on prépare le scénario de test
		FourOpCalculator calculator = new FourOpCalculator();
		int resultat = calculator.sub(10,2); 
	    
	    assertEquals(8, resultat); 

	}

	@Test
	void testMul() {
		//on prépare le scénario de test
		FourOpCalculator calculator = new FourOpCalculator();
		int resultat = calculator.mul(10,6); 
	    
	    assertEquals(60, resultat); 

	}

	@Test
	void testDiv() throws Exception{
		//on prépare le scénario de test
		FourOpCalculator calculator = new FourOpCalculator();
		double resultat = calculator.div(15,3); 
	    
	    assertEquals(5d, resultat); 

	}
	
//	@Test(expected=IllegalArgumentException.class)
//	public void exp1_should_throw_exception_when_calculating_square_root_of_negative_number() {
//	  calculator.divide(100,0);
//	  calculator.squareRoot(-10);
//	}
	
	@Test
	void testDivPar0() {
		
		//on prépare le scénario de test
		FourOpCalculator calculator = new FourOpCalculator();
		//Double resultat = (Double) calculator.div(15,0);
		Exception exception = assertThrows(ArithmeticException.class, () -> calculator.div(15,0));
		assertEquals("Argument 'divisor' is 0", exception.getMessage());

//		Double resultat = (Double) calculator.div(15,0);
//		
//		assertNull(resultat);

	}
	
	

}
