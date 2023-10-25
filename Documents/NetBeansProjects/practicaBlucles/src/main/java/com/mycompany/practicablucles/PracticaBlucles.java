/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
vento de curso
Descripción
Se quiere diseñar un programa que haga cálculos sobre las notas de N alumnos que asisten a un curso. El profesor de dicho curso ha realizado M exámenes, que definirán la nota final de cada alumno.

Realizar un programa que genere un array de N alumnos x M notas por alumno que tenga las siguientes características:

1.       El programa deberá preguntar por el número total de alumnos de la clase, y luego por el número total de exámenes que se han realizado durante el curso.
                ( pregunta sobre el numero total de alumnos  y se guarde en filas y numero total de examenes en columnas - array bidimencional) 
                (debo guardar el valor en variables)

2.       Posteriormente, pedirá que se introduzcan las notas de cada alumno, para cada examen.

3.       Luego mostrará un menú con las siguientes opciones:

a.       Listar alumnos y sus notas.

b.       Calcular la media de cada alumno.

c.       Calcular la media total de la clase.

d.       Salir (*).

(*) En la cuarta opción es cuando único se finalizará la ejecución del programa. Si se seleccionan una de las otras tres opciones se repetirá el menú tantas veces como crea conveniente el usuario.

Debes entregar una memoria en PDF llamada UF1_A2_NombreApellidos.pdf con capturas del código y de la salida que genere el programa, donde se elijan las 4 opciones, y se vea que funcionan.
 */
package com.mycompany.practicajava;

/**
 * @author FranciscoSantiagoSac
 */
import java.util.Scanner;

public class PracticaJava {

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce la cantidad de Alumnos");
    int cantidadAlumnos = sc.nextInt();

    System.out.print("Introduce la cantidad de examenes");
    int cantidadExamenes = sc.nextInt();

    double alumnosExamenes[][] = new double[cantidadAlumnos][cantidadExamenes];

    for (int i = 0; i < alumnosExamenes.length; i++) {

        for (int j = 0; j < alumnosExamenes[i].length; j++) {

            System.out.print("Ingresa la nota del alumno" + (i + 1) + "en el examen" + (j + 1));
            alumnosExamenes[i][j] = sc.nextDouble();
        }
    }

    int menu; //no es necesario especificar valor.
    boolean condicion = true;

    while (condicion != false) {
        System.out.print("Elegir la opcion correspondiente :  1-listar Alumnos y sus notas ; 2-Calcular la Media de Cada Alumno; 3-Calcular la media total de la clase; 4- Salir del programa ");
        menu = sc.nextInt();

        switch (menu) {
            case 1 -> {
                for (int i = 0; i < alumnosExamenes.length; i++) {
                    for (int j = 0; j < alumnosExamenes[i].length; j++) {
                        System.out.println(" El alumno " + (i + 1) + " saco la nota " + alumnosExamenes[i][j]);
                    }

                }
            }
            case 2 -> {
                for (int i = 0; i < alumnosExamenes.length; i++) {
                    double sumaNota = 0;
                    int totalExamenes = 0;//variable contadora para q el programa sea mas robusto y  resetee a cero el primer recorrido 
                    for (int j = 0; j < alumnosExamenes[i].length; j++) {
                        sumaNota = alumnosExamenes[i][j] + sumaNota;//sumando datos de las filas
                        totalExamenes++; //sumando las filas en si mismo 

                    }
                    double mediaAlumno = sumaNota / totalExamenes;// o alumnosExamenes.[i].length
                    System.out.println("la media del alumno " + (i + 1) + " es " + mediaAlumno);
                }

            }
            case 3 -> {

                double sumaNotaClase = 0;
                int totalExamenes = 0;
                for (int i = 0; i < alumnosExamenes.length; i++) {

                    for (int j = 0; j < alumnosExamenes[i].length; j++) {
                        sumaNotaClase = alumnosExamenes[i][j] + sumaNotaClase;

                        totalExamenes++;
                    }

                }
                double mediaTotal = sumaNotaClase / totalExamenes;

                System.out.println("La media total de " + mediaTotal);
            }
            case 4 -> {
                System.out.print("Se finaliza el programa");
                condicion = false;
            }

            default ->
                System.out.print("Ingresa un caracter valido");
        }
    }

}

}
