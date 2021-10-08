package com.company;

public class Game {

    Menu menuPrincipal;
    ConfigDados configDados;
    Juegodados juegodados = new Juegodados();


    private int ganadas = 0;
    private int totales = 0;

    public int getGanadas() {
        return ganadas;
    }
    public int getTotales() {
        return totales;
    }

    public void setPartidasGanadas() {
        this.ganadas++;
    }
    public void setPartidasJugadas() {
        this.totales++;
    }

    boolean salir;

    public Game() {
        configDados = new ConfigDados();
        menuPrincipal = new Menu(this, configDados);
        salir = false;
    }

    public void start() {
        do {
            menuPrincipal.menuprincipal();
            if (!salir) {
                switch (configDados.getJoc()) {
                    case 1:
                        menuPrincipal.menudados();
                        break;
                    case 2:
                        System.out.println("DadosVS aun no está disponible");
                        break;
                    case 3:
                        System.out.println("Juego aun no revelado");
                        break;
                }
            }else{
                System.out.println("****************************************");
                System.out.println("* RESUMEN Y RESULTADOS DE LAS PARTIDAS *");
                System.out.println("****************************************");
                System.out.println("* Partidas jugadas: "+ getTotales() +"                  *");
                System.out.println("* Partidas ganadas: "+ getGanadas() + "                  *");
                System.out.println("****************************************");
                System.out.println("*          HASTA LA PRÓXIMA            *");
                System.out.println("****************************************");

            }
        }
        while (!salir);
    }

    public void play() {
        System.out.printf("Jugador %d\nComienza el juego... (nivel %d)\n", configDados.getNumPlayer(), configDados.getLevel());
        juegodados.jugar();
        if (juegodados.gana()) {
            System.out.println(juegodados.toString());
            configDados.setLevel(configDados.getLevel() + 1);
            setPartidasJugadas();
            setPartidasGanadas();
        }else{
            System.out.println("Mala suerte, prueba de nuevo :)");
            setPartidasJugadas();
        }


    }
}
