import java.util.*;

public class CollectionExample {
    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.gecko.driver",
//                "D:\\ШАГ\\ШАГ Автотестирование\\ДЗ\\Lesson14 Selenium\\geckodriver.exe");
//        WebDriver webDriver = new FirefoxDriver();
        System.out.println("START");

        int[] arr = new int[10];
        String[] strings = new String[10];

        for (String string : strings) {
            //System.out.print(string.charAt(0) + " "); //null.charAt = NullPointerException у пустого значения НЕЛЬЗЯ ВЫЗВАТЬ МЕТОД
            System.out.print(string + " ");
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }

        //===================Collection===================
        //List

        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(12);
        linkedList.add(13);
        linkedList.add(21);
        linkedList.remove(0);
        linkedList.add(0, 100);

        for (Integer integer : linkedList) {
            System.out.println("Linked" + integer);
        }

        List<String> arrayList = new ArrayList<>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");
        arrayList.remove("one");
       // arrayList.remove(0);
        for (String s : arrayList) {
            System.out.println("ArrayList" + s);
        }
        // [19:46] Лукашик Евгений Александрович
        //https://proft.me/2014/10/29/raznica-mezhdu-arraylist-i-linkedlist/
        //Разница между ArrayList и LinkedList
        //Описана разница между ArrayList и LinkedList и приведены примеры работы с этими контейнерами в Java.

        Set<String> set=new HashSet<>(); //set - хранит только уникальные значения, а arrayList значений "one" может быть безконечное множество
        // не обещает порядок элементов
        set.add("A");
        set.add("A");
        set.add("A");
        set.add("A");
        set.add("X");
        set.add("B");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("Z");
        //алфавит и целочистленные значения сортируются по ХЕШКОДУ и увеличению
        for (String s : set) {
            System.out.println("Set=" + s);
        }

        Iterator<String>iterator = set.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println("SetIterator");
        }

        System.out.println("A".hashCode());
        System.out.println("B".hashCode());
        Integer a = 12;
        System.out.println(a.hashCode());
        Integer b = 13;
        System.out.println(b.hashCode());


        //equals and hashcode (+ смотрим в файл Student)
        Set<Student>students = new HashSet<>();
        students.add(new Student("Elon", "123345"));
        students.add(new Student("Mike", "23455"));
        students.add(new Student("Mike", "23455"));
        students.add(new Student("Mike", "23455"));
        students.add(new Student("Tommy", "56987"));
        students.add(new Student("Jim", "78512"));

        for (Student student : students) {
            System.out.println("student=" + student);
        }
        System.out.println();


    }
}
