package sort;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import beans.Empleado;
import comparators.EdadEmpleadoComparator;
import comparators.NombreEmpleadoComparator;

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
//		test1();
//		test2();
		test3();
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
	 * Ordenando cadenas.
	 */
	private static void test2()
	{
		List<String> nombres = new ArrayList<String>();
		nombres.add("Karen");
		nombres.add("Victor");
		nombres.add("Héctor");
		nombres.add("José");
		nombres.add("Jose");
		nombres.add("Marquito");
		nombres.add("Oscar");
		nombres.add("dany bebe");
		
		Collections.sort(nombres);
		
		imprimir(nombres);
	}
	
	/**
	 * Ordenando empleados a través de su orden natural, por medio de la interfaz Comparable. Se ordena por salario.
	 */
	private static void test3()
	{
		List<Empleado> empleados = GenerateEmployee.crearEmpleados();
		Collections.sort(empleados);
		imprimir(empleados);
	}
	
	/**
	 * Ordenando empleados a través de una clase que implementa a la interfaz Comparator. Se ordena por edad.
	 */
	private static void test4()
	{
		List<Empleado> empleados = GenerateEmployee.crearEmpleados();
		Comparator<Empleado> comparator = new EdadEmpleadoComparator();
		Collections.sort(empleados, comparator);
		imprimir(empleados);
	}
	
	/**
	 * Ordenando empleados con una clase que implementa a Comparator, en este caso, se utilizan sus nombres. 
	 */
	private static void test5()
	{
		List<Empleado> empleados = GenerateEmployee.crearEmpleados();
		Comparator<Empleado> comparator = new NombreEmpleadoComparator();
		Collections.sort(empleados, comparator);
		imprimir(empleados);
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
