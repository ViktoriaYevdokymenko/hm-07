public class Class1 {
  public static void main(String[] args) {
    Employee employee = new Employee("John", "Doe", 30, "Developer");
    employee.setAge(35);
    System.out.println("Оновлений вік: " + employee.getAge());
  }
}
