package menu;
import java.util.ArrayList;

public class MenuCategory extends MenuComponent {
    private ArrayList<MenuComponent> items = new ArrayList<>();

    public MenuCategory(String name) {
        super(name);
    }

    @Override
    public void add(MenuComponent component) {
        items.add(component);
    }

    @Override
    public void display() {
        System.out.println("\nCategory: " + name);
        for (MenuComponent item : items) {
            item.display();
        }
    }
}
