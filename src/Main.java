import model.Person;

public class Main {

    public static void main(String[] args) {
        Person person = Person.builder().personName("Rehan").personAge(26)
                .personAddress("Mumbai").personSex("Male").build();

        System.out.println("Person name : " + person.getPersonName());
        System.out.println("Person age : " + person.getPersonAge());
        System.out.println("Person Address : " + person.getAddress());
        System.out.println("Person sex : " + person.getSex());
    }
}
