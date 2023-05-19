package abstrak;
// Abstract Class: LibraryItem
public abstract class LibraryItem {
    protected String title;

    public LibraryItem(String title) {
        this.title = title;
    }

    protected abstract void display();

    public void borrowItem() {
        System.out.println("Item borrowed: " + title);
    }

    public void returnItem() {
        System.out.println("Item returned: " + title);
    }
}
