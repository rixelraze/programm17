package com.company;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        LogisticFactory myRoadFactory = new RoadLogisticFactory();
        LogisticFactory myAirFactory = new AirLogisticFactory();
        LogisticFactory mySeaFactory = new SeaLogisticFactory();

        Logistic myRoadLogistic = myRoadFactory.createLogistic();
        Logistic myAirLogistic = myAirFactory.createLogistic();
        Logistic mySeaLogistic = mySeaFactory.createLogistic();

        System.out.println(myRoadLogistic);
        System.out.println(myAirLogistic);
        System.out.println(mySeaLogistic);
    }
}

abstract class Logistic {
    String Transport;
    List<String> specifications = new ArrayList();

    public String toString() {
        return "Вид транспорта:" + Transport + specifications;

    }
}

abstract class LogisticFactory {
    public abstract Logistic createLogistic();
}

class RoadLogisticFactory extends LogisticFactory {
    public Logistic createLogistic() {
        return new RoadLogistic();
    }
}

class AirLogisticFactory extends LogisticFactory {
    public Logistic createLogistic() {
        return new AirLogistic();
    }
}

class SeaLogisticFactory extends LogisticFactory {
    public Logistic createLogistic() {
        return new SeaLogistic();
    }
}

class RoadLogistic extends Logistic {
    public RoadLogistic() {
        Transport = "Грузовик";
        specifications.add("Вместимость в тоннах: 10 тонн");
        specifications.add("Расход топлива: 17.0 ");
        specifications.add("Время в пути: 12 ч");
        specifications.add("Система навигации");
    }
}

class AirLogistic extends Logistic {
    public AirLogistic() {
        Transport = "Самолет";
        specifications.add("Вместимость в тоннах: 120 ");
        specifications.add("Расход топлива: 2 600/час");
        specifications.add("Время в пути: 14 ч");
        specifications.add("Система навигации ");
    }
}

class SeaLogistic extends Logistic {
    public SeaLogistic() {
        Transport = "Судно";
        specifications.add("Вместимость в тоннах: 12 000 ");
        specifications.add("Расход топлива: 300 кг/сутки ");
        specifications.add("Время в пути: 150 ч");
        specifications.add("Система навигации ");
    }
}
