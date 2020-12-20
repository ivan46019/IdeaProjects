package task_ivan_logos.hw8logos;

import java.util.Comparator;

public class SortWeight implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o1.getWeight() - o2.getWeight());
    }
}
