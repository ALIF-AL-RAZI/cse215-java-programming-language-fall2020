
package javaapplication13;

class EitaIntegerNoiException extends Exception {
  public EitaIntegerNoiException() {

  }

  public EitaIntegerNoiException(String s) {
    super(s);
  }
}

class str {
  String num;

  public str(String num) {
    this.num = num;
  }

  int readInteger() throws EitaIntegerNoiException {
    if (Float.parseFloat(num) % 1 != 0) {
      throw new EitaIntegerNoiException("You entered floating value: " + num);
    } else {
      return Integer.parseInt(num);
    }
  }
}

public class ExceptionError {
  public static void main(String[] args) {
    str n = new str("53.9");

    try {
      n.readInteger();
    } catch (EitaIntegerNoiException e) {
      System.out.println(e);
    }

  }
}