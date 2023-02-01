package com.cocheCRUD;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CocheCRUDImpl implements CocheCRUD {
    List<Coche> ListaCoche = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    @Override
    public void save(Coche cocheNuevo) { //String color, String fabricante, String modelo, Double peso, Double largo
        System.out.print("Ingresa el color del coche: "); cocheNuevo.color = scan.nextLine();
        System.out.print("El fabricante es: "); cocheNuevo.fabricante = scan.nextLine();
        System.out.print("El modelo es: "); cocheNuevo.modelo = scan.nextLine();
        System.out.print("Peso: "); cocheNuevo.peso = scan.nextDouble();
        System.out.print("Largo: "); cocheNuevo.largo = scan.nextDouble();
        ListaCoche.add(cocheNuevo);
    }

    @Override
    public List<Coche> findAll() {
        return ListaCoche;
    }

    @Override
    public void delete(Coche coche) {
        System.out.println("Se borraran empleados");
    }
}
