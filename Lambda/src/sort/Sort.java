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
	 * Ordenando empleados a trav�s de una clase que implementa a la interfaz Comparator. Se ordena por edad.
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
	 * Se utiliza una clase an�nima para ordenar a los empleados de acuerdo a su edad.
	 * La clase an�nima cumple una relaci�n "is a" con la interfaz Comparator. Se ordena por edad.
	 */
	private static void test6()
	{
		List<Empleado> empleados = GenerateEmployee.crearEmpleados();
		
		Comparator<Empleado> comparator = new Comparator<Empleado>()
		{
			@Override
			public int compare(Empleado e1, Empleado e2)
			{
				if(e1.getEdad() < e2.getEdad())
					return -1;
				else if(e1.getEdad() > e2.getEdad())
					return 1;
				else
					return 0;
			}
		};
		
//		Comparator<Empleado> c2 = comparator.reversed();
		Collections.sort(empleados, comparator);
		imprimir(empleados);
	}
	
	/**
	 * Nuevamente se ocupa una clase an�nima para ordenar, en esta ocasi�n, por edad
	 * y usando el m�todo compareTo() de la clase Integer a la que pertenece la edad de los empleados.
	 */
	private static void test7()
	{
		List<Empleado> empleados = GenerateEmployee.crearEmpleados();
		Comparator<Empleado> comparator = new Comparator<Empleado>()
		{
			@Override
			public int compare(Empleado e1, Empleado e2)
			{
				return e1.getEdad().compareTo(e2.getEdad());
			}
		};
		Collections.sort(empleados, comparator);
		imprimir(empleados);
	}
	
	/**
	 * Primera lamda, que cumple una relaci�n "is a" con Comparator,
	 * b�sicamente es lo mismo que se hace en el m�todo anterior.
	 */
	private static void test8()
	{
		List<Empleado> empleados = GenerateEmployee.crearEmpleados();
		
		Comparator<Empleado> comparator = (e1, e2) -> e1.getEdad().compareTo(e2.getEdad());
		
		Collections.sort(empleados, comparator);
		imprimir(empleados);
	}
	
	/**
	 * Segunda lambda, ordena de acuerdo al nombre de los empleados.
	 */
	private static void test9()
	{
		List<Empleado> empleados = GenerateEmployee.crearEmpleados();
		Comparator<Empleado> comparator = (e1, e2) -> e1.getNombre().compareTo(e2.getNombre());
		Collections.sort(empleados, comparator);
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
