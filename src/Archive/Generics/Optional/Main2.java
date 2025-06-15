package Archive.Generics.Optional;

import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;

public class Main2 {
    public static class Pair<T, U> {
        private final T first;
        private final U second;

        private Pair(T first, U second) {
            this.first = first;
            this.second = second;
        }

        public T getFirst() {
            return this.first;
        }

        public U getSecond() {
            return this.second;
        }

        public static <T, U> Pair<T, U> of(T first, U second) {
            return new Pair<>(first, second);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) return false;
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return Objects.equals(first, pair.first) && Objects.equals(second, pair.second);
        }

        @Override
        public int hashCode() {
            return Objects.hash(first, second);
        }
    }
}
