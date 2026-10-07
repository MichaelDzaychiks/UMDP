import 'dart:io';
import 'kalkulator.dart';

void main() {
  while (true) {
    final number1 = readNumber('Masukkan bilangan pertama: ');
    final number2 = readNumber('Masukkan bilangan kedua: ');

    final kalkulator = Kalkulator(number1, number2);

    showMenu();

    final pilihan = readChoice();

    calculate(kalkulator, pilihan);

    if (!readAgain()) {
      print('Program selesai. Terima kasih!');
      break;
    }
  }
}

double readNumber(String message) {
  while (true) {
    stdout.write(message);

    final input = stdin.readLineSync();

    final number = double.tryParse(input ?? '');

    if (number != null) {
      return number;
    }

    print('Input harus berupa angka!');
  }
}

void showMenu() {
  print('\nPilih operasi:');
  print('[1] Tambah');
  print('[2] Kurang');
  print('[3] Kali');
  print('[4] Bagi');
}

int readChoice() {
  while (true) {
    stdout.write('Masukkan pilihan (1-4): ');

    final input = stdin.readLineSync();

    final choice = int.tryParse(input ?? '');

    if (choice != null && choice >= 1 && choice <= 4) {
      return choice;
    }

    print('Pilihan harus berupa angka 1-4.');
  }
}

void calculate(Kalkulator kalkulator, int choice) {
  try {
    final result = switch (choice) {
      1 => kalkulator.add(),
      2 => kalkulator.subtract(),
      3 => kalkulator.multiply(),
      4 => kalkulator.divide(),
      _ => throw StateError('Pilihan tidak valid.'),
    };

    print('\nHasil: $result');
  } catch (e) {
    print('\nError: $e');
  }
}

bool readAgain() {
  stdout.write('\nApakah ingin melakukan perhitungan lagi? (Y/T): ');

  final input = stdin.readLineSync()?.trim().toUpperCase();

  return input == 'Y';
}
