package com.example.ugur.gateau;

/**
 * Created by Ugur on 19/10/2015.
 */
public class Tarte extends Cake {

    private boolean pateOuPas;

    //On créer le getter pour savoir si la tarte à une pate ou pas

    public boolean isPateOuPas(){
        return pateOuPas;
    }

    //Initialiseur de Tarte
    public Tarte(String param){
        this.nom = param;
    }
}
