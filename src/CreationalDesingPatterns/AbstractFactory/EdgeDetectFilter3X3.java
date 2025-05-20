package CreationalDesingPatterns.AbstractFactory;

public class EdgeDetectFilter3X3 implements EdgeDetectFilter{
    @Override
    public Image apply(Image img) {
        System.out.println("Applying edge detection filter with 3X3 kernel");
        return new Image();
    }
}
