package compositePattern;

import java.util.ArrayList;
import java.util.List;

abstract class Parent implements Component {
    List<Component> children;

    public Parent() {
        this.children = new ArrayList<>();
    }

    void add(Component child) {
        children.add(child);
    }

    void remove(Component child) {
        children.remove(child);
    }


}
