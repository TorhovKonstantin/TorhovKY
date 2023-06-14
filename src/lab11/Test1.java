package lab11;

public class Test1 {
    // Создание несвязанных узлов с помощью конструкторов
    public static void main(String[] args) {
        Primer6 node0 = new Primer6(0, null); // головной список
        Primer6 node1 = new Primer6(1, null);
        Primer6 node2 = new Primer6(2, null);
        Primer6 node3 = new Primer6(3, null); // хвост в списке

        node0.next = node1;
        node1.next = node2;
        node2.next = node3;

        //Вывод списка с использованием вспомогательной переменной ref
        //Соотвествующей текущему значению ссылки при прохождение по списку
        Primer6 ref= node0; //Для прохождения по списку достаточно знать только "голову"
        while (ref != null){
            System.out.println(ref.value);
            ref = ref.next;
        }
    }
}
