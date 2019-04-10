package ru.levelup.firstname.lastname.qa.homework_number.task_number2;

import java.util.*;

public class Operations {


    public static void main(String[] args) {

        Operations.calculateTheCostPark(Creator.ikar, Creator.elIkar);
        Operations.sortTransportByExpenditure(Creator.ikar, Creator.elIkar, Creator.iiikar, Creator.elIikar);
        Operations.searchTransportByParameters(Creator.ikar, Creator.elIkar, Creator.iiikar, Creator.elIikar);

    }


    static void calculateTheCostPark(PublicTransport... args){
        float result = 0;
        for(PublicTransport arg : args) {
            result = arg.getCost() + result;
        }
        System.out.println("Стоимость автопарка " + result);
    }


    static void sortTransportByExpenditure(PublicTransport... args){
        Map<String, Float> map = new HashMap<String, Float>();

        for(PublicTransport v : args) {
            map.put(v.nubmer, v.expenditure);
        }
        map.entrySet().stream().sorted(Map.Entry.<String, Float>comparingByValue()).forEach(System.out::println);
    }

    static void sortTransportCapacity(PublicTransport... args){
        Map<String, Integer> map = new HashMap<String, Integer>();

        for(PublicTransport v : args) {
            map.put(v.nubmer, v.capacity);
        }
        map.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue()).forEach(System.out::println);
    }

    static String getParametersString(){
        System.out.print("Enter parameter for search : ");
        Scanner scan = new Scanner(System.in);
        String parameter = String.valueOf(scan.next());
        return parameter;
    }

    static Boolean getParameterBool(){
        System.out.print("Enter parameter for search : ");
        Scanner scan = new Scanner(System.in);
        Boolean parameter = Boolean.valueOf(scan.next());
        return parameter;
    }

    static Float getParameterFloat(){
        System.out.print("Enter parameter for search : ");
        Scanner scan = new Scanner(System.in);
        Float parameter = Float.valueOf(scan.next());
        return parameter;
    }

    static Integer getParameterInteger(){
        System.out.print("Enter parameter for search : ");
        Scanner scan = new Scanner(System.in);
        Integer parameter = Integer.valueOf(scan.next());
        return parameter;
    }

    static void searchTransportByParameters(PublicTransport... args) {
        String typePower = Operations.getParametersString();
        Float tripPrice = Float.valueOf(Operations.getParametersString());
        for(PublicTransport v : args) {
            if (String.valueOf(typePower).equals(v.typePower)) {
                if (v.tripPrice <= tripPrice)
                   System.out.println(v.nubmer);
            }
    }
    }


}
