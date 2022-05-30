import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        //Создаем ArrayList "Список продуктов"
        ArrayList<String> lists = new ArrayList<>();
        lists.add("хлеб");
        lists.add("огурцы");
        lists.add("помидоры");
        lists.add("картошка");
        lists.add("сыр");
        lists.add("курица");
        lists.add("кофе");

        //Вывод списка в консоль
        for (String str : lists) {
            System.out.println(str);
        }

        // поиск элемента "картошка", вывести его индекс
        System.out.println("Индекс элемента: " + lists.indexOf("картошка"));

        //проверить, есть ли элемент "огурцы" в списке, если да, вывести его, если нет, то сообщть об этом
        String product = "огурцы";
        if (lists.contains(product)) {
            int x = lists.indexOf(product);
            System.out.println("В списке есть продукт: " + lists.get(x));
        } else {
            System.out.println("К сожалению, в списке нет данного продукта");
        }


        //удалить элемент под конкретным местом, например, 4 списке (по индексу 3) и вывести список в консоль
        lists.remove(3);
        System.out.println("Список после корректировок");
        for (String str : lists) {
            System.out.println(str);
        }

        //удалить конкретный элемент в списке, например, "кофе" и вывести новый список
        lists.remove("кофе");
        System.out.println("Список после корректировок");
        for (String str : lists) {
            System.out.println(str);
        }

        //Создаем LinkedList "Список цветов" и выводим в косоль
        LinkedList<String> colors = new LinkedList<>();
        colors.add("красный");
        colors.add("желтый");
        colors.add("черный");
        colors.add("белый");
        colors.add("синий");
        System.out.println("Список цветов");
        for (String str : colors) {
            System.out.println(str);
        }
        //Поиск наличия элемента "зеленый" в списке = ответ true/false
        System.out.println(colors.contains("зеленый"));

        //удалить элемент "черный" и вывести новый список
        colors.remove("черный");
        System.out.println("Новый список цветов");
        for (String str : colors) {
            System.out.println(str);
        }

        //Особые методы для LinkedList
        //удалить первый элемент списка
        colors.pollFirst();
        System.out.println("Новый список цветов");
        for (String str : colors) {
            System.out.println(str);
        }
        //удалить последний элемент списка
        colors.pollLast();
        System.out.println("Новый список цветов");
        for (String str : colors) {
            System.out.println(str);
        }

        //добвим на первое место "фиолетовый",  на последнее "серый"
        colors.addFirst("фиолетовый");
        colors.addLast("серый");
        System.out.println("Новый список цветов");
        for (String str : colors) {
            System.out.println(str);
        }



        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(5);
        myArrayList.add(1);
        myArrayList.add(4);
        myArrayList.add(7);
        myArrayList.print();
        myArrayList.delete(2);
        myArrayList.print();



        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(8);
        myLinkedList.add(5);
        myLinkedList.add(4);
        myLinkedList.add(0);
        myLinkedList.add(8);
        myLinkedList.print();

    }
}