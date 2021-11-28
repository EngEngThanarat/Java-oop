public class main {
    public static void main(String [] args){
        Employee e1 = new Employee(); //create object
        e1.setId("1");
        e1.setName("Eng");
        e1.setSalary(50000.0);
        e1.disPlayEmployee(); //show everything

        Employee e2 = new Employee(); //create object
        e2.setId("2");
        e2.setName("Nieb");
        e2.setSalary(60000.0);
        System.out.println("Name = "+e2.getName());//get only Name
        System.out.println("Salary = "+e2.getSalary());//Get only Salary
    }
}
