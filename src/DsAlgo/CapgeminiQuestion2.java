package DsAlgo;

class Person{
    String name;
    String dateOfBirth;
    String email;
    Person(){}
    Person(String name, String dateOfBirth, String email){
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }
}

class Implementation{
    public String validator(Person details) throws Exception{
        String date = details.dateOfBirth;
        int year = Integer.parseInt(date.substring(6));

        if (year>2000){
            throw new Exception("InvalidDateException");
        }
        if (!details.email.contains("@dotselect.com")){
            throw new Exception("only @dotselect.com domain email are accepted");
        }

        return "valid details";
    }

    public String submitDetails(Person details){
        try {
            validator(details);
        } catch (Exception e) {
            return "invalid details";
        }

        return "details submitted successfully";
    }
}


public class CapgeminiQuestion2 {
    public static void main(String[] args) throws Exception {
        Person data = new Person("Steve", "12-02-1998", "hello@dotselect.com");
        Implementation obj = new Implementation();

        System.out.println(obj.validator(data));
        System.out.println(obj.submitDetails(data));

    }
}
