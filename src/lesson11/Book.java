package lesson11;

import lesson11.Author;

import java.util.Objects;

public class Book {
        private String namebook;
        private int publicationYear;

        private Author author;


        public Book(String namebook, Author author, int publicationYear) {
            this.namebook = namebook;
            this.author = author;
            this.publicationYear = publicationYear;

        }

        public String getNamebook() {
            return this.namebook;
        }

        public int getPublicationYear() {
            return this.publicationYear;
        }

        public Author getAuthor() {
            return this.author;
        }


        public void setPublicationYear(int publicationYear) {
            this.publicationYear = publicationYear;
        }

        public String toString() {
            return "Название книги: " + getNamebook() + ", " + "Год публикации: " + getPublicationYear() + ", " + "Автор: " + getAuthor();

        }

        public boolean equals(Object x) {
            if (this.getClass() != x.getClass()) {
            return false;
            }
            Book lor = (Book) x;
            return namebook.equals(lor.namebook);

        }

        public int hashCode() {
        return Objects.hash(namebook);
        }
}
