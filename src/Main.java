import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List <Employes> employesList = new ArrayList<>();
        employesList.add(new Employes(700,45,5,"Joaquim"));
        employesList.add(new Employes(1000,35,1,"Maria"));
        employesList.add(new Employes(700,55,2,"Marta"));
        employesList.add(new Employes(700,45,6,"José"));
         employesList.stream().forEach(System.out::println);

        Stream<Employes> m = employesList.stream().
                filter(employer -> employer.getName().startsWith("M"));
        Stream<Employes> m1 = employesList.stream().
                filter(employer -> employer.getYearsWorking()>1);
        System.out.println("____");
        Stream<Employes> m3 = employesList.stream()
                .sorted((p1, p2)->p1.getAge().compareTo(p2.getAge()));
             m3.forEach(System.out::println);
        System.out.println("____");
        Stream<Employes> m2 = employesList.stream()
                .filter(employes -> employes.getAge() > 40);
        m2.forEach(System.out::println);
        System.out.println("____");


        System.out.println("____");
        m1.forEach(System.out::println);

        System.out.println("____");
        m.forEach(System.out::println);


    }
}
