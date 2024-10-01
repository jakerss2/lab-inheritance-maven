package edu.grinnell.csc207.util;

/**
 * Basic Counter.
 * 
 * @author Jake Bell
 * @author Drew Fargo
 */
public class BasicCounter implements Counter {
  /** Value counter should reset to. */
  protected int start;
  /** Current value of the counter. */
  protected int count;

  /**
   * Initialize with count startCount.
   * 
   * @param startCount The initial value and reset value.
   */
  public BasicCounter(int startCount) {
      this.start = startCount;
      this.count = startCount;
      //System.err.printf("BasicCounter(%d)\n", startCount);
  } // BasicCounter(int)

  /**
   * Increments the counter by one.
   */
  public void increment() {
      this.count++;
  } // increment()

  /**
   * Resets the counter to the starting value.
   */
  public void reset() {
      this.count = this.start;
  } // reset()

  /**
   * Represents this counter as a string:
   * puts the current count value in brackets.
   */
  public String toString() {
      return "[" + this.count + "]";
  } // toString()

  /**
   * Accessor for the counter's value.
   * @return The counter's current value.
   */
  public int get() {
      return this.count;
  } // get()
} // class BasicCounter
