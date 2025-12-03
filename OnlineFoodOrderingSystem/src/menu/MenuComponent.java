package menu;

public abstract class MenuComponent {
    protected String name;

    public MenuComponent(String name) {
        this.name = name;
    }

    public void add(MenuComponent component) {}
    public void remove(MenuComponent component) {}
    public MenuComponent getChild(int i) { return null; }

    public abstract void display();
}
