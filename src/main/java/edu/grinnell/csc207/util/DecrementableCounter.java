package edu.grinnell.csc207.util;

/**
 * Counters that you can decrement.
 * 
 * @author Jake Bell
 * @author Drew Fargo
 */
public class DecrementableCounter extends BasicCounter {
  /**
   * Create a new decrementable counter.
   *
   * @param start
   *   The initial value of the counter.
   */
  public DecrementableCounter(int start) {
    super(start);
  } // DecrementableCounter(int)

  /**
   * Decrement one from the counter's value.
   */
  public void decrement() {
      super.count--;
  } // decrement()
} // class DecrementableCounter
