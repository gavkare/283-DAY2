package rfp283;

public class CompanyA {


    public class companyA extends EmployeeWage{
        public companyA(String employeeName, String employeeType, int wagePerHour, int totalWorkingDay, int totalHour) {
            super(employeeName, employeeType, wagePerHour, totalWorkingDay, totalHour);
        }

        public void main(String[] args) {
            companyA employee1 = new companyA("Raj","PartTime",30,22,105);
            employee1.calculatingMonthlyWages();
        }
    }
}
