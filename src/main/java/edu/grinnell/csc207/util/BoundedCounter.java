package edu.grinnell.csc207.util;

public class BoundedCounter extends BasicCounter {
  /** Bound the count */
  int bound;  

  public BoundedCounter(int startCount, int bound) {
    super(startCount);
    this.bound = bound;
  }

  public void increment() throws Exception {
    if (this.count + 1 > this.bound) {
      throw new Exception();
    }
  }
}
