public final class Cat {
  private final String name;
  private final int age;

  public Cat(String name, int age) {
      this.name = name;
      this.age = age;
  }
  public void sayHi() {
      System.out.printf("Кота звать %s и ему %d лет", this.name, this.age);
  }

}