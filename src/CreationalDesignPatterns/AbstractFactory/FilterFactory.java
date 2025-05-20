package CreationalDesignPatterns.AbstractFactory;

/*
* This is the Abstract Factory that the clients would use
* They do not need to know any implementation details
*/
public interface FilterFactory {
    public BlurFilter createBlurFilter();
    public EdgeDetectFilter createEdgeDetectFilter();
    public SharpenFilter createSharpenFilter();
}
