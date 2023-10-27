package IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class Store {
    public List<Book> store = new ArrayList<>();

    public void add(Book book){
        store.add(book);
    }
    public BookIterator<Book> iterator(){
        return new StoreIterator();
    }
    class StoreIterator implements BookIterator<Book> {
        private Integer currentPoint = 0;

        @Override
        public boolean hashNext() {
            return currentPoint < store.size();
        }

        @Override
        public Book next() {
            return store.get(currentPoint++);
        }
    }
}