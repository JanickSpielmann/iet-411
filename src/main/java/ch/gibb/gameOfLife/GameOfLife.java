package ch.gibb.gameOfLife;

import java.util.Random;

public class GameOfLife {
    // global definierte Konstanten für die beiden Dimensionen
    final static int DIM1 = 15;
    final static int DIM2 = 15;

    // liefert eine zufällig initialisierte Welt
    public static boolean[][] initWelt() {

        boolean[][] welt = new boolean[DIM1][DIM2];
        for (int i = 0; i < 50; i++) {

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
                    System.out.print("_");
                }
            }
            System.out.println();

        }
    }

    // wendet die 4 Regeln an und gibt die
    // Folgegeneration wieder zurück
    public static boolean[][] wendeRegelnAn(boolean[][] welt) {
        boolean[][] welt0 = welt;

        for (int zeile = 1; zeile < DIM1; zeile++) {
            for (int spalte = 1; spalte < DIM2; spalte++) {
                int nachbarn = getNachbarn(welt, zeile, spalte);
                welt0[zeile-1][spalte-1] = false;
                if(nachbarn == 3){
                    welt0[zeile-1][spalte-1] = true;
                } else if(welt[zeile][spalte-1] && nachbarn == 2){
                    welt0[zeile-1][spalte-1] = true;
                }
            }
        }
        return welt0;
    }

    private static int getNachbarn(boolean[][] welt, int zeile, int spalte) {
        int nachbarn = 0;
        for (int i = zeile - 1; i < zeile + 1; i++) {
            for (int j = spalte - 1; j < spalte + 1; j++) {
                if (welt[i][j]) {
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
        for (int i=1; i<=8; i++){
            new BooleanArrayDisplay(welt);
            welt = wendeRegelnAn(welt);
            System.out.println();
            System.out.println("Generation "+i);
            System.out.println();
            zeigeWelt(welt);

        }
    }
}
