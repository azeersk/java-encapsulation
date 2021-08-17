public class encapsul {
    private int employee_id;
    private String employee_name;
    private int employee_salary;
    private long employee_number;
    private String  employee_address;

    public void getEmployee(int employee_id, int employee_salary, String employee_name, long employee_number, String employee_address){
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.employee_salary = employee_salary;
        this.employee_number = employee_number;
        this.employee_address = employee_address;
    }

    public int setEmployeeId(){
        return employee_id;
    }

    public int setEmployeeBonus(){
        if (employee_salary >= 45000){
            return this.employee_salary = (employee_salary + 5000);
        }
        else{
            return  employee_salary;
        }
    }

    public String setEmployeeName(){
        return employee_name;
    }
    public long setEmployeeNumber(){
        return employee_number;
    }
    public String setEmployeeAddress(){
        return employee_address;
    }

}
