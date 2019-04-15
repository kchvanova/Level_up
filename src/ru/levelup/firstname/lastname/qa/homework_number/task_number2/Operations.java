package ru.levelup.firstname.lastname.qa.homework_number.task_number2;

import java.util.*;

public class Operations {

    static void calculateTheCostPark(PublicTransport... args) {
        float result = 0;
        for (PublicTransport arg : args) {
            result = arg.getCost() + result;
        }
        System.out.println("Стоимость автопарка " + result);
    }


    static void sortTransportByExpenditure(PublicTransport... args) {
        Map<String, Float> map = new HashMap<String, Float>();

        for (PublicTransport v : args) {
            map.put(v.nubmer, v.expenditure);
        }
        map.entrySet().stream().sorted(Map.Entry.<String, Float>comparingByValue()).forEach(System.out::println);
    }

    static void sortTransportCapacity(PublicTransport... args) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (PublicTransport v : args) {
            map.put(v.nubmer, v.capacity);
        }
        map.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue()).forEach(System.out::println);
    }


    static void searchTransportByParameters(PublicTransport... transports) {
        HashMap mapTransport = new HashMap();
        for (PublicTransport transport : transports){
            mapTransport.put(transport.getNubmer(), transport);
        }
        System.out.println("Введите количество параметров: ");
        Integer countParams = GetCommand.getCountParams();
        for (int i = 1; i <= countParams; i++) {
            System.out.println("Введите параметр поиска: ");
            String nameParameter = GetCommand.getParamName();
            System.out.println("Введите значение: ");
            Float value = GetCommand.getValueNumber();
            if (nameParameter.equals("expenditure")) { //5.1
                for (PublicTransport transport : transports) {
                    if (!transport.getExpenditure().equals(value)) {
                        mapTransport.remove(transport.getNubmer(), transport);
                    }
                }
            }
            if (nameParameter.equals("capacity")) {//58
                for (PublicTransport transport : transports) {
                    if (!transport.getCapacity().equals(value)) {
                        mapTransport.remove(transport.getNubmer(), transport);
                    }
                }
            }
            if (nameParameter.equals("tripPrice")) {//43.5
                for (PublicTransport transport : transports) {
                    if (!transport.getTripPrice().equals(value)) {
                        mapTransport.remove(transport.getNubmer(), transport);
                    }
                }
            }
        }
        System.out.println(mapTransport.keySet());
    }

}