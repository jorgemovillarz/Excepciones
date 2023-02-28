/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciones_ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Excepciones_ejercicio4 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int resultado = 0;

        System.out.println("ingrese una texto");
        try {
            String palabra = sc.next();
            num = Integer.parseInt(palabra);
            resultado = 5 / 0;
        } catch (NumberFormatException e) {
            System.out.println("no se puede convertir string a int");
        } catch (InputMismatchException a) {
            System.out.println("error: digito algo incorrrecto");
        } catch (ArithmeticException i) {
            System.out.println("no se puede dividir entre 0");
        }

    }

}
