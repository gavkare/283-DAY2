package rfp283;

import java.util.Random;

public class EmployeeWage {

    String empoloyeeName;
    int employeePresent;
    String employeeType;
    int wagePerHour;
    int totalDailyWage;
    int dailyWorkingHour;
    int totalWorkingDay;
    int totalHour;
    int totalPresentDay;

    public EmployeeWage(String employeeName, String employeeType, int wagePerHour, int totalWorkingDay, int totalHour) {
        this.empoloyeeName = employeeName;
        this.employeeType = employeeType;
        this.wagePerHour = wagePerHour;
        this.totalWorkingDay = totalWorkingDay;
        this.totalHour = totalHour;
    }

    public void enterDailyWorkingHour() {
        if (employeeType == "FullTime") {
            dailyWorkingHour = 8;
        } else if (employeeType == "PartTime") {
            dailyWorkingHour = 4;
        }
    }

    public void checkEmployeeIsPresentOrAbsent() {
        Random random = new Random();
        this.employeePresent = random.nextInt(2);
        switch (employeePresent) {
            case 1:
                System.out.println("Employee is Present");
                break;
            case 0:
                System.out.println("Employee is Absent");
                break;
            default:

        }
    }

    public void calculatingDailyWage() {

        this.totalDailyWage = dailyWorkingHour * wagePerHour;
        System.out.println(employeeType + " employee " + empoloyeeName + " total daily wage is " + totalDailyWage);
    }

    public void totalPresentDay() {
        if (employeeType == "FullTime") {
            this.totalPresentDay = (totalHour / dailyWorkingHour);
        } else {
            this.totalPresentDay = totalWorkingDay;
        }
    }

    public void calculatingMonthlyWages() {
        enterDailyWorkingHour();
        calculatingDailyWage();
        totalPresentDay();
        int monthlyWage = totalDailyWage * totalPresentDay;
        System.out.println("Total monthly wages of employee = " + monthlyWage);
    }

}