package sort;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import beans.Empleado;

/**
 * Clase que se utilizar� durante el apartado de lambdas del curso de Java.
 */
public class Sort
{
	private static BigDecimal SALARIO_MINIMO = new BigDecimal("1000");
	
	/**
	 * M�todo main que ejecutar� las diferentes pruebas del proyecto.
	 * 
	 * @param args Arreglo de cadenas.
	 */
	public static void main(String[] args)
	{
		test1();
	}

	/**
	 * Ordenando n�meros que se saben comparar.
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
	 * Ordenando cadenas.
	 */
	private static void test2()
	{
		List<String> nombres = new ArrayList<String>();
		nombres.add("Karen");
		nombres.add("Victor");
		nombres.add("H�ctor");
		nombres.add("Jos�");
		nombres.add("Jose");
		nombres.add("Marquito");
		nombres.add("Oscar");
		nombres.add("dany bebe");
		
		Collections.sort(nombres);
		
		imprimir(nombres);
	}
	
	/**
	 * Ordenando empleados a trav�s de su orden natural, por medio de la interfaz Comparable. Se ordena por salario.
	 */
	private static void test3()
	{
		List<Empleado> empleados = GenerateEmployee.crearEmpleados();
		Collections.sort(empleados);
		imprimir(empleados);
	}
	
	/**
	 * M�todo que imprime una lista de obetos, a trav�s de su m�todo "toString".
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
