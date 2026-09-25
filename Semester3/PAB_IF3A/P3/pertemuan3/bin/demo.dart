import 'persegipanjang.dart';
import 'dart:io';

void main(){
 stdout.write('Masukkan Panjang: ');
 var panjang = double.parse(stdin.readLineSync()!);

 stdout.write('Masukkan Lebar: ');
 var lebar = double.parse(stdin.readLineSync()!);

 var persegipanjang1 = PersegiPanjang(panjang, lebar);
  print("Luas: + ${persegipanjang1.hitungLuas()}");
  print("Keliling:  + ${persegipanjang1.hitungKeliling()}");
}
