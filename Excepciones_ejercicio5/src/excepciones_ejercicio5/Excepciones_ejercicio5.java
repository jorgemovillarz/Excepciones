package excepciones_ejercicio5;

import java.util.Random;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author jorge
 */
//Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora 
//debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para 
//ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el 
//número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando 
//consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario 
//ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe 
//controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el 
//carácter fallido como un intento
public class Excepciones_ejercicio5 {

    public static void main(String[] args) {

        Random numAleatorio = new Random();
        int num = numAleatorio.nextInt(10); //Genera un número entero aleatorio

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el numero  adivinar. Buena suerte!");
        int cont = 0;
        int numIng = 0;
        while (numIng != num) {
            try {
                numIng = sc.nextInt();
                if (numIng > num) {

                    System.out.println("el numero ingresado es mayor al numero a adivinar");
                    cont++;
                } else if (numIng < num) {
                    System.out.println("el numero ingresado es menor al numero a adivinar");
                    cont++;
                } else {
                    System.out.println("Felicitaciones. Haz adivinado");
                    break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: ingresar un numero");
                cont++;
                sc.nextLine();
                
            }
        }

        System.out.println("usted ha fallado: " + cont + " veces");
    }

}
