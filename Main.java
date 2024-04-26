import java.util.Scanner;

// Kelas Person
class Person {
    // Variabel privat mengenkapsulasi data
    private String name;
    private int age;

    // Konstruktor untuk menginisialisasi person
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Metode publik untuk mengakses variabel privat
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
}

// Kelas Employee mewarisi dari Person
class Employee extends Person {
    // Variabel privat khusus untuk Employee
    private String employeeId;
    private String department;

    // Konstruktor untuk menginisialisasi Employee
    public Employee(String name, int age, String employeeId, String department) {
        super(name, age);
        this.employeeId = employeeId;
        this.department = department;
    }

    // Metode publik untuk mengakses variabel privat
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

// Kelas Main untuk mendemonstrasikan enkapsulasi
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mengambil input untuk Person
        System.out.println("Masukkan nama untuk Person:");
        String personName = scanner.nextLine();

        System.out.println("Masukkan usia untuk Person:");
        int personAge = scanner.nextInt();
        scanner.nextLine(); // Membersihkan sisa input

        // Membuat instance Person
        Person person = new Person(personName, personAge);

        // Mencetak informasi Person
        System.out.println("\nInformasi Person:");
        System.out.println("Nama: " + person.getName());
        System.out.println("Usia: " + person.getAge());

        // Mengambil input untuk Employee
        System.out.println("\nMasukkan nama untuk Employee:");
        String employeeName = scanner.nextLine();

        System.out.println("Masukkan usia untuk Employee:");
        int employeeAge = scanner.nextInt();
        scanner.nextLine(); // Membersihkan sisa input

        System.out.println("Masukkan ID karyawan untuk Employee:");
        String employeeId = scanner.nextLine();

        System.out.println("Masukkan departemen untuk Employee:");
        String department = scanner.nextLine();

        // Membuat instance Employee
        Employee employee = new Employee(employeeName, employeeAge, employeeId, department);

        // Mencetak informasi Employee
        System.out.println("\nInformasi Employee:");
        System.out.println("Nama: " + employee.getName());
        System.out.println("Usia: " + employee.getAge());
        System.out.println("ID Karyawan: " + employee.getEmployeeId());
        System.out.println("Departemen: " + employee.getDepartment());

        // Menutup scanner
        scanner.close();
    }
}
