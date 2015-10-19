package com.example.ugur.gateau;

/**
 * Created by Ugur on 19/10/2015.
 */
public class Gateau {

    protected String nom; //protected permet d'utiliser par les enfants
    private int tempsDeCuisson;
    private int tempsDePreparation=20;

    //Getter pour nom et temps de cuisson du gateau

    public String getNom(){
        return this.nom;
    }

    public int getTempsDeCuisson(){
        return this.tempsDeCuisson;
    }

    public int getTempsDePreparation(){
        return this.tempsDePreparation;
    }

    //Setter pour modifier le temps de cuisson

    public void setTempsDeCuisson(int param1){
        this.tempsDeCuisson = param1;
    }

    public void setNom(String param2){
        this.nom = param2;
    }
}
