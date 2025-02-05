package com.civil.stiff.estructuras.transversales;



public interface InterfaceElementos {

    // Metodo para  normalizar unidades
    default double  normalizarUnidadLonitud(UnidadesLongitud unidadesLongitud, double valor){

        switch(unidadesLongitud){
            case m:  valor= valor;
                break;
            case cm: valor= valor/100;
                break;

        }
        return valor;
    }

    default double  normalizarUnidadArea(UnidadesArea unidadesArea, double valor){

        switch(unidadesArea){
            case m2:  valor= valor;
                break;
            case cm2: valor= valor/1000;
                break;

        }
        return valor;
    }
    default double  normalizarUnidadPresion(UnidadesPresion unidadesPresion, double valor){

        switch(unidadesPresion){
            case Pa:  valor= valor;
                break;
            case kPa: valor= valor*1000;
                break;
            case MPa: valor= valor*1000000;
                break;
            case GPa: valor= valor*1000000000;
                break;
        }
        return valor;
    }

}
