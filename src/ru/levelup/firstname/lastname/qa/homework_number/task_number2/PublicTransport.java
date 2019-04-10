package ru.levelup.firstname.lastname.qa.homework_number.task_number2;

abstract class PublicTransport {

    PublicTransport(String typePower, int capacity, float expenditure, float count, String paymentMethod,
                    boolean personsWithDisabilities, float tripPrice, String nubmer) {
        this.capacity = capacity;
        this.expenditure = expenditure;
        this.cost = count;
        this.personsWithDisabilities = personsWithDisabilities;
        this.tripPrice = tripPrice;
        this.typePower = typePower;
        this.paymentMethod = paymentMethod;
        this.nubmer = nubmer;
    }


    protected String nubmer;
    protected String typePower; // electricity, fuel, gibrid
    protected Integer capacity; // вместимость
    protected Float expenditure;
    protected Float cost;
    protected String paymentMethod; // cash, card, travelCard
    protected Boolean personsWithDisabilities;
    protected Float tripPrice;


    public Float getCost(){
        return this.cost;
    }
}
