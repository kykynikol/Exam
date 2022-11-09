import java.time.LocalDate;


public class Employee {
    int ID;             // айдишник
    String name;        // имя
    String surname;     // фамилия
    String patronymic;  // отчество
    LocalDate startWork;// дата
    char floor;         // пол
    String telephone;   // телефон
    int salary;         // зп

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setStartWork(LocalDate startWork) {
        this.startWork = startWork;
    }

    public char getFloor() {
        return floor;
    }

    public void setFloor(char floor) {
        this.floor = floor;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

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
