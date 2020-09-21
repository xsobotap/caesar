package com.company;



public class Main {



    public static void main(String[] args) {
        // write your code here
        Cesarova_sifra cesarova_sifra = new Cesarova_sifra();
        Maticova_sifra maticova_sifra = new Maticova_sifra();

        char[] otvoreny_Text={'a','b','c','d','e','f','g','h','i'};
        char[] zasifrovany_Text;// = new char[otvoreny_Text.length];
        char[] odsifrovany_Text ;//= new char[otvoreny_Text.length];
        zasifrovany_Text=cesarova_sifra.zasifruj_Text(otvoreny_Text,2);
        odsifrovany_Text=cesarova_sifra.odsifruj_Text(zasifrovany_Text,2);

        System.out.println(zasifrovany_Text);
        System.out.println(odsifrovany_Text);

        zasifrovany_Text=maticova_sifra.zasifruj_Text(otvoreny_Text,213);


    }
}