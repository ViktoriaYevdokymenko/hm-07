public class Employee {
  private String firstName;
  private String lastName;
  private int age;
  private String position;

  public Employee(String firstName, String lastName, int age, String position) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.position = position;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public int getAge() {
    return age;
  }
}
