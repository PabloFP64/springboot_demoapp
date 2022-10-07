package demoapp.controller;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class NumData {
    @Min(value = -2147483648, message = "Age should not be less than -2147483648")
    @Max(value = 2147483647, message = "Age should not be greater than 2147483647")
    int numeroInt;

    public int getNumeroInt() {

        return numeroInt;
    }

    public void setNumeroInt(int numeroInt) {
        this.numeroInt = numeroInt;
    }
}
