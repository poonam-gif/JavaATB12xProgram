package ex_18_OOPs_Constructor;

//Parameterized constructor whch has the parameters.

public class Car2 {
    String model;
    int year;

    Car2(String model_name,int year_created){
        this.model=model_name;
        this.year=year_created;
    }
//this is the default constructor which gets called when obj is created
    public Car2() {
        model ="2023";
        year = 2021;
    }
}
