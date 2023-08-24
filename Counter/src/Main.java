import Tarif.Tarifi;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Tarifi tar = new Tarifi();
        tar.getGorVoda();
        tar.getHolVoda();
        System.out.printf("Ваши тарифы на сегодня: %.2f. рублей за 1 кубометр горячей воды" +
                "и %.2f. рублей за 1 кубометр холодной воды", tar.getGorVoda(), tar.getHolVoda());
    }
}