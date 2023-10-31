package com.mustafabaser.javabootcamp.oop.inheritance;

public class Villa extends Ev {
    private boolean garajVarMi;

    public Villa() {
    }

    public Villa(boolean garajVarMi) {
        this.garajVarMi = garajVarMi;
    }

    public boolean isGarajVarMi() {
        return garajVarMi;
    }

    public void setGarajVarMi(boolean garajVarMi) {
        this.garajVarMi = garajVarMi;
    }
}
