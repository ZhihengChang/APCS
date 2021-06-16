package Unit2;

public class Person {
    //declear variables/fields
    public int iq;
    public int eq;

    public int age;
    public String name;

    //constructor
    public Person(int iq, int eq, int age, String name){
        this.iq = iq;
        this.eq = eq;
        this.age = age;
        this.name = name;
    }

    //getters get
    public int getIq(){
        return this.iq;
    }

    public int getEq(){
        return this.eq;
    }

    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }

    //setters set
    public void setIq(int iq){
        this.iq = iq;
    }

    public void setEq(int eq) {
        this.eq = eq;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    //other functions
    public String sayHello(){
        return "Hello, " + this.name;
    }
}
