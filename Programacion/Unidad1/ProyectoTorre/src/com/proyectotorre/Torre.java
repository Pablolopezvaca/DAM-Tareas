/******************************************************************************************************************
 * 
 * Nombre: Pablo Isaac López Vaca 
 * Fecha: 11/10/2024 
 * Modulo: Programación. 
 * UD: UD1 Estructuras de un programa. 
 * Tarea: Tarea Evaluación 01. Realiza un programa en Java.
 * 
 * Descripción del programa: El objetivo de esta tarea es realizar un programa que visualice por consola una figura simétrica
 * 
 * Enlace autoevaluación:
 * 
 *******************************************************************************************************************/

package com.proyectotorre;

public class Torre {

	public static void main(String[] args) {
		
		// Métodos en total 3
		imprimirParteSuperiorEInferior();
		imprimirParteZigZag();
		imprimirParteColumna();
		imprimirParteSuperiorEInferior();
		
	}
		// Primer método
		public static void imprimirParteSuperiorEInferior() {
			
			for (int i = 0; i < 4; i++) {
				System.out.println("            ||");
			}
			
			imprimirSeccionConica();
			

	        System.out.println("|\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|");
			
		}
		
		//Segundo método
		public static void imprimirParteZigZag() {
			
	        
	        System.out.println("\\_/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\_/");
	        System.out.println("  \\_/\\/\\/\\/\\/\\/\\/\\/\\/\\_/");
	        System.out.println("     \\_/\\/\\/\\/\\/\\/\\_/");
	        System.out.println("        \\_/\\/\\/\\/\\_/");	
			
		}
		
		// Tercer método
		public static void imprimirParteColumna() {
			
			for(int i = 0; i < 5; i++) {
				System.out.println("            ||");
			}
			
		}
		
		// Método que se compila en el Método imprimirParteSuperiorEInferior()
		public static void imprimirSeccionConica() {
			
			System.out.println("         __/||\\__");
			
			for (int i = 0; i < 3; i++) {
	            // Calcula la cantidad de espacios para cada línea
	            for (int j = 3; j < 9 - 3 * i; j++) {
	                System.out.print(" ");
	            }
	            // Inicia la sección cónica
	            System.out.print("__/");
	            // Agrega los dos puntos por cada nivel
	            for (int k = 0; k < i + 1; k++) {
	                System.out.print(":::");
	            }
	            // Imprime el eje central
	            System.out.print("||");
	            // Agrega los dos puntos por cada nivel después del eje
	            for (int k = 0; k < i + 1; k++) {
	                System.out.print(":::");
	            }
	            // Cierra la sección cónica
	            System.out.println("\\__");
	        }
			
		}
}
