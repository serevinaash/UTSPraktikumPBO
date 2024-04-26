!![image](https://github.com/serevinaash/UTSPraktikumPBO/assets/101394654/46dc2d39-85b2-48ca-97bb-e9598bf93b70)
1. Encapsulation
Program Java ini mendemonstrasikan konsep enkapsulasi dengan tiga kelas: `Person`, `Employee`, dan `Main`.

- **Person**: Kelas ini mewakili individu dengan data pribadi seperti nama dan usia. Variabel `name` dan `age` bersifat privat dan diakses melalui metode publik `getName()`, `setName()`, `getAge()`, dan `setAge()`. Konstruktor digunakan untuk menginisialisasi objek `Person`.

- **Employee**: Kelas ini mewarisi dari `Person` dan menambahkan data spesifik karyawan seperti `employeeId` dan `department`. Metode publik `getEmployeeId()`, `setEmployeeId()`, `getDepartment()`, dan `setDepartment()` digunakan untuk mengakses dan mengubah data karyawan.

- **Main**: Kelas ini berisi metode `main` untuk menerima input dari pengguna melalui konsol. Program meminta pengguna memasukkan informasi untuk membuat objek `Person` dan `Employee`. Setelah menerima input, program mencetak informasi `Person` dan `Employee`.

Program ini menunjukkan bagaimana enkapsulasi digunakan untuk menyembunyikan detail implementasi data dalam kelas dan menyediakan antarmuka publik untuk akses data.

![image](https://github.com/serevinaash/UTSPraktikumPBO/assets/101394654/623301b7-0af7-4909-ae60-d59a15425d8f)
2. Inheritance
Kelas Animal:
Kelas dasar (superclass) yang mendefinisikan perilaku umum hewan.
Metode speak() menunjukkan bagaimana hewan berbicara secara umum.
Kelas Dog:
Kelas Dog mewarisi dari Animal (subclass), artinya kelas ini mendapatkan sifat dan metode dari kelas Animal.
Metode speak() di-override untuk menunjukkan suara yang khas dari anjing.
Metode wagTail() menambahkan perilaku khusus untuk Dog (anjing).
Kelas Cat:
Kelas Cat juga mewarisi dari Animal.
Metode speak() di-override untuk menunjukkan suara yang khas dari kucing.
Metode purr() menambahkan perilaku khusus untuk Cat (kucing).
Kelas inheritance:
Kelas ini digunakan untuk mendemonstrasikan pewarisan dengan membuat instance Dog dan Cat.
Program memanggil metode speak() dan metode khusus (wagTail() dan purr()) dari instance Dog dan Cat.
Program ini menunjukkan bagaimana kelas Dog dan Cat mewarisi perilaku umum dari kelas Animal dan menambahkan perilaku spesifik mereka sendiri.

![image](https://github.com/serevinaash/UTSPraktikumPBO/assets/101394654/73226a9e-5f92-4d85-a005-f701849cccdd)
3 . Polimorphism
Kelas Shape:
Kelas dasar (superclass) yang mendefinisikan metode draw() untuk menggambar bentuk secara umum.
Kelas Circle:
Kelas ini mewarisi dari Shape (subclass) dan meng-override metode draw() untuk menggambar lingkaran.
Kelas Rectangle:
Kelas ini juga mewarisi dari Shape dan meng-override metode draw() untuk menggambar persegi panjang.
Kelas Polimorphism:
Membuat array dari Shape yang berisi instance Shape, Circle, dan Rectangle.
Program mengiterasi array tersebut dan memanggil metode draw() pada setiap objek dalam array.
Meskipun metode draw() memiliki nama yang sama di setiap kelas, hasil yang dihasilkan berbeda berdasarkan objek yang sedang dipanggil karena metode tersebut di-override di setiap kelas turunan.
Program ini menunjukkan bagaimana polimorfisme bekerja dengan memanggil metode draw() pada objek yang berbeda dari kelas Shape, Circle, dan Rectangle, dan mendapatkan hasil yang berbeda tergantung pada kelas objek tersebut

![image](https://github.com/serevinaash/UTSPraktikumPBO/assets/101394654/579093b5-23cb-4b72-9966-1fc903f5760b)
4. Interface
Berikut adalah penjelasan program:

Antarmuka Vehicle:
Antarmuka ini mendefinisikan metode start() dan stop(), yang harus diimplementasikan oleh kelas-kelas yang menggunakannya.
Kelas Car:
Kelas ini mengimplementasikan antarmuka Vehicle dan menyediakan implementasi metode start() dan stop() untuk mobil.
Kelas Bike:
Kelas ini juga mengimplementasikan antarmuka Vehicle dan menyediakan implementasi metode start() dan stop() untuk sepeda motor.
Kelas Interface:
Membuat array dari Vehicle yang berisi instance Car dan Bike.
Program mengiterasi array tersebut dan memanggil metode start() dan stop() pada setiap objek dalam array.
Meskipun metode start() dan stop() memiliki nama yang sama, hasil yang berbeda akan diperoleh berdasarkan objek yang sedang dipanggil.
Program ini menunjukkan bagaimana antarmuka (interface) digunakan untuk mendefinisikan perilaku umum (start() dan stop()) dalam konteks kendaraan, dan bagaimana kelas-kelas (Car dan Bike) mengimplementasikan antarmuka tersebut dengan cara mereka sendiri.



