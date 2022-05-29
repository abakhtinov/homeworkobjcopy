package lesson11;

public class Lesson11 {

    public static void main(String[] args) {

        Author tolkin = new Author("Джон", "Толкин");

        Author joanne = new Author("Джоан", "Роулинг");

        Book lor = new Book("Властелин колец", tolkin, 1954);
        System.out.println(lor);

        Book gp = new Book("Гарри Поттер", joanne, 1997);
        System.out.println(gp);
        gp.setPublicationYear(1998);
        System.out.println("gp.getPublicationYear() = " + gp.getPublicationYear());
        System.out.println(joanne.equals(tolkin));
        System.out.println(gp.equals(lor));
        System.out.println(gp.hashCode());
        System.out.println(lor.hashCode());
        System.out.println(tolkin.hashCode());
        System.out.println(joanne.hashCode());
    }


}
