package DefiningClasses.Google;

public class Company {
    private String companyName;
    private String comapanyDepartament;
    private double salary;

    public Company() {
    }

    public Company(String companyName, String comapanyDepartament, double salary) {
        this.companyName = companyName;
        this.comapanyDepartament = comapanyDepartament;
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getComapanyDepartament() {
        return comapanyDepartament;
    }

    public void setComapanyDepartament(String comapanyDepartament) {
        this.comapanyDepartament = comapanyDepartament;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f", this.getCompanyName(),this.comapanyDepartament, this.getSalary());
    }
}
