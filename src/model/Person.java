package model;

/**
 * Created by rkodekar on 10/15/16.
 */
public class Person {

    private String personName;
    private Integer personAge;
    private String address;
    private String sex;

    public Person(String personName, Integer personAge, String address, String sex) {
        this.personName = personName;
        this.personAge = personAge;
        this.address = address;
        this.sex = sex;
    }

    public String getPersonName() {
        return personName;
    }

    public Integer getPersonAge() {
        return personAge;
    }

    public String getAddress() {
        return address;
    }

    public String getSex() {
        return sex;
    }

    private Person() {
    }

    public static Builder builder() {
        return new Person.Builder();
    }


    public static class Builder {
        Person person = new Person();

        public Builder() {

        }

        public Builder personName(String personName) {
            person.personName = personName;
            return this;
        }

        public Builder personAge(Integer personAge) {
            person.personAge = personAge;
            return this;
        }

        public Builder personAddress(String address) {
            person.address = address;
            return this;
        }

        public Builder personSex(String sex) {
            person.sex = sex;
            return this;
        }

        public Person build() {
            assert person.personName != null;
            assert person.personAge != null;
            assert person.address != null;
            assert person.sex != null;
            return person;
        }

    }

}
