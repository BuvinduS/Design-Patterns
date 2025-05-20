package CreationalDesingPatterns.AbstractFactory;

public class SharpenFilter3X3 implements SharpenFilter{
    @Override
    public Image apply(Image img) {
        System.out.println("Applying sharpenning filter with 3X3 kernel");
        return new Image();
    }
}
