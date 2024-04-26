// Kelas Shape (Bentuk)
class Shape {
    // Metode menggambar (draw)
    public void draw() {
        System.out.println("Drawing a shape.");
    }
}

// Kelas Circle (Lingkaran) mewarisi dari Shape
class Circle extends Shape {
    // Override metode draw
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

// Kelas Rectangle (Persegi Panjang) mewarisi dari Shape
class Rectangle extends Shape {
    // Override metode draw
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

// Kelas Main untuk mendemonstrasikan polimorfisme
public class Polimorphism {
    public static void main(String[] args) {
        // Membuat array of Shape yang terdiri dari Shape, Circle, dan Rectangle
        Shape[] shapes = new Shape[] {
                new Shape(),
                new Circle(),
                new Rectangle()
        };

        // Mengiterasi array dan memanggil metode draw() pada setiap objek
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
