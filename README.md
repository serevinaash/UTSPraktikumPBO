1. Encapsulation
   !![image](https://github.com/serevinaash/UTSPraktikumPBO/assets/101394654/46dc2d39-85b2-48ca-97bb-e9598bf93b70)
Program Java ini mendemonstrasikan konsep enkapsulasi dengan tiga kelas: `Person`, `Employee`, dan `Main`.

- **Person**: Kelas ini mewakili individu dengan data pribadi seperti nama dan usia. Variabel `name` dan `age` bersifat privat dan diakses melalui metode publik `getName()`, `setName()`, `getAge()`, dan `setAge()`. Konstruktor digunakan untuk menginisialisasi objek `Person`.

- **Employee**: Kelas ini mewarisi dari `Person` dan menambahkan data spesifik karyawan seperti `employeeId` dan `department`. Metode publik `getEmployeeId()`, `setEmployeeId()`, `getDepartment()`, dan `setDepartment()` digunakan untuk mengakses dan mengubah data karyawan.

- **Main**: Kelas ini berisi metode `main` untuk menerima input dari pengguna melalui konsol. Program meminta pengguna memasukkan informasi untuk membuat objek `Person` dan `Employee`. Setelah menerima input, program mencetak informasi `Person` dan `Employee`.

Program ini menunjukkan bagaimana enkapsulasi digunakan untuk menyembunyikan detail implementasi data dalam kelas dan menyediakan antarmuka publik untuk akses data.

