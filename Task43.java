//Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор


import java.util.Iterator;
import java.util.LinkedList;

public class Task43 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.add(5);
        linkedList1.add(2);
        linkedList1.add(7);
        linkedList1.add(4);
        linkedList1.add(1);
        int sum = 0;

        Iterator<Integer> iterator = linkedList1.iterator();
        while (iterator.hasNext()) {
            sum += iterator.next();
        }
        System.out.println(sum);

    }
}
