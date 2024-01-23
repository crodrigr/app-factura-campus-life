package com.campusland.utils;

import java.text.NumberFormat;
import java.util.Locale;

public class Formato {

    private Formato(){
        
    }

    public static String formatoMonedaPesos(double monto){
        Locale colombiaLocal=new Locale("es","CO");
        NumberFormat formatoMoneda=NumberFormat.getCurrencyInstance(colombiaLocal);
        return formatoMoneda.format(monto);

    }
    
}
