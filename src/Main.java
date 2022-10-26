import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {

    public static void main(String[] args) throws IOException {
        String na, ca, ev, ad;
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Введите название театра");
        na = reader.readLine();
        System.out.println("Введите вместимость");
        ca = reader.readLine();
        System.out.println("Введите название мероприятия");
        ev = reader.readLine();
        System.out.println("Введите адрес");
        ad = reader.readLine();

        System.out.println("Информация о театре");
        Theatre Big_dom = new Theatre(na,ca,ev,ad , false, true);
        Big_dom.print_info();

        System.out.println("Информация о ночном клубе");
        Night_club opa = new Night_club();
        opa.print_info();

    }
}