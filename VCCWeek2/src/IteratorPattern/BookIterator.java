package IteratorPattern;

public interface BookIterator <T> {
    boolean hashNext();
    T next();
}
