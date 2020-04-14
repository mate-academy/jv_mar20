package mate.academy.lesson11;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 1. Final fields
 * 2. Constructor for initialization
 * 3. Final class - no inheritance allowed
 * 4. return Copy of collection
 * 5. return Clone of any custom class
 * 6. create Builder class
 * 7. clone the object and collection in the constructor
 */
public final class Immutable {
    private final int size;
    private final String name;
    private final Book book;
    private final List<String> values;

    private Immutable(Builder builder) {
        this.book = (Book) builder.book.clone();
        this.name = builder.name;
        this.size = builder.size;
        this.values = new ArrayList<>(builder.values);
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public Book getBook() {
        return (Book) book.clone();
    }

    public List<String> getValues() {
        return new ArrayList<>(values);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Immutable immutable = (Immutable) o;
        return size == immutable.size &&
                Objects.equals(name, immutable.name) &&
                Objects.equals(book, immutable.book) &&
                Objects.equals(values, immutable.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, name, book, values);
    }

    @Override
    public String toString() {
        return "Immutable{" +
                "size=" + size +
                ", name='" + name + '\'' +
                ", book=" + book +
                ", values=" + values +
                '}';
    }

    public static class Builder {
        private int size;
        private String name;
        private Book book;
        private List<String> values;

        public Builder setSize(int size) {
            this.size = size;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setBook(Book book) {
            this.book = book;
            return this;
        }

        public Builder setValues(List<String> values) {
            this.values = values;
            return this;
        }

        public Immutable build() {
            return new Immutable(this);
        }
    }

    public Immutable withNewBook(Book book) {
        Immutable.Builder builder = new Builder();
        builder.setValues(values).setSize(size).setName(name).setBook(book);
        return builder.build();
    }
}
