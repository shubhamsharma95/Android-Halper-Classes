package com.arka.shubhamsharma.annotations;

public class AnnotationsSample {

    protected void execute() {
        Car car = new Car("Ford", "F150", "2018");
        JsonSerializer serializer = new JsonSerializer();
        try {
            serializer.serialize(car);
        } catch (JsonSerializeException e) {
            e.printStackTrace();
        }
    }
}
