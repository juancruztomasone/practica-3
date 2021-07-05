package com.company;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        /*
        Persona[] arrPersonas = {new Persona("Juan","36886512"),new Persona("Pedro","36431130"),new Persona("Susana","11254896")};
        SortUtil.ordenar(arrPersonas);

        System.out.println("Personas ------------------------");
        for(Persona persona:arrPersonas){
            System.out.println(persona);
        }

        Celular[] arrCelular = {new Celular("Juan","1553690391"),new Celular("Pedro","1548569864"),new Celular("Susana","1524859725")};
        SortUtil.ordenar(arrCelular);

        System.out.println("Celulares ------------------------");
        for(Celular celular:arrCelular){
            System.out.println(celular);
        }
        */

        Integer sArr[] = {1,8,10,55,348,3};
        Comparator<Integer> comp = (a, b)->a.compareTo(b);

        QuickSortSorterImple.sort(sArr,comp);

        for(int nombre:sArr){
            System.out.println(nombre);
        }
    }
}
