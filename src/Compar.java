

class Compar implements java.util.Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o2.getSalary(),o1.getSalary());
    }


}
