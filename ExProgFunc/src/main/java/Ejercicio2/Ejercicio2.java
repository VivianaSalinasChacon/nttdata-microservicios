package Ejercicio2;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import entity.Impuesto;
import entity.Producto;

public class Ejercicio2 {

	   public static void main(String[] args) {
	      List<Producto> shopping = List.of(
	            new Producto("Clothes", new BigDecimal("15.90"), Impuesto.NORMAL),
	            new Producto("Bread", new BigDecimal("1.5"), Impuesto.SUPERREDUCED),
	            new Producto("Meat", new BigDecimal("13.99"), Impuesto.REDUCED),
	            new Producto("Cheese", new BigDecimal("3.59"), Impuesto.SUPERREDUCED),
	            new Producto("Coke", new BigDecimal("1.89"), Impuesto.REDUCED),
	            new Producto("Whiskey", new BigDecimal("19.90"), Impuesto.NORMAL));
	      
			//List<String> colores = List.of("rojo", "verde", "azul", "amarillo");
			
			Object ListarCompraC = shopping.stream()
					.filter(c -> c.name.startsWith("C"))
					.map(d -> d.name)
					.sorted()
					.collect(Collectors.toList());
			
			System.out.println("Los productos que empiezan por C son: "+ ListarCompraC.toString());
	   
			//BigDecimal precioImpuesto = new BigDecimal();
			Object Precio = shopping.stream()
					.map(p -> p.price.add(p.price.multiply( BigDecimal.valueOf(p.impuesto.getPercent()*0.01))))
					.reduce(BigDecimal.ZERO, BigDecimal::add);
					//.map(p -> p.price.doubleValue())
					//.mapToDouble(m -> m.price.multiply((BigDecimal.valueOf(m.impuesto.getPercent()))).divide(new BigDecimal(100)).add(p.sum()));
		
			System.out.println("El precio de la compra es: "+ Precio);	
	      
	   }
	}