package com.makabstu;
public class Main {
    public static void main(String[] args) {
        // write your code here
        //چند ارایه نوشته وحالت اول متد  را تست می کنیم
        System.out.println("====================test1====================");
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
        System.out.println("Array integerArray contains:");
        printArray(intArray);

        System.out.println("\nArray doubleArray contains:");
        printArray(doubleArray);

        System.out.println("\nArray characterArray contains:");
        printArray(charArray);
        System.out.println("====================test2====================");
        //از یکی از آرایه های قبل برای تست متد overload شده استفاده می کنیم
        printArray(intArray,2,4);


        //یک آرایه جدید از نوع string می نویسیم و متد overload شده راتست می کنیم
        System.out.println("====================test3====================");
        String[] stringArray={"ali","reza","saead"};
        printArray(stringArray); //


    }
    //یک متد می نویسیم که آرایه از نوعInteger ,Character,Double قبول کند
public static <E /*extends Integer & Double & Character*/>void printArray(E  [] inputArray) {
        // Display array elements
        for (E element : inputArray) {
            System.out.println( element);
        }
        System.out.println();
    }

    // متد قبل راoverload می کنیم تا بتواند دو اینتیجر با نام هایlowSubscript و highSubscriptقبول کند
    // و شرط خواسته شده را برسی و در صورت درس بودن آن را چاپ کند
    public static<E > void printArray(E[] inputArray, int lowSubscript ,int highSubscript ){
    int b =inputArray.length;
           if(lowSubscript < b && b>=highSubscript) {
               for (int i = lowSubscript-1; i <= highSubscript; i++) {
                   System.out.println(inputArray[i]);
               }
           }
               else {
                   throw new IllegalArgumentException("IllegalArgumentException");
           }
       }

//متد اولیه را به یک متذ غیر Genericو overload می کنیم
    public static void printArray(String[] inputArray){
        for(int i=0;i<inputArray.length;i++)
            System.out.println(inputArray[i]);

    }
}
