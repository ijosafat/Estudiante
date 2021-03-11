/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiante;

/**
 *
 * @author Myke
 */
import java.util.Scanner;
public class datosEstudiante {

    private Scanner teclado;
    private String nombre;
    private String apellido;
    private int edad;
    private String materia;

    //Constructor
    public datosEstudiante() {
    }

    //Metodo inicializar
    public void inicializar() {
        teclado = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        nombre = teclado.next();
        System.out.print("Ingrese su apellido: ");
        apellido = teclado.next();
        System.out.print("Ingrse su edad: ");
        edad = teclado.nextInt();
    }

    public void materias() {
        teclado = new Scanner(System.in);
        System.out.print("Ingrese materia 1: ");
        materia = teclado.next();
        System.out.print("Ingrese materia 2: ");
        materia = teclado.next();
        System.out.print("Ingrese materia 3: ");
        materia = teclado.next();
        System.out.print("Ingrese materia 4: ");
        materia = teclado.next();
        System.out.print("Ingrese materia 5: ");
        materia = teclado.next(); //creo que aca esta el error en ese .next
    }
    //Metodo imprimir

    public void imprimir() {
        System.out.println("Nombre:" + nombre);
        System.out.println("Apellido:" + apellido);
        System.out.println("Edad:" + edad);
        System.out.println("Materia 1:" + materia);
        System.out.println("Materia 2:" + materia);
        System.out.println("Materia 3:" + materia);
        System.out.println("Materia 4:" + materia);
        System.out.println("Materia 5:" + materia);
    }
}
