package com.example.ugur.gateau;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    private Cake monCake;
    private Cake monCake1;
    private Cake monCake2;
    private Cake tableauDeCake[] = new Cake[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        monCake= new Cake("LeCakeDePapa");
        monCake1= new Cake("LeCakeDePhilippe");
        monCake2=new Cake("LeCakeDugur");

        tableauDeCake[0] = monCake;
        tableauDeCake[1] = monCake1;
        tableauDeCake[2] = monCake2;

        for(Cake cake : tableauDeCake)
        {
            Log.e("",""+cake.getNom());
            Log.e("", "" +cake.getTempsDePreparation());
        }

        Log.e("",""+tableauDeCake[1].getNom());

        Cake monCakeTemporaire = tableauDeCake[2];







    }


}
