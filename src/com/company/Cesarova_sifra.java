package com.company;

public class Cesarova_sifra {
    public static  int key;
    public char[] otvoreny_Text;
    public char[] zasiforvany_Text;

    public Cesarova_sifra() {

    }

    public char[] zasifruj_Text(char[]otvoreny_Text,int key){
        this.otvoreny_Text=otvoreny_Text;
        this.key=key;
        char[] zasifrovany= new char[otvoreny_Text.length];

        for(int i = 0;i < otvoreny_Text.length; i++){
            zasifrovany[i]=((char)((((((int)(otvoreny_Text[i]-'a')))+key)%26)+'a'));
        }


        return zasifrovany;

    }


    public char[] odsifruj_Text(char[]zasiforvany_Text,int key){
        this.zasiforvany_Text=zasiforvany_Text;
        this.key=key;
        char odsifrovany[] = new char[zasiforvany_Text.length];

        for(int i = 0;i < zasiforvany_Text.length; i++){
            if(((int)zasiforvany_Text[i]-'a')-key<0){

                odsifrovany[i]=((char)((((((int)(zasiforvany_Text[i]-'a')))-key)+26)+'a'));
            }else{
                odsifrovany[i]=((char)((((((int)(zasiforvany_Text[i]-'a')))-key)%26)+'a'));
            }


        }





        return odsifrovany;
    }


}
