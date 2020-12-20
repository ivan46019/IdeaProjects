package task_ivan_logos.hw8logos;
import java.util.Comparator;

public class SortQuantity implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getQuantity() - o2.getQuantity();
    }
}