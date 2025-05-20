package StructuralDesignPatterns.Adapter;


class RoundPeg{
    private int radius;

    RoundPeg(){
        this.radius = 0;
    }

    RoundPeg(int radius){
        this.radius = radius;
    }
    int getRadius(){
        return radius;
    }
}

class SquarePeg{
    private int width;

    SquarePeg(int width){
        this.width = width;
    }

    int getWidth(){
        return width;
    }
}

class RoundHole {
    private int radius;

    RoundHole(int radius){
        this.radius = radius;
    }

    int getRadius(){
        return radius;
    }

    boolean fits(RoundPeg peg){ //Requires a RoundPeg Object. We can not call it from a square peg without using an adapter
        return this.radius >= peg.getRadius();
    }
}

class SquarePegAdapter extends RoundPeg{
    private SquarePeg sqrPeg;

    SquarePegAdapter(SquarePeg peg){
        this.sqrPeg = peg;
    }

    int getRadius(){
        return (int)(sqrPeg.getWidth() * Math.sqrt(2)/2);
    }
}


public class AdapterExample {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        System.out.println(hole.fits(rpeg));

        SquarePeg small = new SquarePeg(5);
        SquarePeg large = new SquarePeg(10);

        //hole.fits(small); //Won't compile because the types are incompatible

        // We need to use the adapter to make the square pegs compatible with the round hole
        SquarePegAdapter smallAdapter = new SquarePegAdapter(small);
        SquarePegAdapter largeAdapter = new SquarePegAdapter(large);

        System.out.println(hole.fits(smallAdapter));
        System.out.println(hole.fits(largeAdapter));
    }

}
