package lesson10;

public class Lesson10 {

    public static void main(String[] args) {

        Author tolkin = new Author("Джон", "Толкин");

        Author joanne = new Author("Джоан", "Роулинг");

        Book lor = new Book("Властелин колец", tolkin, 1954 );
        System.out.println("lor.getAuthor() = " + lor.getAuthor().getName() + " " + lor.getAuthor().getSurname());
        System.out.println("lor.name = " + lor.getNamebook());
        System.out.println("lor.publicationYear = " + lor.getPublicationYear());


        Book gp = new Book("Гарри Поттер", joanne ,1997);
        System.out.println("gp.getAuthor() = " + gp.getAuthor().getName() + " " + gp.getAuthor().getSurname());
        System.out.println("gp.namebook = " + gp.getNamebook());
        System.out.println("gp.publicationYear = " + gp.getPublicationYear());
        gp.setPublicationYear(1998);
        System.out.println("gp.getPublicationYear() = " + gp.getPublicationYear());

    }

}
