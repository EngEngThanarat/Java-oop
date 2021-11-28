class Employee {
    //Attribute 
    private String Id;
    private String Name;
    private Double Salary;

    //method
    public void setId(String id){
        this.Id = id ;
    
    }//end setId
    public void setName(String name){
        this.Name = name ;
    }//end setName
    public void setSalary(Double salary){
        this.Salary = salary ;
    }//end setSalary

    public void disPlayEmployee(){
        System.out.println("ID = "+this.Id);
        System.out.println("NAME = "+this.Name);
        System.out.println("Salary = "+this.Salary);
    }//end disPlayEmployee

    public String getName(){
        return this.Name;
    }//end getName

    public double getSalary(){
        return this.Salary;
    }//end getSalary
}//end class
