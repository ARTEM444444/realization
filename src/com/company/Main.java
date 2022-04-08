package com.company;


import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        String element1 = "Привет";
        String element2 = "Меня";
        String element3 = "Зовут";
        String element4 = "Артём";
        String element5 = "Я";
        String element6 = "Учусь";
        String element7 = "Програмированию";
        String element = null;
        String element0 = "И";
        List<String> list = new ArrayList<>();

        // Добавление элементов в коллекцию!
        // Также можно вставить и нулевые значения!

        list.add(element1);
        list.add(element2);
        list.add(element3);
        list.add(element4);
        list.add(element5);
        list.add(element6);
        list.add(element7);
        list.add(element);
        list.add(element1);


        // Можно вставить элемент в список по определенному индексу. Интерфейс List имеет версию метода add(),
        // которая принимает индекс в качестве первого параметра, и элемент для вставки в качестве второго:

        list.add(4, element0);

        // Если список уже содержит элементы, они теперь будут перемещены дальше во внутренней последовательности
        // списка. Элемент, который имел индекс 4 до того, как новый элемент был вставлен в индекс 4,
        // будет перемещен в индекс 5 и т. д.
        // int size = list.size();
        // System.out.println(size);

        // Можно получить количество элементов, вызвав метод size():

        int size = list.size();
        System.out.println("Количество элементов = " + size);


        // С помощью метода List addAll() можно вставить все элементы в один список.

        List<String> listDest = new ArrayList<>();
        listDest.addAll(list);

        // Все элементы из list добавляются в listDest. Метод addAll() принимает коллекцию в качестве параметра,
        // поэтому вы можете передать в качестве параметра список или набор. Другими словами,
        // можете добавить все элементы из списка или набора с помощью addAll().


        // Для получения элементов используется индекс элементов, а также метод get(int index):

        String element00 = (String) list.get(0);
        String element01 = (String) list.get(1);
        String element02 = (String) list.get(2);
        String element03 = (String) list.get(3);
        String element04 = (String) list.get(4);
        String element05 = (String) list.get(5);
        String element06 = (String) list.get(6);
        String element07 = (String) list.get(7);
        String element08 = (String) list.get(8);


        // Также возможно итерировать элементы списка в том порядке, в котором они хранятся внутри.

        // Для поиска элементов Используется один из этих двух методов: indexOf() или LastIndexOf().
        // Метод indexOf() находит индекс первого вхождения в списке заданного элемента:

        int index1 = list.indexOf(element1);
        int index2 = list.indexOf(element2);
        int index3 = list.indexOf(element3);
        int index4 = list.indexOf(element4);
        int index5 = list.indexOf(element0);
        int index6 = list.indexOf(element5);
        int index7 = list.indexOf(element6);
        int index8 = list.indexOf(element7);
        int index9 = list.indexOf(element);

        System.out.println("index1 = " + index1);
        System.out.println("index2 = " + index2);
        System.out.println("index3 = " + index3);
        System.out.println("index4 = " + index4);
        System.out.println("index5 = " + index5);
        System.out.println("index6 = " + index6);
        System.out.println("index7 = " + index7);
        System.out.println("index8 = " + index8);
        System.out.println("index9 = " + index9);

        // Запуск этого кода приведет к следующему выводу:
        // index1 = 0
        // index2 = 1
        // index3 = 2
        // index4 = 3
        // index5 = 4
        // index6 = 5
        // index7 = 6
        // index8 = 7
        // index9 = 8


        // Метод lastIndexOf() находит индекс последнего вхождения в списке данного элемента:

        int lastIndex = list.lastIndexOf(element1);
        System.out.println("lastIndex = " + lastIndex);

        // Выходные данные, напечатанные при запуске приведенного выше примера, будут следующими:
        // lastIndex = 9;
        // Элемент 1 элемент встречается 2 раза в списке. Индекс последнего появления равен 9.


        // Для проверки содержится ли элемент используется метод List contains():

        boolean containsElement =
                list.contains("И");
        System.out.println(containsElement);

        // Результатом выполнения этого примера будет: true, потому что список действительно содержит элемент.
        // Чтобы определить, содержит ли List этот элемент, List будет внутренне выполнять итерации своих
        // элементов и сравнивать каждый с объектом, переданным в качестве параметра.
        // Для сравнения используется метод равенства.

        // Поскольку можно добавить нулевые значения в список, фактически можно проверить, содержит ли он их:

        containsElement = list.contains(null);
        System.out.println(containsElement);

        // Очевидно, что если входной параметр для contains() имеет значение null, метод contains()
        // не будет использовать метод equals() для сравнения с каждым элементом,
        // а вместо этого использует оператор ==.


        // Можно удалить элементы с помощью этих двух методов: remove(Object element) и remove(int index).

        // remove(Object element) удаляет этот элемент в списке, если он присутствует.
        // Все последующие элементы затем перемещаются вверх по списку. Таким образом,
        // их индекс уменьшается на 1. Вот пример:

        list.remove(element4);

        // Метод remove(int index) удаляет элемент по указанному индексу.
        // Все последующие элементы в списке затем перемещаются вверх.
        // Таким образом, их индекс уменьшается на 1. Вот пример:

        list.remove(6);

        // После запуска этого примера кода в списке уже не будет содержаться элемент element7
        // все последующие элементы поднимуться на 1 индекс вверх.


        // Интерфейс List содержит метод clear(), который удаляет все элементы из списка при вызове.
        // Также называется очисткой списка.

        list.clear();

        // Сначала создается новый список. Во-вторых, два элемента добавляются в список.
        // В-третьих, вызывается метод clear(). После вызова метода clear() список будет полностью пустым.


        // Интерфейс Java List имеет метод retainAll(), который способен сохранять все элементы из одного списка,
        // которые также присутствуют в другом списке. Другими словами, метод retain() удаляет все элементы
        // из целевого списка, которые не найдены в другом списке. Полученный список является пересечением
        // двух списков.

        List<String> otherList = new ArrayList<>();
        String element9 = "Андрей";

        otherList.add(element1);
        otherList.add(element3);
        otherList.add(element9);

        list.retainAll(otherList);


        // Метод retainAll() вызывается, передавая otherList в качестве параметра.
        // После того, как list.retainAll(otherList) завершит выполнение,
        // список будет содержать только те элементы, которые присутствовали как в list,
        // так и otherList до вызова retainAll(). Более конкретно, это element1 и element3.


        // Интерфейс List имеет метод subList(), который может создавать новый List с подмножеством элементов
        // из исходного List.
        // Метод subList() принимает 2 параметра:
        // Начальный индекс – это индекс первого элемента из исходного списка для включения в подсписок.
        // Конечный индекс является последним индексом подсписка, но элемент в последнем индексе не
        // включается в подсписок.
        // Это похоже на то, как работает метод подстроки Java String.

        List<String> list1 = new ArrayList<>();
        list1.add("element 1");
        list1.add("element 2");
        list1.add("element 3");
        list1.add("element 4");
        List sublist = list1.subList(1, 3);
        System.out.println(sublist);


        // После выполнения инструкции list.subList(1,3) подсписок будет содержать элементы с индексами 1 и 2.
        // Помните, что исходный список содержит 4 элемента с индексами от 0 до 3. Вызов list.subList(1,3)
        // будет включить индекс 1, но исключить индекс 3, тем самым сохраняя элементы с индексами 1 и 2.


        // Можно преобразовать в набор, создав новый набор и добавив в него все элементы из списка.
        // При этом удалятся все дубликаты. Таким образом, результирующий набор будет содержать
        // все элементы списка, но только один раз.

        List<String> list2 = new ArrayList<>();
        list2.add("element 1");
        list2.add("element 2");
        list2.add("element 3");
        list2.add("element 3");
        Set<String> set = new HashSet<>();
        set.addAll(list2);
        System.out.println(set);


        // Преобразовать в массив можно с помощью метода List toArray():

        List<String> list3 = new ArrayList<>();
        list3.add("element 1");
        list3.add("element 2");
        list3.add("element 3");
        list3.add("element 3");
        Object[] objects = list3.toArray();

        // Также возможно преобразовать в массив определенного типа:

        String[] objects1 = list3.toArray(new String[0]);

        // Даже если мы передадим массив String размером 0 в toArray(),
        // в возвращенном массиве будут все элементы списка. Он будет иметь то же количество элементов,
        // что и список.


        // С помощью метода  Arrays.asList()  можно конвертировать массив в список

        String[] values = new String[]{"one", "two", "three"};
        List list4 = Arrays.asList(values);


        //Итерация с использованием итератора

        List<String> list7 = new ArrayList<>();
        list7.add("first");
        list7.add("second");
        list7.add("third");
        Iterator<String> iterator = list7.iterator();
        while(iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

        // Мы получаете Iterator, вызывая метод iterator() интерфейса List.

        // Получив Iterator, можно продолжать вызывать его метод hasNext(),
        // пока он не вернет false. Вызов hasNext() выполняется внутри цикла while.

        // Внутри цикла while мы вызываем метод Iterator next() интерфейса
        // Iterator для получения следующего элемента, на который указывает Iterator.

        // Если список напечатан с использованием Java Generics, вы можете сохранить некоторые
        // объекты внутри цикла while

        List<String> list8 = new ArrayList<>();
        list8.add("first");
        list8.add("second");
        list8.add("third");

        Iterator<String> iterator1 = list.iterator();
        while(iterator1.hasNext()){
            String obj = iterator1.next();
            System.out.println(obj);
        }

            //Итерация с использованием цикла For-Each

            List<String> list9 = new ArrayList<>();
            list9.add("first");
            list9.add("second");
            list9.add("third");
            for (Object elem : list9) {
                System.out.println(elem);
            }


            // Цикл for выполняется один раз для каждого элемента списка.
            // Внутри него каждый элемент, в свою очередь, связан с переменной obj.


            // Если список напечатан (List), вы можете изменить тип переменной внутри цикла:

        List<String> list0 = new ArrayList<>();

        for(String elemen : list0) {
            System.out.println(elemen);
        }

        // Список набирается как String. Поэтому можно установить тип
        // переменной внутри цикла для String.


        //Итерация с помощью цикла For

        List<String> lis = new ArrayList<>();
        lis.add("first");
        lis.add("second");
        lis.add("third");

        for(int i=0; i < lis.size(); i++) {
            Object elem = lis.get(i);
            System.out.println(elem);

        }

        // Цикл for создает переменную int и инициализирует ее равной 0.
        // Затем он зацикливается до тех пор, пока int i меньше размера списка.
        // Для каждой итерации переменная увеличивается.

        // Внутри цикла for пример обращается к элементам List с помощью метода get(),
        // передавая переменную i в качестве параметра.

        // Опять же, если список набирается с использованием Java Generics,
        // например, для String, то вы можете использовать универсальный тип List
        // в качестве типа для локальной переменной, которая назначается каждому
        // элементу List в ходе итерации:


        List<String> list01 = new ArrayList<>();
        list01.add("first");
        list01.add("second");
        list01.add("third");

        for(int i=0; i < list01.size(); i++) {
            String el = list01.get(i);
            System.out.println(el);
        }

        // Тип локальной переменной внутри цикла for теперь String.
        // Поскольку список обычно типизируется как String, он может содержать
        // только объекты String. Следовательно, компилятор знает,
        // что только метод String может быть возвращен из метода get().
        // Поэтому не нужно приводить элемент, возвращенный get(), в String.


        // С использованием API Java Stream

        // Для итерации нужно сначала получить поток из списка.
        // Это выполняется путем вызова метода List stream().
        // Вот пример получения потока из списка:

        List<String> stringList = new ArrayList<>();
        stringList.add("abc");
        stringList.add("def");
        Stream stream = stringList.stream();

        // Последняя строка этого примера вызывает метод List stream() для получения потока,
        // представляющего элементы списка.

        //Как только получили поток, можно выполнить итерацию потока, вызвав его метод forEach():

        stream
                .forEach( elemen -> { System.out.println(element); });

        //Вызов метода forEach() заставит Stream выполнить внутреннюю итерацию
        // всех элементов потока и вызвать получателя, переданного в качестве
        // параметра методу forEach() для каждого элемента в потоке.




        LinkedList<String> names = new LinkedList<>();

        // Чтобы добавить элемент в список, можно использовать.add()метод.
        // Этот метод принимает элемент (переданный в качестве аргумента) и добавляет его в конец списка.

        names.add("Brian");
        names.add("June");
        System.out.println(names);

        // Если вместо этого мы хотим добавить новый элемент в определенное место,
        // можно сделать это, передав значение индекса в качестве первого аргумента.add()метода.

        names.add(1, "Kathy");
        System.out.println(names);

        // Вышеупомянутая строка кода вставляет «Кэти» в namesсписок в 1позиции или индексе.
        // Поскольку первый элемент в списке имеет индекс 0, «Кэти» будет вставлена
        // сразу после «Брайан» и непосредственно перед «июнь».
        // Такое поведение возможно, потому что связанные списки индексируются как массивы JavaScript.

        // Также существуют методы для явного добавления элементов в конец или начало списка.

        names.addFirst("Luke");
        names.addLast("Harry");
        System.out.println(names);

        // .addFirst()Метод добавляет заданный элемент в начале списка.
        // Чтобы добавить элемент в конечную позицию списка, используется.addLast()метод.
        // В блоке кода выше «Люк» вставляется в список и становится первым элементом в списке
        // (теперь у него есть индекс 0). В конце вставляется элемент «Гарри»,
        // что делает его последним элементом в списке.

        // Подобно добавлению элементов, связанный список предоставляет методы
        // для удаления элементов в списке. Эти методы аналогичны по работе методам
        // добавления элементов в список..remove()Метод удаляет первое вхождение указанного элемента.

        names.remove("Brian");
        System.out.println(names);

        // Этот метод похож на.add()метод, поскольку он позволяет удалить элемент
        // по определенному индексу. Вызов names.remove(2)удалит элемент по индексу 2,
        // которым в этом списке является «Брайан». Кроме того, можно удалить первый
        // элемент и последний элемент в списке, используя.removeFirst()и.removeLast()методы соответственно.

        names.removeFirst();
        names.removeLast();
        System.out.println(names);

        // Класс Linked List предоставляет метод для изменения элемента в списке.
        // Этот метод вызывается.set(), и он принимает индекс и элемент,
        // который необходимо вставить, заменяя предыдущий элемент в этой позиции.

        names.set(0, "Katherine");
        System.out.println(names);

        // Есть несколько методов для перебора элементов в LinkedList.
        // В приведенном ниже примере мы используем for цикл и.get()метод связанного списка.

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        // Мы также могли бы использовать цикл foreach для перебора связного списка.

        for (String str : names) {
            System.out.println(str);
        }


        // Связанный список действует как динамический массив. Это означает, что нам не нужно
        // указывать размер при его создании, его размер автоматически изменяется, когда мы добавляем
        // и удаляем элементы. Класс Linked List также реализован с использованием структуры данных
        // двусвязного списка.

        // Это означает, что каждый элемент в списке содержит ссылку на элементы до и после него.
        // Если элемент является последним в списке, будет возвращена его следующая ссылка null.

        // Такой дизайн делает связанный список полезным в случаях, когда:

        // Вы используете список только в цикле вместо доступа к случайным элементам.
        // Вам часто нужно добавлять и удалять элементы из начала или из середины списка.
        // Этот дизайн также делает LinkedList сравнительно неблагоприятным для ArrayList,
        // который обычно является реализацией List по умолчанию в Java, следующими способами:

        // Он использует больше памяти, чем ArrayList из-за хранилища, используемого ссылками
        // на его элементы, один для предыдущего элемента и один для следующего элемента.
        // Элементы в связанном списке должны читаться в порядке от начала (или до конца),
        // поскольку связанные списки по своей сути являются последовательным доступом.



        }


 }





