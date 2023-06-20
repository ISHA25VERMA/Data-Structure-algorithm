package DsAlgo.PBLJ_LAB;
class Mammals{
    Mammals(){
        System.out.println("i am a mammal");
    }
}
class Person extends Mammals{
    Person(){

        System.out.println("I am a person");
    }
    {
        System.out.println("Instance initializer block");
    }
}
public class TryThings {
    public static void main(String[] args) {
        Person p = new Person();
    }
}
