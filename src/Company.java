import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Company {
    private Set<Person> employees;

    public Company() {
        this.employees = new HashSet<>();
    }

    public Person getManager() {
        for (Person elem : employees) {
            if (elem.getPosition().equals("manager")) {
                return elem;
            }
        }
        return null;
    }

    public Set<Person> getPersons(String position) {
        Set<Person> newSet = new HashSet<>();
        for (Person elem : employees) {
            if (elem.getPosition().equals(position)) {
                newSet.add(elem);
            }
        }
        return newSet;
    }

    public Set<Person> older(int age) {
        Set<Person> newSet = new HashSet<>();
        for (Person elem : employees) {
            if (elem.getAge() > age) {
                newSet.add(elem);
            }
        }
        return newSet;
    }

    public Set<Person> getPersonName(String name) {
        Set<Person> newSet = new HashSet<>();
        for (Person elem : employees) {
            if (elem.getName().equals(name)) {
                newSet.add(elem);
            }
        }
        return newSet;
    }

    public void employ(Person person) {
        this.employees.add(person);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Company)) return false;
        Company company = (Company) o;
        return Objects.equals(employees, company.employees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employees);
    }
}
