// Antarmuka Vehicle
interface Vehicle {
    // Metode untuk menghidupkan kendaraan
    void start();

    // Metode untuk mematikan kendaraan
    void stop();
}

// Kelas Car mengimplementasikan antarmuka Vehicle
class Car implements Vehicle {
    // Implementasi metode start untuk mobil
    @Override
    public void start() {
        System.out.println("Car is starting.");
    }

    // Implementasi metode stop untuk mobil
    @Override
    public void stop() {
        System.out.println("Car is stopping.");
    }
}

// Kelas Bike mengimplementasikan antarmuka Vehicle
class Bike implements Vehicle {
    // Implementasi metode start untuk sepeda motor
    @Override
    public void start() {
        System.out.println("Bike is starting.");
    }

    // Implementasi metode stop untuk sepeda motor
    @Override
    public void stop() {
        System.out.println("Bike is stopping.");
    }
}

// Kelas Main untuk mendemonstrasikan penggunaan antarmuka
public class Interface {
    public static void main(String[] args) {
        // Membuat array of Vehicle yang terdiri dari Car dan Bike
        Vehicle[] vehicles = new Vehicle[] {
                new Car(),
                new Bike()
        };

        // Mengiterasi array dan memanggil metode start() dan stop() pada setiap objek
        for (Vehicle vehicle : vehicles) {
            vehicle.start();
            vehicle.stop();
        }
    }
}
