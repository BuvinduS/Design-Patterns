package CreationalDesingPatterns.AbstractFactory;

public class BlurFilter3X3 implements BlurFilter{
    @Override
    public Image apply(Image img) {
        System.out.println("Applying blur filter with 3X3 kernel");
        return new Image();
    }
}
