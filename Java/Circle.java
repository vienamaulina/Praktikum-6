public class Circle extends Shape{
    private float radius;

    public Circle(float radius){
        this.radius = radius;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public float getAreas(){
        return (float)(Math.PI*radius*radius);
    }
}
