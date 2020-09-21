package com.company;
import java.util.Arrays;
public class Maticova_sifra {
    public int key;

    public Maticova_sifra() {

    }
    public char[]zasifruj_Text(char[]otvoreny_Text,int key){
        this.key=key;
        char[] zasifrovany = new char[otvoreny_Text.length];
        int b = this.n(key);
        int a = otvoreny_Text.length/b;
        char[][] matica = new char[a][b];
        int counter=0;

        for(int i = 0; i<a;i++ ){
            for(int j = 0; j<b;j++ ){
                matica[i][j]=otvoreny_Text[counter];
                counter++;
            }
        }

        this.printMatica(matica,a,b);

        int[] poradie=new int[b];

        for(int i =b-1;i>=0;i--){
            poradie[i]=key%10;
            key=key/10;

        }
        //Arrays.sort(poradie);
        //System.out.println(poradie);
        char zasifrovana_matica[][]=new char[a][b];
        for(int i = 0; i<a;i++ ){
            for(int j = 0; j<b;j++ ){
                matica[i][j]=otvoreny_Text[counter];
                counter++;
            }
        }


        return zasifrovany;
    }

    public int n(int number){
        int digits=0;
        if (number<0)
            digits =1;
        while (number>0){
            number /=10;
            digits++;


        }

        return digits;
    }

    public void printMatica(char[][]matica,int a,int b){

        for(int i = 0; i<a;i++ ){
            for(int j = 0; j<b;j++ ){
                System.out.print(matica[i][j]+ " ");

            }
            System.out.print('\n');
        }



    }



}
