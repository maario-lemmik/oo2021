public enum Gender {
    BOY, GIRL;

  @Override
  public String toString() {
    switch(this) {
      case BOY: return "boy";
      case GIRL: return "girl";
      default: throw new IllegalArgumentException();
    }
}

}
