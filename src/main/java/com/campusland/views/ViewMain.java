package com.campusland.views;

import java.util.Scanner;

import com.campusland.respository.impl.CrudReposotoryClienteImp;
import com.campusland.services.ServiceCliente;
import com.campusland.services.impl.ServiceClienteImpl;

public class ViewMain {

    public static final ServiceCliente serviceCliente = new ServiceClienteImpl(new CrudReposotoryClienteImp());
    public static final Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        int op = 0;

        do {

            op = menuMain();
            switch (op) {
                case 1:
                    ViewCliente.startMenu();
                    break;
                case 2:
                    System.out.println("Menu producto");
                    break;
                case 3:
                    System.out.println("Menu factura");
                    break;
                default:
                    System.out.println("Fin");
                    break;
            }

        } while (op >= 1 && op < 4);

    }

    public static int menuMain() {
        System.out.println("---Aplicación de Facturación-----");
        System.out.println("1. Modulo de Cliente");
        System.out.println("2. Modulo de Producto");
        System.out.println("3. Modulo de Factura");
        System.out.println("4. Salir:");
        return leer.nextInt();
    }
}