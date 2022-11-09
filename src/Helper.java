import java.time.LocalDate;
import java.util.*;



final class  Helper {

//    public static List<Employee> initStaff() {

       public List<Employee> list = new ArrayList<>();{
//           System.out.println(list.size());
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
//return list;
    }



    public void printAll(){
        System.out.println("Список сотрудников: ");
    for(int i = 0; i< list.size(); i++) {
        System.out.println(list.get(i));
    }
}

    public void  top10Salary(){
        System.out.println("Топ 10 по зарплате: " );
        list.sort(new Compar());
        for(int i = 0; i< list.size()& i< 10; i++) {
            System.out.println(list.get(i));
        }
    }


    public void top10pPatriots(){
        System.out.println("ТОП-10 самых преданных сотрудников по количеству\n" +
                " * лет работы в организации ");
        list.sort(Comparator.comparing(Employee::getStartWork));
        for(int i = 0; i< list.size()& i< 10; i++) {
            System.out.println(list.get(i));
        }

    }

}
