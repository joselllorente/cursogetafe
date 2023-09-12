package es.curso.java.introduccion.ejercicios.arrays;

import java.util.Scanner;

public class NotasAlumnos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de alumnos: ");
        int numAlumnos = scanner.nextInt();

        double[] notas = new double[numAlumnos];

        // Guardar las notas de los alumnos
        for (int i = 0; i < numAlumnos; i++) {
            System.out.print("Ingrese la nota del alumno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Calcular la media
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        double media = suma / numAlumnos;

        // Calcular la nota máxima y mínima
        double notaMaxima = notas[0];
        double notaMinima = notas[0];

        for (int i = 1; i < numAlumnos; i++) {
            if (notas[i] > notaMaxima) {
                notaMaxima = notas[i];
            }
            if (notas[i] < notaMinima) {
                notaMinima = notas[i];
            }
        }

        // 	Mostrar resultados
        System.out.println("Media de las notas: " + media);
        System.out.println("Nota máxima: " + notaMaxima);
        System.out.println("Nota mínima: " + notaMinima);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // Ordenar las notas de mayor a menor (usando un algoritmo de burbuja)
        for (int i = 0; i < numAlumnos - 1; i++) {
            for (int j = 0; j < numAlumnos - 1 - i; j++) {
                if (notas[j] < notas[j + 1]) {
                    double temp = notas[j];
                    notas[j] = notas[j + 1];
                    notas[j + 1] = temp;
                }
            }
        }

        

        System.out.println("Notas ordenadas de mayor a menor:");
        for (double nota : notas) {
            System.out.println(nota);
        }

	}

}
