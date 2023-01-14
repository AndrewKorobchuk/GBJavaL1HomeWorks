package lesson4;

import java.util.Random;
import java.util.Scanner;

/**
 * Игра Крестики-нолики / Game Tic-tac-toe
 *
 */
public class MainApp {
    private static final int SIZE_MAP = 3;
    private static final char MAP_EMPTY = '_';
    private static final char MAP_X = 'X';
    private static final char MAP_0 = '0';

    private static Random rand = new Random();
    private static char[][] map;
    private static Scanner scanner = new Scanner(System.in);
    private static boolean res;
    public static void main(String[] args) {
        createMap();
        while (true){
            printMap();
            turnHuman();
            res = checkWin(MAP_X);
            if(res){
                System.out.println("Player won!");
                printMap();
                break;
            }
        //printMap();
            if(isMapFull()){
                System.out.println("Draw!");
                break;
            };

            turnComputer();
            res = checkWin(MAP_0);
            if(res){
                System.out.println("Computer won!");
                printMap();
                break;
            }
            if(isMapFull()){
                System.out.println("Draw!");
                break;
            };
        }
    }

    public static boolean checkWin(char value){
        boolean res;
        for (int i = 0; i < SIZE_MAP; i++) {
            res = true;
            for (int j = 0; j < SIZE_MAP; j++) {
                if(value != map[j][i]){
                    res = false;
                    break;
                }
            }
            if(res){
                return true;
            }
            res = true;
            for (int j = 0; j < SIZE_MAP; j++) {
                if(value != map[i][j]){
                    res = false;
                    break;
                }
            }
            if(res){
                return true;
            }
        }

        boolean res2=true;
        for (int i = 0; i < SIZE_MAP; i++) {
            if(value!=map[i][i]){
                res2=false;
                break;
            }
        }
        if (res2){
            return res2;
        }
        res2 = true;
        for (int i = 0; i < SIZE_MAP; i++) {
            if(value!=map[SIZE_MAP-i-1][i]){
                res2=false;
                break;
            }
        }
        return res2;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE_MAP; i++) {
            for (int j = 0; j < SIZE_MAP; j++) {
                if (map[i][j] == MAP_EMPTY) return false;
            }
        } return true;
    }

    public static void turnHuman(){
        int x,y;
        do{
            System.out.print("Enter X coordinate: ");
            x = scanner.nextInt() - 1;
            System.out.print("Enter Y coordinate: ");
            y = scanner.nextInt() - 1;
        } while (!isCoordinatValid(x,y));
        map[x][y] = MAP_X;
    }

    public static void turnComputer(){
        int x,y;
        do{
            x = rand.nextInt(SIZE_MAP);
            y = rand.nextInt(SIZE_MAP);
        } while (!isCoordinatValid(x,y));
        map[x][y] = MAP_0;
    }

    public static boolean isCoordinatValid(int x, int y){
        if(x<0||x>=SIZE_MAP || y<0 || y>=SIZE_MAP){
            return false;
        }
        if(map[x][y]==MAP_EMPTY){
            return true;
        }
        return false;
    }

    public static void createMap(){
        map = new char[SIZE_MAP][SIZE_MAP];
        for (int i = 0; i < SIZE_MAP; i++) {
            for (int j = 0; j < SIZE_MAP; j++) {
                map[i][j] = MAP_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE_MAP; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE_MAP; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE_MAP; j++) {
                System.out.print(map[i][j] + " ");
            } System.out.println();
        } System.out.println();
    }
}
