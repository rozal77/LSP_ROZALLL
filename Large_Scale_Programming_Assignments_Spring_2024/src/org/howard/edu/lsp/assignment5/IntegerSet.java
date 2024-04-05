package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.List;

/**
 * Class IntegerSet represents a set of integers stored in an arrayList
 * It provides various operations such as adding elements,
 * removing elements, finding the largest and smallest elements,
 * performing set operations like union, intersection, and difference,
 * and more.
 */
public class IntegerSet {
  private List<Integer> elements;

  /**
   * Constructs an empty IntegerSet.
   */
  public IntegerSet() {
    this.elements = new ArrayList<Integer>();
  }

  /**
   * Clears all elements from the set.
   */
  public void clear() {
    elements.clear();
  }

  /**
   * Returns the number of elements in the set.
   *
   * @return the number of elements in the set
   */
  public int length() {
    return elements.size();
  }

  /**
   * Checks if the set contains a specific element.
   *
   * @param element the element to check
   * @return true if the set contains the element, otherwise false
   */
  public boolean contains(int element) {
    return elements.contains(element);
  }

  /**
   * Checks if the set is empty.
   *
   * @return true if the set is empty, otherwise false
   */
  public boolean isEmpty() {
    return elements.isEmpty();
  }

  /**
   * Returns the largest element in the set.
   *
   * @return the largest element in the set
   * @throws IntegerSetException if the set is empty
   */
  public int largest() throws IntegerSetException {
    if (isEmpty()) {
      throw new IntegerSetException("IntegerSet is empty");
    }
    int max = Integer.MIN_VALUE;
    for (int i : elements) {
      if (i > max) {
        max = i;
      }
    }
    return max;
  }

  /**
   * Returns the smallest element in the set.
   *
   * @return the smallest element in the set
   * @throws IntegerSetException if the set is empty
   */
  public int smallest() throws IntegerSetException {
    if (isEmpty()) {
      throw new IntegerSetException("IntegerSet is empty");
    }
    int min = Integer.MAX_VALUE;
    for (int i : elements) {
      if (i < min) {
        min = i;
      }
    }
    return min;
  }

  /**
   * Adds an element to the set if it's not already present.
   *
   * @param element the element to add
   */
  public void add(int element) {
    if (!contains(element)) {
      elements.add(element);
    }
  }

  /**
   * Removes an element from the set.
   *
   * @param element the element to remove
   */
  public void remove(int element) {
    elements.remove(Integer.valueOf(element));
  }

  /**
   * Checks if this set is equal to another set.
   * Two sets are equal if they contain all of the same values in ANY order.
   *
   * @param obj the object to compare with
   * @return true if the sets are equal, otherwise false
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null || getClass() != obj.getClass())
      return false;
    IntegerSet that = (IntegerSet) obj;
    return this.elements.containsAll(that.elements) && that.elements.containsAll(this.elements);
  }

  /**
   * Finds the union of this set with another set.
   *
   * @param otherSet the other set
   */
  public void union(IntegerSet otherSet) {
      for (int element : otherSet.elements) {
          if (!this.contains(element)) {
              this.add(element);
          }
      }
  }


  
  /**
   * Modifies the current set to contain the intersection with another set.
   *
   * @param otherSet the other set
   */
  public void intersect(IntegerSet otherSet) {
      List<Integer> intersection = new ArrayList<>();
      for (int element : this.elements) {
          if (otherSet.contains(element)) {
              intersection.add(element);
          }
      }
      this.elements = intersection;
  }

  /**
   * Modifies the current set to contain the difference with another set.
   *
   * @param otherSet the other set
   */
  public void diff(IntegerSet otherSet) {
      List<Integer> difference = new ArrayList<>();
      for (int element : this.elements) {
          if (!otherSet.contains(element)) {
              difference.add(element);
          }
      }
      this.elements = difference;
  }
  
  /**
   * Modifies the current set to contain the complement with another set.
   * Complement includes all elements not in the current set but present in the provided set.
   *
   * @param intSetb the other set
   */
  public void complement(IntegerSet intSetb) {
      List<Integer> complement = new ArrayList<>();
      for (int element : intSetb.elements) {
          if (!this.contains(element)) {
              complement.add(element);
          }
      }
      this.elements = complement;
  }

  /**
   * Returns a string representation of the set.
   *
   * @return a string representation of the set
   */
  @Override
  public String toString() {
    return elements.toString();
  }
}
