public class Main {
    public static void  main(String[] args) {
        //membuat objek shape dari kelas rectangle
        Shape rect = new Rectangle(100, 200);

        //membuat objek shape dari kelas Cirle
        Shape circ = new Circle(50);

        //membuat objek shape dari kelas Triangel
        Shape tri = new Triangle(40, 70);

        //memanggil method draw
        rect.draw();
        circ.draw();
        tri.draw();

        System.out.println("Luas lingkaran : "+circ.getAreas());
        System.out.println("Luas Persegi : "+rect.getAreas());
        System.out.println("Luas Segitiga : "+tri.getAreas());
    }
}
