package com.atsaur;

public class PrimitiveDataStructures {
    PrimitiveDataStructures(){
        String myStr = "Hello";
        Integer myInt = 2147483647;
        Boolean myBool = Boolean.FALSE;
        Character myChar = 'A';
        Double myDuble = 90.30;
        Long myLong = 85L;
        Byte myByte = 127;
        Short myShort = -32768;
        Float myFloat = 95.38F;

        String strFacts = "Strings can be identified by only double quotation marks.";
        String intFacts = "Integers are numbers.\nIt can be a value in between -2147483648 and 2147483647 (Inclusive)";
        String booFacts = "If you are writing in java then you have to right Boolean.False or Boolean.True to create a Boolean";
        String charFacts = "To create a character variable, your character must be in between single quotation marks.";
        String dublFacts = "Although I have not tested this, the maximum and minimum values are 17 followed by 307 zeros";
        String longFacts = "To create a long variable, you must add an L to the end of your number to signify that it is a long and not an integer.";
        String byteFacts = "A byte is an 8 bit signed integer. \nIt can be a value in between -128 and 127 (Inclusive).";
        String shortFacts = "A short is a 16 bit signed integer. \nIt can be a value in between -32768 and 32767 (Inclusive)";
        String floatFacts = "To create a float variable, you must add an F to the end of your number to signify that it is a float and not a double.";

        System.out.println("This is an example of a String:");
        System.out.println(myStr);
        System.out.println(strFacts);
        System.out.println("\n");

        System.out.println("This is an example of an Integer:");
        System.out.println(myInt);
        System.out.println(intFacts);
        System.out.println("\n");

        System.out.println("This is an example of a Boolean:");
        System.out.println(myBool);
        System.out.println(booFacts);
        System.out.println("\n");

        System.out.println("This is an example of a Character:");
        System.out.println(myChar);
        System.out.println(charFacts);
        System.out.println("\n");

        System.out.println("This is an example of a Double:");
        System.out.println(myDuble);
        System.out.println(dublFacts);
        System.out.println("\n");

        System.out.println("This is an example of a Long:");
        System.out.println(myLong);
        System.out.println(longFacts);
        System.out.println("\n");

        System.out.println("This is an example of a Byte:");
        System.out.println(myByte);
        System.out.println(byteFacts);
        System.out.println("\n");

        System.out.println("This is an example of a Short:");
        System.out.println(myShort);
        System.out.println(shortFacts);
        System.out.println("\n");

        System.out.println("This is an example of a Float:");
        System.out.println(myFloat);
        System.out.println(floatFacts);
        System.out.println("\n");
    }
}
