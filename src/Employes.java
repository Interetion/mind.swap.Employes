import java.util.List;

public class Employes {
    private Integer salary;
    private Integer age;
    private Integer  yearsWorking;
    private String name;
    private List<Employes> employesList;

    public Employes(Integer salary, Integer age, Integer yearsWorking ,String name) {
        this.salary = salary;
        this.age = age;
        this.name = name;
        this.yearsWorking= yearsWorking;
    }

    public Integer getYearsWorking() {
        return yearsWorking;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public List<Employes> getEmployesList() {
        return employesList;
    }

    public Integer getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employes{" +
                "salary=" + salary +
                ", age=" + age +
                ", yearsWorking=" + yearsWorking +
                ", name='" + name + '\'' +

                '}';
    }
}
