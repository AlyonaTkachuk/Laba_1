import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {

    public static void main(String[] args) throws IOException {
        //класс InputStreamReader преобразует набор байтов в символ
        // Класс BufferedReader буферизует ввод, обеспечивая считывание из потока ввода
        // необходимо для корректного ввода с клавиатуры

        String new_name, new_capacity, new_event, new_address;
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("Введите название театра");
        new_name = reader.readLine();
        System.out.println("Введите вместимость");
        new_capacity = reader.readLine();
        System.out.println("Введите название мероприятия");
        new_event = reader.readLine();
        System.out.println("Введите адрес");
        new_address = reader.readLine();

        System.out.println("Информация о театре");
        Theatre Volkov_Theatre = new Theatre(new_name, new_capacity, new_event, new_address,true,false);
        Volkov_Theatre.print_info();

        System.out.println("Информация о ночном клубе");
        Night_club Club_Honey = new Night_club();
        Club_Honey.print_info();

        System.out.println("Информация о концертном зале");
        Concert_hall Millennium = new Concert_hall();
        Millennium.print_info();

    }
}