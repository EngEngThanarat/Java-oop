public class main {
    public static void main(String[] args){
        System.out.println("Company name : "+Company.NAME);
        System.out.println("Create in : "+Company.create);
        Company.service();
        System.out.println("---------------------------------------------------");

        Employee e1 = new Employee(); //create object
        e1.setId("1");
        e1.setName("Eng");
        e1.setSalary(50000.0);
        e1.disPlayEmployee(); //show everything

        System.out.println("---------------------------------------------------");

        Employee e2 = new Employee("2","Nieb",60000.0); //create object
        System.out.println("ID = "+e2.getId()+"\nName = "+e2.getName()+"\nSalary = "+e2.getSalary());

        System.out.println("---------------------------------------------------");

        Programmer pg = new Programmer("Min",100000.0); //create object
        
        System.out.println("---------------------------------------------------");

        Accounting ac = new Accounting("Kin",20000.0);
        
        System.out.println("---------------------------------------------------");
    }

}
