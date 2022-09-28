package Repositorio;

import java.util.ArrayList;

public class EjercicioIniciales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String despedida = "Adios";
		int i = 4;
		
		ArrayList<String> array1 = new ArrayList<>();
		array1.add("Adios");	
		array1.add("Mundo");
		array1.add("1");
		
		ArrayList<String> array2 = new ArrayList<>();
		array2.add("Bye");	
		array2.add("World");
		array2.add("1");
		System.out.println("i:"+i);
	}
	
	private void metodo(int b, String saludo, ArrayList<String>array1, ArrayList<String>array2) {
		// TODO Auto-generated method stub

		 b = 123;
		 saludo = "Hola";
		array1.add("Hola");	
		array1.add("Mundo");
		array1.add("1");
		
		array2.add("Hello");	
		array2.add("World");
		array2.add("1");
		
	}
}
