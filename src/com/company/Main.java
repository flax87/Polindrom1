package com.company;

public class Main {

    public static void main(String[] args) {






      /*  String[] words = new String[10];
        words[0] = "Hello";
        words[1] = "World";
        words[2] = "Java";
        words[3] = "String";
        words[4] = "sql";
        words[5] = "Queen";
        words[6] = "Мама";
        words[7] = "мыла";
        words[8] = "раму";
        words[9] = "on";

        for (int i = 0; i < words.length; i++) {
            //if (words[i].contains("J") || words[i].length()>7 && words[i].contains("a"))
            if (words[i].contains("")||words[i].contains("Q")) {
                System.out.println(i+". "+words[i]+" - " +words[i].length()+ " symbols");
        */







                //Провіряємо речення на поліндромність

                /*Використовуємо такі речення:
                 * А роза упала на лапу Азора.
                 * А щётка – как тёща!
                 * Веер веял для евреев.
                 * Ешь немытого ты меньше!
                 * "Пустите!" - Летит супу миска Максиму. - "Пустите, летит суп!"*/




                String pal = "\"Пустите!\" - Летит супу миска Максиму. - \"Пустите, летит суп!\"";                                   //назначаєм змінну String
                pal =pal.toLowerCase();                                                 //преобразуєм pol в нижній регістр
                pal =pal.replaceAll(" ","")                            //заміняєм символи в строках на пусті
                        .replaceAll(",","")
                        .replaceAll("\\.","")
                        .replaceAll("_","")
                        .replaceAll("-","")
                        .replaceAll("-","")
                        .replaceAll("\\?","")
                        .replaceAll("\\!","")
                        .replaceAll("\\\"", "");

                String empty = "";                                                        //пусте значення в яке буде вертатись pol після цикла
                for (int i = 0; i <pal.length() ; i++) {                                    //цикл, який йде по всій строці pol
                    int index = pal.length() -i-1;                                          //починає рахунок з 0 символа
                    empty+=pal.charAt(index);

                }
                System.out.println(empty);


                if (pal.equals(empty)) {                                                      //Порівнюєм символи
                    System.out.println("This sentence is palindrom - TRUE");
                } else {
                    System.out.println("This sentence is not palindrom - FALSE");
                }
            }
        }






























