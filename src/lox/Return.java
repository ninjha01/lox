package lox;

class Return extends RuntimeException {
  final Object value;

  Return(Object value) {
    super(null, null, false, false); // Disable some JVM machinery we don't need
    this.value = value;
  }
}
