
public class Employee {
    private int baseSalary;
    private float hourlyRate;
    private float extraHours;

    public Employee(int baseSalary, float hourlyRate, float extraHours) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }
 
    public double calculateWage(int baseSalary, float hourlyRate, float extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0) {
            throw new IllegalArgumentException("Base Salary cannot be less than 0");
        } else {
            this.baseSalary = baseSalary;
        }
    }

    private int getBaseSalary() {
        return baseSalary;
    }

    public void setHourlyRate(float hourlyRate){
        if (hourlyRate <= 0) 
            throw new IllegalArgumentException("Hourly Rate cannot be less than 0");
        this.hourlyRate = hourlyRate;
    }
}