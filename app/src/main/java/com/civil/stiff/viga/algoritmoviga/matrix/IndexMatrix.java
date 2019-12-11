package com.civil.stiff.viga.algoritmoviga.matrix;

import org.ejml.simple.SimpleMatrix;

import java.io.Serializable;

public final class IndexMatrix implements Serializable {

    private static SimpleMatrix m;
    private IndexMatrix(){}
    public static SimpleMatrix calculate(RegidityMatrix k, Integer [] dgreeFree, int lengthMatrix ){
        m= new SimpleMatrix(lengthMatrix, lengthMatrix);
        for(int i=0; i< k.calculate().numRows(); i++){
            for(int t=0; t< k.calculate().numCols(); t++){
                m.set(dgreeFree[i],dgreeFree[t], k.calculate().get(i,t));
            }
        }
        return  m;
    }
}
