import Tarif.Tarifi;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date d = new Date();
        System.out.println(d);
        Tarifi tar = new Tarifi();
        tar.getGorVoda();
        System.out.println(tar.getGorVoda());
    }
}