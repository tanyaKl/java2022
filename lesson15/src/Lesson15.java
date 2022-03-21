import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;


public class Lesson15 {
    public static void main(String[] args) throws IOException {
        /*
         * 0. Реализовать коллекцию из трех телефонов. Реализовать ф-цию вставки
         * в коллекцию одновременно 3 новых номеров
         * *

         * 1. Создать коллекцию из пяти номеров телефонов. Реализовать
         * функцию поиска телефона по индексу
         *
         * */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        LinkedList<String> phones = new LinkedList<>();
//        phones.add("+375291111111");
//        phones.add("+375292222222");
//        phones.add("+375293333333");
//
//        System.out.println("Введите 3 номер телефона");
//        List<String> newPhones = new ArrayList<>();
//        for (int i = 0; i < 3; i++) {
//            newPhones.add(reader.readLine());
//            if (phones.get(i).equals("4444")) {
//                phones.remove(phones.get(i));
//            }
//        }
//        phones.addAll(newPhones);
//        String userPhone = "4444";
//        phones.removeIf(x -> x.equals(userPhone));
//        System.out.println(phones);
//

        List<String> ph = new ArrayList<>();
        ph.add("111");
        ph.add("222");
        ph.add("333");
        ph.add("4444");
        ph.add("155511");

       String result = null;
        while (true) {
            System.out.println("Введи индекс");
            String userIndexString = reader.readLine();
            Integer number = null;
            try {
                number = Integer.parseInt(userIndexString);
                result = ph.get(number);
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Введена строка!!!!");
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Несуществующий индекс");
            } catch (Exception ex) {
                System.out.println("Непредвиденная ошибка!!!");
            }
        }
        System.out.println(result);
    }

}
