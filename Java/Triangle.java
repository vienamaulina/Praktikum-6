public class Triangle extends Shape{
    private float base;
    private float height;

    public Triangle(float base, float height){
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw(){
        System.out.println("Drawing Triangle");
    }

    @Override
    public float getAreas(){
        return this.base*height*1/2;
    }
}
