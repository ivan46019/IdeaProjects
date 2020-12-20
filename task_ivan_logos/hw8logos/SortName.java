package task_ivan_logos.hw8logos;

import java.util.Comparator;

public class SortName implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

