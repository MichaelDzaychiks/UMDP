class Kalkulator {
  double number1;
  double number2;

  Kalkulator(this.number1,this.number2);

  double add() => number1 + number2;

  double subtract() => number1 - number2;

  double multiply() => number1 * number2;

  double divide(){
    if(number2 == 0){
      throw Exception('tidak dapat membagi nilai dengan nol');
    }
    return number1/number2;
  }
}