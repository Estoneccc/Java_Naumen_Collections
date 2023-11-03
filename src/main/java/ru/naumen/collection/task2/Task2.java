package ru.naumen.collection.task2;

import java.util.HashMap;
import java.util.Map;

/**
 * Дано:
 * <pre>
 * public class Ticket {
 *     private long id;
 *     private String client;
 *     …
 * }</pre>
 * <p>Разработать программу для бармена в холле огромного концертного зала.
 * Зрители в кассе покупают билет (класс Ticket), на котором указан идентификатор билета (id) и имя зрителя.
 * При этом, есть возможность докупить наборы разных товаров (комбо-обед): нет товаров, напитки, еда и напитки.
 * Доп. услуги оформляются через интернет и привязываются к билету, но хранятся отдельно от билета
 * (нельзя добавить товары в класс Ticket).</p>
 * <p>Бармен сканирует билет и получает объект Ticket. По этому объекту нужно уметь
 * находить необходимые товары по номеру билета. И делать это нужно очень быстро,
 * ведь нужно как можно быстрее всех накормить.</p>
 * <p>
 * См. {@link Ticket}
 *
 * @author vpyzhyanov
 * @since 19.10.2023
 */
public class Task2 {

    // TODO
    /**
     * База, в которой находятся билеты и соответствующие к ним товары.
     */
    private static final Map<Ticket, String> ticketMap = new HashMap<Ticket, String>(){{
        put(new Ticket(12, "Misha"), "нет товаров");
        put(new Ticket(4, "Lesha"), "еда и напитки");
        put(new Ticket(13, "Masha"), "напитки");
        put(new Ticket(156, "Kirill"), "еда и напитки");
    }};

    /**
     * Возваращает товар, привязанный к билету.
     * @param ticket билет, по которому нужно найти товар.
     * @return Товар, который привязан к билету.
     */
    public static String findProduct(Ticket ticket){
        return ticketMap.get(ticket);
    }
/*
    public static void main(String[] args) {
        System.out.println(findProduct(new Ticket(13, "Masha")));
    }*/
}
