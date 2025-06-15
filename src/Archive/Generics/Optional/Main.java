package Archive.Generics.Optional;

import Archive.Generics.ItKot.example.Example2;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {

    }
    public static class Pair<T,V> {
        private  T first;
        private  V second;

        private Pair(T first, V second) {
            this.first = first;
            this.second = second;
        }
        public T getFirst() {
            return first;
        }

        public V getSecond() {
            return second;
        }

        public static <T, V> Pair<T, V> of (T f, V s) {
            return new Pair<T, V>(f, s);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
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
