package com.orange.topics.array;

public class ArrayMainClass {
    public static void main(String args[]) {
        // one dimension array
        // arrayType [] arrayName = {value1,value2,value3};
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String carValue : cars) {
            System.out.print(carValue + " , ");
        }

        System.out.println();
        Object[] objects = {"String", new Integer(1), new Double(2), new Boolean(true)};
        for (Object objValue : objects) {
            System.out.print(objValue + " , ");
        }

        // we can also set the size of the array on initialization
        //  arrayType [] arrayName = new arrayType[size];
        // and the value is set : arrayName[location] = value;
        System.out.println();
        String stringArraySizeTwo[] = new String[2];
        stringArraySizeTwo[0] = "a";
        stringArraySizeTwo[1] = "b";
        for (String stringValue : stringArraySizeTwo) {
            System.out.print(stringValue + " , ");
        }


        //Multidimensional Arrays :  A multidimensional array is an array containing one or more arrays.
        //To create a two-dimensional array, add each array within its own set of curly braces:
        // int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        // and array with size two that contains 2 int array
        // we can think as an array, that holds arrays, and the arrays are of type int, and each array can have a different size
        // the int(for example) is the value type that can be stored in the arrays that are inside the array (hope it makes sens)
        int[][] myNumbers = {{1, 2, 3, 4},
                {5, 6, 7}};

        System.out.println();
        int[] oneDimentionArrayOne = myNumbers[0]; // this is the first array held in the array of arrays =  {1, 2, 3, 4}
        int[] oneDimentionArrayTwo = myNumbers[1];// this is the second array held in the array of arrays = {5, 6, 7}
        System.out.print("oneDimentionArrayOne : ");
        for (int intValue : oneDimentionArrayOne) {
            System.out.print(intValue + " , ");
        }
        System.out.println();
        System.out.print("oneDimentionArrayTwo : ");
        for (int intValue : oneDimentionArrayTwo) {
            System.out.print(intValue + " , ");
        }
    }
}
