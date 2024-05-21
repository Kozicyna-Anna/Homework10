public class Main {
    public static void main(String[] args) {
        {
            System.out.println("\nTask1");
            String lastName = "Ivanov";
            String firstName = "Ivan";
            String middleName = "Ivanovich";
            String fullName = lastName + "  " + firstName + "  " + middleName;
            System.out.println("Ф.И.О сотрудника - " + fullName);
        }

        {
            System.out.println("\nTask2");
            String fullName = "Ivanov Ivan Ivanovich";
            System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета - " + fullName.toUpperCase());
        }
        {
            System.out.println("\nTask3");
            String fullName = "Иванов Семён Семёнович";
            String replacedFullName = fullName.replace('ё', 'е');
            System.out.println("Данные Ф.И.О. сотрудника - " + replacedFullName);
        }
    }
}








