package com.dino;

public class AlgorithmTest {
    public static void main(String[] args) {
        System.out.println(isRotationWord("ABCD","DACB"));
        System.out.println(isRotationWord("ABCD","BCDA"));
    }

    public static boolean isRotationWord(String givenString,String myStr){
        if(givenString.length()!=myStr.length()){
            return false;
        }
        givenString = givenString.concat(givenString);
        return givenString.contains(myStr);
    }
}
