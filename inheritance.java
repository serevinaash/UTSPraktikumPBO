// Kelas Animal
class Animal {
    // Metode berbicara
    public void speak() {
        System.out.println("Animal is making a sound.");
    }
}

// Kelas Dog mewarisi dari Animal
class Dog extends Animal {
    // Metode berbicara
    @Override
    public void speak() {
        System.out.println("Dog is barking.");
    }

    // Metode khusus Dog
    public void wagTail() {
        System.out.println("Dog is wagging its tail.");
    }
}

// Kelas Cat mewarisi dari Animal
class Cat extends Animal {
    // Metode berbicara
    @Override
    public void speak() {
        System.out.println("Cat is meowing.");
    }

    // Metode khusus Cat
    public void purr() {
        System.out.println("Cat is purring.");
    }
}

// Kelas Main untuk mendemonstrasikan pewarisan
public class inheritance {
    public static void main(String[] args) {
        // Membuat instance Dog
        Dog dog = new Dog();

        // Memanggil metode speak() dan wagTail() dari Dog
        dog.speak(); // Dog is barking.
        dog.wagTail(); // Dog is wagging its tail.

        // Membuat instance Cat
        Cat cat = new Cat();

        // Memanggil metode speak() dan purr() dari Cat
        cat.speak(); // Cat is meowing.
        cat.purr(); // Cat is purring.
    }
}
