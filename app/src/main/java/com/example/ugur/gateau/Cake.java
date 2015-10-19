package com.example.ugur.gateau;

/**
 * Created by Ugur on 19/10/2015.
 */
public class Cake extends Gateau {

    private int farine;
    private int sucre;
    private int oeuf;


    //Getter pour les propriétés
    public int getFarine(){
        return this.farine;
    }

    public int getSucre(){
        return this.sucre;
    }

    public int getOeuf(){
        return this.oeuf;
    }

    //Setter pour les propriétés
    public void setFarine(int param){
        this.farine=param;
    }

    public void setSucre(int param){
        this.sucre=param;
    }

    public void setOeuf(int param){
        this.oeuf=param;
    }

    //Initialiseur ou constructeur du nom

    public Cake(){};

    public Cake(String param){ //le constructeur portera toujours le nom de la classe
        this.nom=param;
    }

}



