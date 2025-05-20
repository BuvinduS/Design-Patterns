package CreationalDesingPatterns.AbstractFactory;

public class PhotoBooth {
    public BlurFilter blurf;
    public EdgeDetectFilter edgef;
    public SharpenFilter sharpf;
    public FilterFactory ffactory;  //declares a reference variable named ffactory of type FilterFactory.
                                    //It later receives an actual instance of a concrete class that implements the interface

    public PhotoBooth(FilterFactory ffactory){
        this.ffactory = ffactory;
        //Different filters are created by the Factory object
        blurf = ffactory.createBlurFilter();
        edgef = ffactory.createEdgeDetectFilter();
        sharpf = ffactory.createSharpenFilter();
    }

    public Image blur(Image img){return blurf.apply(img);}
    public Image edgeDetect(Image img){return edgef.apply(img);}
    public Image sharpen(Image img){return sharpf.apply(img);}

    public static void main(String[] args) {
        //Use a concrete FilterFactory instance
        FilterFactory3X3 ff = new FilterFactory3X3();
        //Create a Photo Booth with specific FilterFactory
        PhotoBooth pb = new PhotoBooth(ff);

        Image lena = new Image("lena.jpg");
        lena = pb.sharpen(lena);
        lena = pb.edgeDetect(lena);
        lena = pb.blur(lena);
    }
}
