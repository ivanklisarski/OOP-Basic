package Inheritance.Mankind;

public class Worker extends Human{
    private double weekSalary;
    private double workHoursPerDay;


    public Worker(String firstName, String lastName, double weekSalary,double workHoursPerDay) {
        super(firstName, lastName);
        this.setWeekSalary(weekSalary);
        this.setWorkHoursPerDay(workHoursPerDay);
    }

    public void setWeekSalary(double weekSalary) {
        if(weekSalary < 0 ){
            throw new IllegalArgumentException("Expected value mismatch!Argument: weekSalary");
        }
        this.weekSalary = weekSalary;
    }

    public void setWorkHoursPerDay(double workHoursPerDay) {
        if(workHoursPerDay < 1 || workHoursPerDay > 12){
            throw new IllegalArgumentException("Expected value mismatch!Argument: workHoursPerDay");

        }
        this.workHoursPerDay = workHoursPerDay;
    }
    private double getSalaryPerHour() {
        return this.weekSalary / this.workHoursPerDay / 7d;
    }
    @Override
    protected void setLastName(String lastName) {
        if (lastName == null || lastName.trim().length() < 4) {
            throw new IllegalArgumentException("Expected length more than 3 symbols!Argument: lastName");
        }
        super.setLastName(lastName);
    }
    @Override
    protected String getInfo() {
        return String.format("%s%nSalary:  %.2f%nHours per day: %.2f%nSalary per hour: %.2f",
                super.getInfo(), this.weekSalary, this.workHoursPerDay, this.getSalaryPerHour());
    }


}
