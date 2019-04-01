package sort;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * Clase que se utilizará durante el apartado de lambdas del curso de Java.
 */
public class Sort
{
	private static BigDecimal SALARIO_MINIMO = new BigDecimal("1000");
	
	/**
	 * Método main que ejecutará las diferentes pruebas del proyecto.
	 * 
	 * @param args Arreglo de cadenas.
	 */
	public static void main(String[] args)
	{
		test1();
	}

	/**
	 * Ordenando números que se saben comparar.
	 */
	private static void test1()
	{
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(24);
		numeros.add(33);
		numeros.add(85);
		numeros.add(5);
		numeros.add(75);
		numeros.add(27);
		numeros.add(69);
		
		Collections.sort(numeros);
		
		imprimir(numeros);
	}
	
	/**
	 * Método que imprime una lista de obetos, a través de su método "toString".
	 * 
	 * @param objetos Lista de los objetos a imprimir.
	 */
	private static void imprimir(List objetos)
	{
		for(Object obj : objetos)
		{
			System.out.println(obj);
		}
	}
	
}
