package rfp283;

public class CompanyB {


    public static class CompanyB extends EmployeeWage{

        public CompanyB(String employeeName, String employeeType, int wagePerHour, int totalWorkingDay, int totalHour) {
            super(employeeName, employeeType, wagePerHour, totalWorkingDay, totalHour);
        }

        public static void main(String[] args) {
            CompanyB employee1 = new CompanyB("Jay", "FullTime", 22, 20, 100);
            employee1.calculatingMonthlyWages();
        }
    }
}
