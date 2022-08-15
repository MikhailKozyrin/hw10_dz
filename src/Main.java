public class Main {
    public static void main(String[] args) {

        Author haioMiadzaki = new Author("Хаяо", "Миядзаки");
        Book stranaChudes = new Book("Страна чудес без тормозов", 1987, haioMiadzaki);
        Book stranaChudes2 = new Book("Страна чудес без тормозов", 1987, haioMiadzaki);

        stranaChudes.setPublicationYear(1990);

        System.out.println(haioMiadzaki);
        System.out.println(stranaChudes);

        System.out.println(stranaChudes.hashCode() == stranaChudes2.hashCode());
        System.out.println(stranaChudes.equals(stranaChudes2));


    }
}