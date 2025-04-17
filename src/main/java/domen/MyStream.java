package domen;

import java.util.*;
import java.util.function.BinaryOperator;
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
        ArrayList<R> result = new ArrayList<>(elements.size());
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

        boolean shouldLimit = maxSize > elements.size();
        ArrayList<T> limited = new ArrayList<>(shouldLimit ? elements.size() : maxSize);

        for (int i = 0; i < (shouldLimit ? elements.size() : maxSize); i++) {
            limited.add(elements.get(i));
        }

        return new MyStream<>(limited);
    }

    public MyStream<T> skip(int n) {
        ArrayList<T> skipped = new ArrayList<>(elements.size() - n);
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

    public boolean allMatch(Predicate<T> predicate) {
        for (T element : elements) {
            if (!predicate.test(element)) return false;
        }
        return true;
    }

    public boolean anyMatch(Predicate<T> predicate) {
        for (T element : elements) {
            if (predicate.test(element)) return true;
        }
        return false;
    }

    public boolean noneMatch(Predicate<T> predicate) {
        for (T element : elements) {
            if (predicate.test(element)) return false;
        }
        return true;
    }

    public T reduce(T identity, BinaryOperator<T> accumulator) {

        for (T element : elements) {
            identity = accumulator.apply(identity, element);
        }
        return identity;

    }

    public Optional<T> min(Comparator<T> comparator) {
        if (elements.isEmpty()) return Optional.empty();

        T min = elements.get(0);
        for (T element : elements) {
            if (comparator.compare(element, min) < 0) min = element;
        }
        return Optional.of(min);
    }

    public Optional<T> max(Comparator<T> comparator) {
        if (elements.isEmpty()) return Optional.empty();

        T max = elements.get(0);
        for (T element : elements) {
            if (comparator.compare(element, max) > 0) max = element;
        }
        return Optional.of(max);
    }

    public MyStream<T> peek(Consumer<T> action) {
        for (T element : elements) {
            action.accept(element);
        }
        return this;
    }

    public <R> MyStream<R> flatMap(Function<T, MyStream<R>> mapper) {
        List<R> flattened = new ArrayList<>();

        for (T element : elements) {
            MyStream<R> stream = mapper.apply(element);
            flattened.addAll(stream.toList());
        }
        return new MyStream<>(flattened);

    }

    public String join(CharSequence delimiter) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < elements.size(); i++) {
            result.append(elements.get(i));

            if (i < elements.size() - 1) {
                result.append(delimiter);
            }
        }
        return result.toString();
    }


}
