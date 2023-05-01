package ch.gibb.gameOfLife;

import java.util.Random;

public class GameOfLife {
    // global definierte Konstanten für die beiden Dimensionen
    final static int DIM1 = 12;
    final static int DIM2 = 12;

    // liefert eine zufällig initialisierte Welt
    public static boolean[][] initWelt() {

        boolean[][] welt = new boolean[DIM1][DIM2];
        for (int i = 0; i < 60; i++) {

            Random random = new Random();
            welt[random.nextInt(1, DIM1-1)][random.nextInt(1,DIM2-1)] = true;
        }
        return welt;
    }

    // gibt die aktuelle Welt aus
    public static void zeigeWelt(boolean[][] welt) {
        for (int zeile = 0; zeile < DIM1; zeile++) {
            for (int spalte = 0; spalte < DIM2; spalte++) {

                if (welt[zeile][spalte]) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // wendet die 4 Regeln an und gibt die
    // Folgegeneration wieder zurück
    public static boolean[][] wendeRegelnAn(boolean[][] welt) {
        boolean[][] welt0 = welt;
        boolean[][] welt1 = welt;

        for (int zeile = 1; zeile < DIM1-1; zeile++) {
            for (int spalte = 1; spalte < DIM2-1; spalte++) {
                int nachbarn = getNachbarn(welt0, zeile, spalte);
                welt0[zeile][spalte] = false;
                if(welt1[zeile][spalte] && nachbarn >= 2 && nachbarn <= 3)
                    welt0[zeile][spalte] = true;
                else if(!welt[zeile][spalte] && nachbarn == 3){
                    welt0[zeile][spalte] = true;
                } else {
                    welt0[zeile][spalte] = false;
                }
            }
        }
        return welt0;
    }

    private static int getNachbarn(boolean[][] welt0, int zeile, int spalte) {
        int nachbarn = 0;
        for (int i = zeile - 1; i < zeile + 1; i++) {
            for (int j = spalte - 1; j < spalte + 1; j++) {
                if (welt0[i][j]) {
                    nachbarn++;
                }
            }
        }
        return nachbarn;
    }

    public static void main(String[] args) {
        boolean[][] welt = initWelt();
        System.out.println("Startkonstellation");
        zeigeWelt(welt);
        for (int i=1; i<=10; i++){
            welt = wendeRegelnAn(welt);
            System.out.println("Generation "+i);
            zeigeWelt(welt);
        }
    }
}
