package chiskien.designpatterns.iteratorcomposite;

public class DinerMenu implements Iterator {
    MenuItem[] items;
    int position = 0;

    public DinerMenu(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items[position];
        position++;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }
}
