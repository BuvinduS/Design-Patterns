package AbstractFactory;
/*
* Concrete implementation of the Abstract Factory
*/
public class FilterFactory3X3 implements FilterFactory{
    @Override
    public BlurFilter createBlurFilter() {
        System.out.println("Creating blur filter with 3X3 kernel");
        return new BlurFilter3X3();
    }

    @Override
    public EdgeDetectFilter createEdgeDetectFilter() {
        System.out.println("Creating edge detection filter with 3X3 kernel");
        return new EdgeDetectFilter3X3();
    }

    @Override
    public SharpenFilter createSharpenFilter() {
        System.out.println("Creating edge detection filter with 3X3 kernel");
        return new SharpenFilter3X3();
    }
}
