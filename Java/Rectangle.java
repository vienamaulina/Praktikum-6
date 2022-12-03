public class Rectangle extends Shape {
    private float height;
    private float width;

    public Rectangle(float height, float width){
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw(){
        System.out.println("Drawing Rectangle");
    }

    @Override
    public float getAreas(){
      
        return this.width*this.height;

    }
}
