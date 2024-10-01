package edu.grinnell.csc207.util;

public class DoubleCounter extends BasicCounter {
  /**
   * Initialize
   * @param start
   */
  public DoubleCounter(int start) {
    super(start);
  } // DoubleCounter(int)

  /**
   * Increment count twice
   */
  @Override
  public void increment() throws Exception { 
    super.increment();
    super.increment();
  } // increment()
} // class DoubleCounter 
