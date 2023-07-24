package org.example;

import org.example.Validacion.LocalValidacion;
import org.example.Validacion.ReservaValidacion;
import org.example.trabajo.Local;
import org.example.trabajo.Oferta;
import org.example.trabajo.Reserva;
import org.example.trabajo.Usuario;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
            Scanner teclado = new Scanner(System.in);
            Usuario usuario = new Usuario();
            Local local=new Local();
            Reserva reserva = new Reserva();
            Oferta oferta = new Oferta();

            System.out.print("*****Bienvenido******");
            System.out.println("1: Recogiendo datos Del Usuario:");
            System.out.print("Digita tus nombres y apellidos: ");
            usuario.setNombres(teclado.nextLine());

            System.out.print("Digita tu correo electronico: ");
            usuario.setCorreo(teclado.nextLine());

            System.out.println("Digita tu ubicacion:");
            usuario.setUbicacion(teclado.nextInt());

            System.out.println(usuario);
            System.out.println("............................................");
            System.out.println("digite su numero de nit:");
            local.setNit(teclado.nextInt());

            teclado.nextLine();

            System.out.println("digte el nombre de la empresa:");
            local.setNombre(teclado.nextLine());
            System.out.println("............................................");

            System.out.println("Digite la fecha de reserva:");
            reserva.setFechaReserva(teclado.nextLine());

            System.out.println("Digite el numero de personas para la reserva:");
            reserva.setNumeroDePersonas(teclado.nextInt());
            System.out.println("............................................");

            teclado.nextLine();

            System.out.println("Digite el titulo del evento:");
            oferta.setTitulo(teclado.nextLine());

            System.out.println("Digite la fecha de inicio del evento:");
            oferta.setFechaInicio(teclado.nextLine());

            System.out.println("digite la fecha de finalizacion del evento");
            oferta.setFechaFin(teclado.nextLine());
        }
    }
