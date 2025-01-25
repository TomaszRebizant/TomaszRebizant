package lab08;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Collection2<T> {
    private List<T> originalItems = new ArrayList<>();
    private List<T> computedItems = new ArrayList<>();

    public Collection2(T[] items) {
        for (T item : items) {
            this.originalItems.add(item);
            this.computedItems.add(item);
        }
    }
    public Collection2<T> print() {
        for (T item : this.computedItems) {
            System.out.println(item);
        }
        return this;
    }
    public <R> Collection2<R> map(Function<T, R> mapper) {
        List<R> mappedItems = computedItems.stream().map(mapper).collect(Collectors.toList());
        return new Collection2<>((R[]) mappedItems.toArray());
    }

    public Collection2<T> reject(Predicate<T> predicate) {
        computedItems.removeIf(predicate);
        return this;
    }
    public Collection2<T> count(Predicate<T> predicate) {
        int count = 0;
        for (T item : computedItems) {
            if (predicate.test(item)) {
                count++;
            }
        }
        System.out.println(count);
        return this;
    }

    public Collection2<T> filter(Predicate<T> predicate) {
        computedItems.removeIf(predicate.negate());
        return this;
    }

    public Collection2<T> sort(Comparator<T> comparator) {
        computedItems.sort(comparator);
        return this;
    }


      public Collection2<T> limit(int limit) {
          computedItems = List.copyOf(computedItems.subList(0, limit));
          return this;
      }

    public List<T> get() {
        return computedItems;
  }
}
