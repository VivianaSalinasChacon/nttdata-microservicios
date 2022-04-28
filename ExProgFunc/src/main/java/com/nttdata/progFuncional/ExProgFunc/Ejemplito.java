package com.nttdata.progFuncional.ExProgFunc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.nttdata.interfaces.*;

public class Ejemplito {
	
	public static void main(String [] args) {
		
		List<Integer> numeros = List.of(1,2,3,10,11,12,20,21,5,50);
		List<Integer> numeros2 = Arrays.asList(20,21,22,1,2,3,25);
		
		for(int numero:numeros) {
			
			if(numero > 10) {
			}
		}
		
		ListI vs = lista ->{
			
			lista.forEach(n -> System.out.println("numeros de la lista: "+n));
		};
	
		vs.visualizarElem(numeros);
		
		ListI2 vs2 = (lista) -> numeros2.stream().filter(num -> num > 10).count();
		System.out.println("Numeros mayor que 10 hay: " + vs2.visualizarElem2(numeros2));
		
		
		List<String> colores = List.of("rojo", "verde", "azul", "amarillo");
		
		
		/* Elimina rojo de la lista y el resto pasa a Mayus */
		Object NoRojoMayus = colores.stream()
				.filter(a -> !a.equals("rojo"))
				.map(b -> b.toString().toUpperCase())
				.collect(Collectors.toList());
		
		System.out.println("Resultado: "+ NoRojoMayus);
		
		
//		ListColores color = (color) -> colores.stream()
//				.filter(col -> !col.equals("rojo"))
//				.map(col2 -> col2.toString().toUpperCase())
//				.collect(Collectors.toList());
				
		
}
}