/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad5;


import java.util.Scanner;

/**
 *
 * @author RicardoMoo
 */
public class Actividad5 {
    public static void ejercicio1(){
        String diasSem[] = new String [7];
        diasSem = new String[7];
        diasSem [0] = "Lunes";
        diasSem [1] = "Martes";
        diasSem [2] = "Miercoles";
        diasSem [3] = "Jueves";
        diasSem [4] = "Viernes";
        diasSem [5] = "sabado";
        diasSem [6] = "domingo";
    }
    
    public static void ejercicio2(){
        System.out.println("Matriz de personajes");
        String sWar[][] = new String[3][4];
        sWar[0][0]="Darth Vader";
        sWar[0][1]="Luke Skywalker";
        sWar[0][2]="Han solo";
        sWar[0][3]="Lea Organa";
        sWar[1][0]="Obi-Wan Kenobi";
        sWar[1][1]="Chewbacca";
        sWar[1][2]="Yoda";
        sWar[1][3]="Palpatine";
        sWar[2][0]="R2-D2";
        sWar[2][1]="C-3PO";
        sWar[2][2]="Boba Fett";
        sWar[2][3]="Darth Maul";
        int i,j;
        for (i = 0;i < sWar.length; i++){
            for(j = 0; j < sWar[i].length; j++){
                System.out.print("["+sWar[i][j]+"]");
                
            }
        }   
    }
    public static void ejercicio3(){
        String aCodigo[][]  = new String[26][2];
        
        aCodigo[0][0] = "A";
        aCodigo[1][0] = "B";
        aCodigo[2][0] = "C";
        aCodigo[3][0] = "D";
        aCodigo[4][0] = "E";
        aCodigo[5][0] = "F";
        aCodigo[6][0] = "G";
        aCodigo[7][0] = "H";
        aCodigo[8][0] = "I";
        aCodigo[9][0] = "J";
        aCodigo[10][0] = "K";
        aCodigo[11][0] = "L";
        aCodigo[12][0] = "M";
        aCodigo[13][0] = "N";
        aCodigo[14][0] = "O";
        aCodigo[15][0] = "P";
        aCodigo[16][0] = "Q";
        aCodigo[17][0] = "R";
        aCodigo[18][0] = "S";
        aCodigo[19][0] = "T";
        aCodigo[20][0] = "U";
        aCodigo[21][0] = "V";
        aCodigo[22][0] = "W";
        aCodigo[23][0] = "X";
        aCodigo[24][0] = "Y";
        aCodigo[25][0] = "Z";
    
        aCodigo[0][1] = ".-";
        aCodigo[1][1] = "-...";
        aCodigo[2][1] = "-.-.";
        aCodigo[3][1] = "-..";
        aCodigo[4][1] = ".";
        aCodigo[5][1] = "..-.";
        aCodigo[6][1] = "--.";
        aCodigo[7][1] = "...";
        aCodigo[8][1] = "..";
        aCodigo[9][1] = ".---";
        aCodigo[10][1] = "-.-";
        aCodigo[11][1] = ".-..";
        aCodigo[12][1] = "--";
        aCodigo[13][1] = "-.";
        aCodigo[14][1] = "---";
        aCodigo[15][1] = ".--.";
        aCodigo[16][1] = "--.-";
        aCodigo[17][1] = ".-.";
        aCodigo[18][1] = "...";
        aCodigo[19][1] = "-";
        aCodigo[20][1] = "..-";
        aCodigo[21][1] = "...-";
        aCodigo[22][1] = ".--";
        aCodigo[23][1] = "-..-";
        aCodigo[24][1] = "-.--";
        aCodigo[25][1] = "--..";
        
        for (int i = 0; i < aCodigo.length; i++) {
            System.out.println(aCodigo[i][0]+" : "+ aCodigo[i][1]);
        }
    }

    public static void ejercicio4(){
        System.out.println("Ingrese una palabra sin espacios:");
        Scanner leer = new Scanner(System.in);
        String palabra = leer.next();
        char [] aChar = palabra.toCharArray();
        for (int i = 0; i < aChar.length; i++) {
            System.out.println(aChar[i]);

        }
    }
    
    public static void ejercicio5(){
        String aCodigo[][]  = new String[26][2];
        
        aCodigo[0][0] = "A";
        aCodigo[1][0] = "B";
        aCodigo[2][0] = "C";
        aCodigo[3][0] = "D";
        aCodigo[4][0] = "E";
        aCodigo[5][0] = "F";
        aCodigo[6][0] = "G";
        aCodigo[7][0] = "H";
        aCodigo[8][0] = "I";
        aCodigo[9][0] = "J";
        aCodigo[10][0] = "K";
        aCodigo[11][0] = "L";
        aCodigo[12][0] = "M";
        aCodigo[13][0] = "N";
        aCodigo[14][0] = "O";
        aCodigo[15][0] = "P";
        aCodigo[16][0] = "Q";
        aCodigo[17][0] = "R";
        aCodigo[18][0] = "S";
        aCodigo[19][0] = "T";
        aCodigo[20][0] = "U";
        aCodigo[21][0] = "V";
        aCodigo[22][0] = "W";
        aCodigo[23][0] = "X";
        aCodigo[24][0] = "Y";
        aCodigo[25][0] = "Z";
    
        aCodigo[0][1] = ".-";
        aCodigo[1][1] = "-...";
        aCodigo[2][1] = "-.-.";
        aCodigo[3][1] = "-..";
        aCodigo[4][1] = ".";
        aCodigo[5][1] = "..-.";
        aCodigo[6][1] = "--.";
        aCodigo[7][1] = "...";
        aCodigo[8][1] = "..";
        aCodigo[9][1] = ".---";
        aCodigo[10][1] = "-.-";
        aCodigo[11][1] = ".-..";
        aCodigo[12][1] = "--";
        aCodigo[13][1] = "-.";
        aCodigo[14][1] = "---";
        aCodigo[15][1] = ".--.";
        aCodigo[16][1] = "--.-";
        aCodigo[17][1] = ".-.";
        aCodigo[18][1] = "...";
        aCodigo[19][1] = "-";
        aCodigo[20][1] = "..-";
        aCodigo[21][1] = "...-";
        aCodigo[22][1] = ".--";
        aCodigo[23][1] = "-..-";
        aCodigo[24][1] = "-.--";
        aCodigo[25][1] = "--..";
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe una palabra solo en MAYUSCULA:");
        //sobre aviso no hay falsedad xd
        String palabra = leer.next();
        int Tpagar = 10;
        int asciiValue;
        char cChar;
        int x=0;
        char [] aChar = palabra.toCharArray();
        for (int i = 0; i < aChar.length; i++) {
            cChar = aChar[i];
            asciiValue= (int) cChar;
            x = i;  
            switch (asciiValue) {
                case 65: System.out.println("A:"+aCodigo[65-65][1]);
                    break;
                case 66: System.out.println("B:"+aCodigo[66-65][1]);
                    break;
                case 67: System.out.println("C:"+aCodigo[67-65][1]);
                    break;
                case 68: System.out.println("D:"+aCodigo[68-65][1]);
                    break;
                case 69: System.out.println("E:"+aCodigo[68-65][1]);
                    break;
                case 70: System.out.println("F:"+aCodigo[69-65][1]);
                    break;
                case 71: System.out.println("G:"+aCodigo[70-65][1]);
                    break;
                case 72: System.out.println("H:"+aCodigo[71-65][1]);
                    break;
                case 73: System.out.println("I:"+aCodigo[72-65][1]);
                    break;
                case 74: System.out.println("J:"+aCodigo[73-65][1]);
                    break;
                case 75: System.out.println("K:"+aCodigo[74-65][1]);
                    break;
                case 76: System.out.println("L:"+aCodigo[75-65][1]);
                     break;
                case 77: System.out.println("M:"+aCodigo[76-65][1]);
                     break;
                case 78: System.out.println("N:"+aCodigo[77-65][1]);
                     break;
                case 79: System.out.println("O:"+aCodigo[78-65][1]);
                    break;
                case 80: System.out.println("P:"+aCodigo[79-65][1]);
                    break;
                case 81: System.out.println("Q:"+aCodigo[80-65][1]);
                    break;
                case 82: System.out.println("R:"+aCodigo[81-65][1]);
                    break;
                case 83: System.out.println("S:"+aCodigo[82-65][1]);
                    break;
                case 84: System.out.println("T:"+aCodigo[83-65][1]);
                    break;
                case 85: System.out.println("U:"+aCodigo[84-65][1]);
                    break;
                case 86:  System.out.println("V:"+aCodigo[85-65][1]);
                    break;
                case 87: System.out.println("W:"+aCodigo[86-65][1]);
                    break;
                case 88: System.out.println("X:"+aCodigo[87-65][1]);
                    break;
                case 89: System.out.println("Y:"+aCodigo[88-65][1]);
                    break;
                case 90: System.out.println("Z:"+aCodigo[89-65][1]);
                    break;
            }
        }
        if (x<=aChar.length) {
                if (x<=4) {
                    System.out.println("total a pagar ="+ Tpagar);
                }
                else{
                    int extra = x-4;
                    for (int j = 0; j < extra; j++) {
                        Tpagar = Tpagar +3;
                    }
                    System.out.println("total a pagar mas el extra ="+ Tpagar);
                }
            }
    
    }
    public static void ejercicio6(){
        System.out.println("ingresa un sexo:");
        Scanner leer = new Scanner(System.in);
        String sWar[][] = new String[3][10];
        sWar[0][0]="Darth Vader";
        sWar[1][0]="2,03 m";
        sWar[2][0]="male";
        
        sWar[0][1]="Luke Skywalker";
        sWar[1][1]="1.72 m";
        sWar[2][1]="male";
        
        sWar[0][2]="Han solo";
        sWar[1][2]="1.8 m";
        sWar[2][2]="male";
        
        sWar[0][3]="Lea Organa";
        sWar[1][3]="2,03 m";
        sWar[2][3]="female";
        
        sWar[0][4]="Asoka Tano";
        sWar[1][4]="1.88 m";
        sWar[2][4]="female";
        
        sWar[0][5]="Rey Skywalker";
        sWar[1][5]="1.7 m";
        sWar[2][5]="female";
        
        sWar[0][6]="Jabba el Hutt";
        sWar[1][6]="3,9 m";
        sWar[2][6]="hermafrodita";
        
        sWar[0][7]="Zorba Desilijic";
        sWar[1][7]="3,03 m";
        sWar[2][7]="hermafrodita";
        
        sWar[0][8]="R2-D2";
        sWar[1][8]="2,03 m";
        sWar[2][8]="programming";
        
        sWar[0][9]="C-3PO";
        sWar[1][9]="2,03 m";
        sWar[2][9]="programming";
        String nameS = leer.next();
        switch(nameS){
            case "male": 
                for (int i = 0; i < 3; i++) {
                    System.out.println(sWar[0][i]);
                }
                break;
            case "femele":
                for (int i = 3; i < 5; i++) {
                    System.out.println(sWar[0][i]);
                }
                break;
            case "hermafrodita":
                for (int i = 5; i < 7; i++) {
                    System.out.println(sWar[0][i]);
                }
                break;
            case "programming":
                for (int i = 7; i < 9; i++) {
                    System.out.println(sWar[0][i]);
                }
                break;
            
        }
        
        
    }
    
    

    public static void main(String[] args) {
        System.out.println("ingrese el numero del ejercicio, del 1 al 6");
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();
        switch (num){
            case 1:
                ejercicio1();
                break;
            case 2:
                ejercicio2();
                break;
            case 3:
                ejercicio3();
                break;
            case 4:
                ejercicio4();
                break;
            case 5:
                ejercicio5();
                break;
            case 6:
                ejercicio6();
                break;
        }
    
    }
    
}
