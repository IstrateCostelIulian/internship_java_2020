package com.orange.topics.exception;

public class SecondMainException {

    public static void main(String[] args) {


        try {
            int result = SecondaryClass.divideABException(1, 0);
            System.out.println(result);

        } catch (ArithmeticException er) {
            System.out.println("Exceptie in apelarea metodei divide");
            System.out.println(er.getMessage());
        }


        System.out.println("----------------------------");

        try {
            System.out.println(SecondaryClass.getFirstLetter(null));
            int result2 = SecondaryClass.divideAandB(7, 0);
            System.out.println(result2);
        } catch (Exception cce) {
            System.out.println(cce.getMessage());
            cce.printStackTrace();
        /*} catch (CheckedCustomException scex) {
            System.out.println(scex.getMessage());
            scex.printStackTrace();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();

         */
        } finally {
            System.out.println("Finally 3 ");
        }

    }
}
