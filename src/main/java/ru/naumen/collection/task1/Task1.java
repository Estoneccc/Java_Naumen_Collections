package ru.naumen.collection.task1;

import ru.naumen.collection.task2.Ticket;

import java.util.*;

/**
 * Дано:
 * <pre>
 * public class User {
 *     private String username;
 *     private String email;
 *     private byte[] passwordHash;
 *     …
 * }
 * </pre>
 * Нужно написать утилитный метод
 * <pre>
 * public static List<User> findDuplicates(Collection<User> collA, Collection<User> collB);
 * </pre>
 * <p>который возвращает дубликаты пользователей, которые есть в обеих коллекциях.</p>
 * <p>Одинаковыми считаем пользователей, у которых совпадают все 3 поля: username,
 * email, passwordHash. Дубликаты внутри коллекций collA, collB можно не учитывать.</p>
 * <p>Метод должен быть оптимален по производительности.</p>
 * <p>Пользоваться можно только стандартными классами Java SE.
 * Коллекции collA, collB изменять запрещено.</p>
 *
 * См. {@link User}
 *
 * @author vpyzhyanov
 * @since 19.10.2023
 */
public class Task1 {

    /**
     * Возвращает дубликаты пользователей, которые есть в обеих коллекциях
     */
    public static List<User> findDuplicates(Collection<User> collA, Collection<User> collB) {
        // TODO

        Set<User> setUser = new HashSet<>(collA);
        collB.retainAll(setUser);
        return new ArrayList<>(collB);
    }

    /*
    public static void main(String[] args) {
        LinkedList<User> list1 = new LinkedList<>();
        LinkedList<User> list2 = new LinkedList<>();

        User user1 = new User("Михаил", "Misha@mail", new byte[]{1, 2});
        User user2 = new User("Сергей", "Sergey@mail", new byte[]{3, 4, 2});
        User user3 = new User("Дмитрий", "Dima@mail", new byte[]{1, 6});

        list1.add(user3);

        list2.add(user1);
        list2.add(user2);
        list2.add(user3);

        List<User> listUser = findDuplicates(list1, list2);
        for (User user : listUser) {
            System.out.println(user.getUsername());
        }
    }*/
}
