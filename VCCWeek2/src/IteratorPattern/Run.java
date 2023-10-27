package IteratorPattern;

public class Run {
    public static void main(String[] args) {
        Store store = new Store();
        store.add(new Book("Cha giau cha ngheo",15));
        store.add(new Book("Dac nhan tam",59));
        store.add(new Book("101 cau chuyen chua ke",26));
        store.add(new Book("Ty phu ban giay",41));
        store.add(new Book("Nha gia kim",34));

        BookIterator<Book> iterator = store.iterator();

        while (iterator.hashNext()){
            Book book = iterator.next();
            System.out.println(book.getName());
        }
    }
}
