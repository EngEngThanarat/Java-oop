class Employee { 
    //If input final front class cannot do subclass (Class programmer,Class Accounting)
    //Attribute 
    private String Id;
    private String Name;
    private Double Salary;

    //Static Attribute
    static int minSalary=10000;

    //Default constructor
    //show when you create object
    public Employee(){
        System.out.println("I'm Employee");
    }

    public Employee(String name,Double salary){
        this.Name=name ;
        this.Salary=salary;
        disPlayEmployee();
    }
    
    public Employee(String id,String name,Double salary){
        this.Id=id;
        this.Name=name;
        this.Salary=salary;
    }

    //method
    public void setId(String id){
        this.Id = id ;
    }
    public void setName(String name){
        this.Name = name ;
    }
    public void setSalary(Double salary){
        this.Salary = salary ;
    }

    public void disPlayEmployee(){
        System.out.println("NAME = "+this.Name);
        System.out.println("Salary = "+this.Salary);
    }

    public String getId(){
        return this.Id;
    }
    public String getName(){
        return this.Name;
    }
    public double getSalary(){
        return this.Salary;
    }


}//end class
