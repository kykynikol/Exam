import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * Первый вариант
 * Создать приложение «Система учета сотрудников».
 * Основная задача проекта: хранить информацию о сотрудниках организации и
 * структуре организации.
 * Необходимо сохранять следующую информацию: ФИО сотрудника, дату рож-
 * дения, пол, контактный телефон, должность, название отдела в котором работает сотрудник, информацию о
 * непосредственном начальнике (если такой есть), дату приема на работу, зарплату.
 * Приложение должно позволять: принимать на работу новых сотрудников, увольнять сотрудников, изменять
 * информацию о сотрудниках. Приложение должно предоставить функциональность по поиску сотрудников внутри
 * организации по таким параметрам: ФИО, должности, названию отдела, ФИО начальника. При-
 * ложение должно иметь возможность создавать следующие отчеты: структура организации
 * (информация об отделах, ФИО начальников отделов), средняя зарплата по организации и по отделам,
 * ТОП-10 самых дорогих сотрудников по зарплате, ТОП-10 самых преданных сотрудников по количеству
 * лет работы в организации. Приложение должно сохранять и загружать информацию об организации из файлов.
 * Интерфейс приложения должен позволять выводить результат работы отчета в консоль или файл.
 * Необходимо предусмотреть возможность входа по логину и паролю.
 */

public class Main  {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void main(String[] args) throws IOException {
        Helper helper = new Helper();
        Scanner in = new Scanner(System.in);
        System.out.println("Выбери номер задания" +
                "\n 1 - сами сотрудники" +
                "\n 2 - топ 10 по зп" +
                "\n 3 - топ 10 патриотов" +
                "\n 4 - принять на работу" +
                "\n 5 - уволить сотрудника" +
                "\n 6 - файл" +
                ANSI_YELLOW +"\n\t Для выхода из программы введите 0" + ANSI_RESET);
        int a = in.nextInt();
        switch (a){
            case '0':
                System.exit(0);
            case 1:
                helper.printAll();

                break;
            case 2:
                helper.top10Salary();
                break;
            case 3:
                helper.top10pPatriots();
                break;
            case  4:
                helper.recruit();
                break;
            case 5:
                helper.removeWorker();
                break;
            case 6:
                helper.file();
                break;
        }
    }
}
