package org.example;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cantidad de notas");
        int cantidad = leer.nextInt();

        if (cantidad <=0){
            System.out.println("debe ser al menos una");
        }

        double suma = 0;
        for (int i = 0; i < cantidad; i++){
            System.out.println("ingresa la nota " + (i+1));
            double numero = leer.nextDouble();
            suma += numero;
        }
        double promedio = suma/cantidad;

        System.out.println("promedio: " +promedio);




    }
}