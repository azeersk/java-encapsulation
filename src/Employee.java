public class Employee {
    public static void main(String[] args){
        System.out.println("*********************** Employee_1 *********************************");
        encapsul obj = new encapsul();
        obj.getEmployee(11805521, 44500, "AZEER SAHEB", 938158777, "khammam,nelakondapalli,chennaram");
        System.out.println("Employee Id : "+ obj.setEmployeeId());
        System.out.println("Employee bonus : "+ obj.setEmployeeBonus());
        System.out.println("Employee Name : "+ obj.setEmployeeName());
        System.out.println("Employee Number : "+ obj.setEmployeeNumber());
        System.out.println("Employee Address : "+ obj.setEmployeeAddress());
        System.out.println();
        System.out.println("*********************** Employee_2 *********************************");
        encapsul obj1 = new encapsul();
        obj1.getEmployee(118055, 47000, "AZEER SAHEB",938158797, "khammam,nelakondapalli,chennaram");
        System.out.println("Employee Id : "+ obj1.setEmployeeId());
        System.out.println("Employee bonus : "+ obj.setEmployeeBonus());
        System.out.println("Employee Name : "+ obj1.setEmployeeName());
        System.out.println("Employee Number : "+ obj1.setEmployeeNumber());
        System.out.println("Employee Address : "+ obj1.setEmployeeAddress());
    }
}
