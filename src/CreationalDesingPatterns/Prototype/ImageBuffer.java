package CreationalDesingPatterns.Prototype;
//The "Abstract" prototype
abstract class ImageBuffer implements Cloneable{
    public ImageBuffer clone() throws CloneNotSupportedException{
        return (ImageBuffer) super.clone();
    }
    public void log(String s){
        System.out.println(s);
    }
}
