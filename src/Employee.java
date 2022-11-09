import java.time.LocalDate;


public class Employee {
    int ID;             // айдишник
    String name;        // имя
    String surname;     // фамилия
    String patronymic;  // отчество
    LocalDate startWork;// дата
    char floor;         // пол
    String telephone;   // телефон
    int salary;

    public LocalDate getStartWork() {
        return startWork;
    }

    public int getSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "ID = " + ID +
                ", Имя = '" + name + '\'' +
                ", Фамилия = '" + surname + '\'' +
                ", Отчество = '" + patronymic + '\'' +
                ", Дата приема на работу = " + startWork +
                ", пол = " + floor +
                ", телефон = '" + telephone + '\'' +
                ", зарплата = '" + salary + '\'' +
                '}';
    }

    Employee (int ID, String name, String surname, String patronymic, char floor, String telephone, LocalDate startWork, int salary){
        this.ID = ID;
        this.floor = floor;
        this.startWork = startWork;
        this.name = name;
        this.patronymic = patronymic;
        this.telephone = telephone;
        this.surname = surname;
        this.salary = salary;
    }


}
