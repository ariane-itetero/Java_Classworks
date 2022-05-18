public class Person{
    private String firstName;
    private String lastName;
    private Integer age;
    public Gender gender;
    //constructor
public Person(String firstName,String lastName,Integer age,Gender gender){
    this.firstName=firstName;
    this.lastName=lastName;
    this.age=age;
    this.gender=gender;
}
    //getter gets a variable it is going to read
    //setters are methods to call private variables
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public static void main(){

    }
}