package domen;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MyStream<T> {
    private final List<T> elements;

    public MyStream(List<T> elements) {
        this.elements = elements;
    }

    public List<T> toList() {
        return new ArrayList<>(elements);
    }

    public MyStream<T> filter(Predicate<T> predicate) {
        ArrayList<T> filtered = new ArrayList<>();
        for (T element : elements) {
            if (predicate.test(element))
                filtered.add(element);
        }
        return new MyStream<>(filtered);
    }

    public <R> MyStream<R> map(Function<T, R> mapper) {
        ArrayList<R> result = new ArrayList<>();
        for (T element : elements) {
            result.add(mapper.apply(element));
        }
        return new MyStream<>(result);


    }

    public void forEach(Consumer<T> action) {
        for (T element : elements) {
            action.accept(element);
        }
    }

    public long count() {
        return elements.size();
    }

    public MyStream<T> distinct() {
        return new MyStream<>(new ArrayList<>(new LinkedHashSet<>(elements)));
    }

    public MyStream<T> limit(int maxSize) {
        ArrayList<T> limit = new ArrayList<>();
        for (T element : elements) {
            if (limit.size() < maxSize)
                limit.add(element);
        }
        return new MyStream<>(limit);
    }

    public MyStream<T> skip(int n) {
        ArrayList<T> skipped = new ArrayList<>();
        for (int k = n; k < elements.size(); k++) {
            skipped.add(elements.get(k));
        }
        return new MyStream<>(skipped);
    }

    public MyStream<T> sorted(Comparator<T> comparator) {
        ArrayList<T> sorted = new ArrayList<>(elements);
        sorted.sort(comparator);
        return new MyStream<>(sorted);
    }

    public Optional<T> findFirst() {
        return elements.isEmpty() ? Optional.empty() : Optional.of(elements.get(0));
    }
}
