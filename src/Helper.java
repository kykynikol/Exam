import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


final class Helper {
    Scanner in = new Scanner(System.in);
    public List<Employee> list = new ArrayList<>();

    {

        list.add(new Employee(1, "Юрий", "Иванов", "Иванович", 'M',
                "89003233333", LocalDate.parse("2021-01-24"), 32000));
        list.add(new Employee(2, "Николай", "Кузнецов", "Михайлович", 'M',
                "89003233344", LocalDate.parse("2021-01-24"), 40000));
        list.add(new Employee(3, "Алексей", "Ольчев", "Александрович", 'M',
                "89003233355", LocalDate.parse("1999-10-24"), 50000));
        list.add(new Employee(4, "Юрий", "Еременко", "Аннович", 'M',
                "89003233366", LocalDate.parse("2015-04-24"), 60000));
        list.add(new Employee(5, "Петр", "Буренин", "Анновна", 'M',
                "89003233377", LocalDate.parse("2002-12-24"), 65000));
        list.add(new Employee(6, "Александр", "Меркулов", "Анновна", 'M',
                "89003233388", LocalDate.parse("2021-05-24"), 70000));
        list.add(new Employee(7, "Василий", "Филлипов", "Анновна", 'M',
                "89003233399", LocalDate.parse("2010-02-24"), 10000));
        list.add(new Employee(8, "Анна", "Буренина", "Васильевна", 'Ж',
                "89003231233", LocalDate.parse("2000-01-24"), 25000));
        list.add(new Employee(9, "Татьяна", "Иванов", "Анновна", 'Ж',
                "89003235436", LocalDate.parse("2003-01-24"), 43000));
        list.add(new Employee(11, "Людмила", "Васильевна", "Васильевна", 'Ж',
                "89003232443", LocalDate.parse("2019-01-24"), 212000));
        list.add(new Employee(10, "Людмила", "Васильевна", "Васильевна", 'Ж',
                "89003232443", LocalDate.parse("2019-01-24"), 23455));
    }

    public List<Employee> works = new ArrayList<>();
    {
        works.addAll(0, list);
    }

    public void printAll(){
//        List<Employee> works = new ArrayList<>();
//        works.addAll(0,list);
        System.out.println("Список сотрудников: ");
        for (Employee employee : works) {
            System.out.println(employee);
//            File file = new File("Список.txt");
//            try {
//                if(!file.exists())
//                    file.createNewFile();
//                PrintWriter printWriter = new PrintWriter(file);
//                    printWriter.print(list + " "  + System.getProperty("line.separator"));
//                    printWriter.close();
//            }catch (IOException e){
//                System.out.println("Error" + e);
//
//            }
//        }

//            FileWriter writer = new FileWriter("output.txt");
//            for (Employee a : works) {
//                String name = a.getName();
//                int ID = a.getID();             // айдишник
//                String surname = a.getSurname();     // фамилия
//                String patronymic = a.getPatronymic();  // отчество
//                LocalDate startWork = a.getStartWork();// дата
//                char floor = a.getFloor();         // пол
//                String telephone = a.getTelephone();   // телефон
//                int salary = a.getSalary();
//                writer.write("ID: " + ID + " Имя: " + name + " Фамилия: " + surname + " Отчество: " + patronymic + " Дата приема: " + startWork + " Пол: " + floor + " Тел.: "
//                        + telephone + " Зп: " + salary );
//            }
//            writer.close();
        }
    }

    public void top10Salary(){
        System.out.println("Топ 10 по зарплате: ");
        list.sort(Comparator.comparing(Employee::getSalary));
        for (int i = 0; i < list.size() & i < 10; i++) {
            System.out.println(list.get(i));
        }
    }


    public void top10pPatriots() {
        System.out.println("ТОП-10 самых преданных сотрудников по количеству " +
                "лет работы в организации ");
        list.sort(Comparator.comparing(Employee::getStartWork));
        for (int i = 0; i < list.size() & i < 10; i++) {
            System.out.println(list.get(i));
        }
    }

    public void recruit() throws IOException {
        System.out.println("введи колво сотрудников принятых на работу");
        int d = in.nextInt();
        for (int i = 0; i < d; i++) {
            System.out.println("Введи ID");
            int ID = in.nextInt();
            System.out.println("Введи name");
            String name = in.next();
            System.out.println("Введи surname");
            String surname = in.next();
            System.out.println("Введи patronymic");
            String patronymic = in.next();
            System.out.println("Введи floor");
            String b = in.next();
            char floor = b.charAt(b.length() - 1);
            System.out.println("Введи telephone");
            String telephone = in.next();
            System.out.println("Введи startWork");
            LocalDate startWork = LocalDate.of(in.nextInt(), in.nextInt(), in.nextInt());
            System.out.println("Введи зп");
            int salary = in.nextInt();
            list.add(new Employee(ID, name, surname, patronymic, floor, telephone, startWork, salary));
        }
        for (Employee employee : list) {
            System.out.println(employee);
        }
        file();
    }

    public void removeWorker() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Удалить сотрудников номер:");
        int identificated = scanner.nextInt();
        for (int i = 0; i < works.size(); i++) {
            if (works.get(i).getID() == identificated) {
                works.remove(i);
            }
        }
        for (Employee employee : works) {
            System.out.println(employee);
        }
        try {
            file();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        FileWriter writer = new FileWriter("delete.txt");
//        for (Employee a : works) {
//            String name = a.getName();
//            int ID = a.getID();                     // айдишник
//            String surname = a.getSurname();        // фамилия
//            String patronymic = a.getPatronymic();  // отчество
//            LocalDate startWork = a.getStartWork(); // дата
//            char floor = a.getFloor();              // пол
//            String telephone = a.getTelephone();    // телефон
//            int salary = a.getSalary();
//            writer.write("ID: " + ID + " Имя: " + name + " Фамилия: " + surname + " Отчество: " + patronymic
//                    + " Дата приема: " + startWork + " Пол: " + floor + " Тел.: "
//                    + telephone + " Зп: " + salary );
//        }
//        writer.close();
    }

    public void file() throws IOException {
        FileWriter writer = new FileWriter("delete.txt");
        for (Employee a : list) {
            String name = a.getName();              // имя
            int ID = a.getID();                     // айдишник
            String surname = a.getSurname();        // фамилия
            String patronymic = a.getPatronymic();  // отчество
            LocalDate startWork = a.getStartWork(); // дата
            char floor = a.getFloor();              // пол
            String telephone = a.getTelephone();    // телефон
            int salary = a.getSalary();
            writer.write("ID: " + ID + " Имя: " + name + " Фамилия: " + surname + " Отчество: " + patronymic
                    + " Дата приема: " + startWork + " Пол: " + floor + " Тел.: "
                    + telephone + " Зп: " + salary + "\n");
        }
        writer.close();
    }
}
