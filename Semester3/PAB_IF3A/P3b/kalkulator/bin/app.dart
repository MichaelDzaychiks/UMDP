
import 'dart:io';
import 'kalkulator.dart';

void main() {
  print("KALKULATOR NIEL NEGRO");
  print("Pilih operasi matematika: ");
  print("1. Tambah (+)");
  print("2. Kurang (-)");
  print("3. Kali (*)");
  print("4. Bagi (/)");
  
  stdout.write("Masukkan nomor pilihan (1-4): ");
  String? pilihan = stdin.readLineSync();

  if (pilihan != '1' && pilihan != '2' && pilihan != '3' && pilihan != '4') {
    print("Pilihan tidak valid! Program keluar.");
    return;
  }

  stdout.write("Masukkan angka pertama: ");
  double? number1 = double.tryParse(stdin.readLineSync() ?? '');

  stdout.write("Masukkan angka kedua: ");
  double? number2 = double.tryParse(stdin.readLineSync() ?? '');

  stdout.write("Masukkan angka pertama: ");
  double? number1 = double.tryParse(stdin.readLineSync() ?? '');

  // Meminta input angka kedua
  stdout.write("Masukkan angka kedua: ");
  double? number2 = double.tryParse(stdin.readLineSync() ?? '');

  // Validasi apakah input berupa angka valid
  if (number1 == null || number2 == null) {
    print("Input harus berupa angka yang valid!");
    return;
  }

  double hasil = 0;

  // Melakukan perhitungan berdasarkan nomor pilihan
  switch (pilihan) {
    case '1':
      hasil = add(number1, number2);
      print("\nHasil: $number1 + $number2 = $hasil");
      break;
    case '2':
      hasil = subtract(number1, number2);
      print("\nHasil: $number1 - $number2 = $hasil");
      break;
    case '3':
      hasil = multiply(number1, number2);
      print("\nHasil: $number1 * $number2 = $hasil");
      break;
    case '4':
      hasil = divide(number1, number2);
      if (!hasil.isNaN) {
        print("\nHasil: $number1 / $number2 = $hasil");
      }
      break;
  }
}
