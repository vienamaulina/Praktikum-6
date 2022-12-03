public abstract class Shape {
    String color;

    public String getcolor(){
        return this.color;
    }

    public void setcolor(String color){
        this.color = color;
    }

    public abstract void draw();
    public abstract float getAreas();
}
