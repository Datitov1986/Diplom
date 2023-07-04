package View;

public class Menu {
    public static void MainMenu(int values) {
        System.out.println("В моей программе вы можете вносить или считывать ранее внесенные показания" +
                "различных счетчиков ЖКХ");
        System.out.println("1. Внести показание");
        System.out.println("2. Посмотреть ранее внесенные показания");
        System.out.println("0. Уйти\n");
    }

    public static void writeCounters(int values) {
        System.out.println("Выберите показания каких счетчиков вы хотите ввести: ");
        System.out.println("1. Счетчики воды");
        System.out.println("2. Счетчики электроэнергии");
        System.out.println("3. Вернуться в предыдущее меню");
        System.out.println("0. Уйти\n");
    }
}
