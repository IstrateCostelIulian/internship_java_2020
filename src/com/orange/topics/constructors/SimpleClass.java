package com.orange.topics.constructors;

import java.util.Objects;

public class SimpleClass {

    private final int myInt;
    public final Double myDouble;
    private String myStr;
    public Boolean myBool;

    public SimpleClass(int myInt, Double myDouble) {
        this.myInt = myInt;
        this.myDouble = myDouble;
    }

    public SimpleClass(int myInt, Double myDouble, String myStr, Boolean myBool) {
        this.myInt = myInt;
        this.myDouble = myDouble;
        this.myStr = myStr;
        this.myBool = myBool;
    }

    public SimpleClass(Byte myByte, Float myFloat, char myChar, boolean myBool) {
        this.myInt = myByte;
        this.myDouble = myFloat.doubleValue();
        this.myStr = "" + myChar;
        this.myBool = myBool;
    }

    public int getMyInt() {
        return myInt;
    }


    public String getMyStr() {
        return myStr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleClass that = (SimpleClass) o;
        return myInt == that.myInt &&
                Objects.equals(myDouble, that.myDouble) &&
                Objects.equals(myStr, that.myStr) &&
                Objects.equals(myBool, that.myBool);
    }

    @Override
    public int hashCode() {
        return Objects.hash(myInt, myDouble, myStr, myBool);
    }
}
