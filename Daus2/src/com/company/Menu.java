package com.company;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    int eleccion;
    Game game;
    ConfigDados confiDados;

    public Menu(Game game, ConfigDados configDados) {
        this.game = game;
        confiDados = configDados;
    }

    public void menuprincipal() {
        do {
            System.out.println();
            System.out.println("******************");
            System.out.println("* MENU PRINCIPAL *");
            System.out.println("******************");
            System.out.println("*  1 -> Dados    *");
            System.out.println("*  2 -> DadosVS  *");
            System.out.println("*  3 -> ??¿¿??   *");
            System.out.println("*  4 -> Salir    *");
            System.out.println("******************");
            eleccion = scanner.nextInt();
        }

        while (eleccion > 4 || eleccion < 1);

        if (eleccion == 4) game.salir = true;
        else confiDados.setJoc(eleccion);
    }

    public void menudados() {
        do {
            System.out.println("******************");
            System.out.println("*     DADOS      *");
            System.out.println("******************");
            System.out.println("*  1 -> Jugar    *");
            System.out.println("*  2 -> Ajustes  *");
            System.out.println("*  3 -> Salir    *");
            System.out.println("******************");
            eleccion = scanner.nextInt();
            switch (eleccion) {
                case 1:
                    game.play();
                    break;
                case 2:
                    ajustesdados();
                    break;
                case 3:
                    System.out.println("Saliendo...");

                    break;
                default:
                    System.out.println("Opción no disponible, prueba 1,2 o 3");
                    break;
            }
        } while (eleccion != 3);
    }

    private void ajustesdados() {
        do {
            System.out.println("******************");
            System.out.println("* AJUSTES DADOS  *");
            System.out.println("******************");
            System.out.println("* 1 -> Niveles   *");
            System.out.println("* 2 -> Jugadores *");
            System.out.println("* 3 -> Volver    *");
            System.out.println("******************");

            eleccion = scanner.nextInt();
            switch (eleccion) {
                case 1:
                    niveles();
                    break;
                case 2:
                    jugadores();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opción no disponible, prueba 1,2 o 3");
                    break;
            }
        } while (eleccion != 3);
        eleccion = 0;
    }
    private void niveles() {
        System.out.println("Que nivel de juego quieres?");
        confiDados.setLevel(scanner.nextInt());
    }
    private void jugadores() {
        System.out.println("Escoge el numero de jugadores entre (1-9)");
        confiDados.setNumPlayer(scanner.nextInt());
    }
}
