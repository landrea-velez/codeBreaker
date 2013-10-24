package co.edu.udea.test;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import co.edu.udea.CodeBreaker;


public class TestCodeBreaker {
	
	CodeBreaker codeBreaker;
	@Before
	public void correrAntes() {
		codeBreaker= new CodeBreaker();
	}
	
	@Test
	public void testTodosCoinciden() {		
		String numero = codeBreaker.comparar("1234");
		Assert.assertEquals("XXXX", numero);	
	}
	
	@Test
	public void testNingunoCoincide(){		
		String numero = codeBreaker.comparar("5698");
		Assert.assertEquals("", numero);
	}
	
	@Test
	public void testTresCoinciden() {		
		String numero = codeBreaker.comparar("1235");
		Assert.assertEquals("XXX", numero);	
	}
	
	@Test
	public void testDosCoinciden() {
		String numero = codeBreaker.comparar("9734");
		Assert.assertEquals("XX", numero);	
	}
	
	public void testUnoCoinciden() {
		String numero = codeBreaker.comparar("7289");
		Assert.assertEquals("X", numero);	
	}
	
	@Test
	public void testUnoEnDiferentePosocion(){
		String numero = codeBreaker.comparar("7548");
		Assert.assertEquals("_", numero);
	}
	
	@Test
	public void testDosEnDiferentePosocion(){
		String numero = codeBreaker.comparar("7542");
		Assert.assertEquals("__", numero);
	}
	
	@Test
	public void testTresEnDiferentePosocion(){
		String numero = codeBreaker.comparar("2148");
		Assert.assertEquals("___", numero);
	}
	
	@Test
	public void testPrimeroCoincideTresEnDiferentePosocion(){
		String numero = codeBreaker.comparar("1342");
		Assert.assertEquals("X___", numero);
	}
	
	@Test
	public void testPrimeroCoincideDosEnDiferentePosocion(){
		String numero = codeBreaker.comparar("1742");
		Assert.assertEquals("X__", numero);
	}
	
	@Test
	public void testPrimeroCoincideUnoEnDiferentePosocion(){
		String numero = codeBreaker.comparar("1763");
		Assert.assertEquals("X_", numero);
	}
	
	
	@Test
	public void testSegundoCoincideTresEnDiferentePosocion(){
		String numero = codeBreaker.comparar("4213");
		Assert.assertEquals("_X__", numero);
	}
	
	
	@Test
	public void testSegundoCoincideDosEnDiferentePosocion(){
		String numero = codeBreaker.comparar("4261");
		Assert.assertEquals("_X_", numero);
	}
	
	@Test
	public void testSegundoCoincideUnoEnDiferentePosocion(){
		String numero = codeBreaker.comparar("3269");		
		Assert.assertEquals("X_", numero);//REVISAR ESTA
	}
	
	
			

	
}
