import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        //������� ArrayList "������ ���������"
        ArrayList<String> lists = new ArrayList<>();
        lists.add("����");
        lists.add("������");
        lists.add("��������");
        lists.add("��������");
        lists.add("���");
        lists.add("������");
        lists.add("����");

        //����� ������ � �������
        for (String str : lists) {
            System.out.println(str);
        }

        // ����� �������� "��������", ������� ��� ������
        System.out.println("������ ��������: " + lists.indexOf("��������"));

        //���������, ���� �� ������� "������" � ������, ���� ��, ������� ���, ���� ���, �� ������� �� ����
        String product = "������";
        if (lists.contains(product)) {
            int x = lists.indexOf(product);
            System.out.println("� ������ ���� �������: " + lists.get(x));
        } else {
            System.out.println("� ���������, � ������ ��� ������� ��������");
        }


        //������� ������� ��� ���������� ������, ��������, 4 ������ (�� ������� 3) � ������� ������ � �������
        lists.remove(3);
        System.out.println("������ ����� �������������");
        for (String str : lists) {
            System.out.println(str);
        }

        //������� ���������� ������� � ������, ��������, "����" � ������� ����� ������
        lists.remove("����");
        System.out.println("������ ����� �������������");
        for (String str : lists) {
            System.out.println(str);
        }

        //������� LinkedList "������ ������" � ������� � ������
        LinkedList<String> colors = new LinkedList<>();
        colors.add("�������");
        colors.add("������");
        colors.add("������");
        colors.add("�����");
        colors.add("�����");
        System.out.println("������ ������");
        for (String str : colors) {
            System.out.println(str);
        }
        //����� ������� �������� "�������" � ������ = ����� true/false
        System.out.println(colors.contains("�������"));

        //������� ������� "������" � ������� ����� ������
        colors.remove("������");
        System.out.println("����� ������ ������");
        for (String str : colors) {
            System.out.println(str);
        }

        //������ ������ ��� LinkedList
        //������� ������ ������� ������
        colors.pollFirst();
        System.out.println("����� ������ ������");
        for (String str : colors) {
            System.out.println(str);
        }
        //������� ��������� ������� ������
        colors.pollLast();
        System.out.println("����� ������ ������");
        for (String str : colors) {
            System.out.println(str);
        }

        //������ �� ������ ����� "����������",  �� ��������� "�����"
        colors.addFirst("����������");
        colors.addLast("�����");
        System.out.println("����� ������ ������");
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