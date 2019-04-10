package ru.levelup.firstname.lastname.qa.homework_number.task_number2;

public class Bus extends PublicTransport {

    boolean conductor;

    Bus(String typePower, int capacity, float expenditure, float count, String paymentMethod, boolean personsWithDisabilities, float tripPrice, boolean conductor, String number) {
        super(typePower, capacity, expenditure, count, paymentMethod, personsWithDisabilities, tripPrice, number);
        this.conductor = conductor;

    }

    public Boolean getConductor(){
        return this.conductor;
    }

    public Boolean getBattery(){
        return false;
    }

    public Boolean getRequestStop(){
        return false;
    }

    public Float getPathRadius(){
        return 0f;
    }
}