package chiskien.effectivejava.chapter1_objectslifecycle.item2;

public class Book {

    private final String title;
    private final String author;
    private final Long id;
    private final String isbn;
    private final double price;

    public Book(Builder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.id = builder.id;
        this.isbn = builder.isbn;
        this.price = builder.price;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", id=" + id +
                ", isbn='" + isbn + '\'' +
                ", price=" + price +
                '}';
    }

    public static final class Builder {
        private String title = "";
        private String author = "";
        private String isbn = "";
        private Long id = 0L;
        private double price = 0.0;

        public Builder title(String value) {
            this.title = value;
            return this;
        }

        public Builder author(String value) {
            this.author = value;
            return this;
        }

        public Builder isbn(String value) {
            this.isbn = value;
            return this;
        }

        public Builder id(Long value) {
            this.id = value;
            return this;
        }

        public Builder price(double price) {
            this.price = price;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}
