package com.cocheCRUD;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nAgregados;
        CocheCRUD cocheCrud = new CocheCRUDImpl();
        System.out.print("Cuantos coches quieres agregar: "); nAgregados = scan.nextInt();
        for(int i=0; i<nAgregados; i++){
            System.out.println("Datos coche "+(i+1));
            cocheCrud.save(new Coche());
        }

        //Consultar coches
        System.out.println(cocheCrud.findAll());
    }
}
