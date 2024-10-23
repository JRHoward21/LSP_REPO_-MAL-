package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a set of integers with various operations such as 
 * adding, removing, and performing set operations like union, intersection, 
 * difference, and complement.
 */
public class IntegerSet {
    // Store the set elements in an ArrayList.
    private List<Integer> set = new ArrayList<Integer>();

    /** 
     * Default Constructor that initializes an empty IntegerSet.
     */
    public IntegerSet() {
    }

    /**
     * Constructor that initializes the IntegerSet with a given set of integers.
     *
     * @param set an ArrayList of integers to initialize the IntegerSet.
     */
    public IntegerSet(ArrayList<Integer> set) {
        this.set = set;
    }

    /**
     * Clears the internal representation of the set.
     */
    public void clear() {
        set.clear();
    }

    /**
     * Returns the number of elements in the set.
     *
     * @return the length of the set.
     */
    public int length() {
        return set.size();
    }

    /**
     * Compares this set to another object for equality.
     *
     * @param o the object to compare.
     * @return true if the sets are equal, false otherwise.
     */
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IntegerSet)) return false;
        IntegerSet other = (IntegerSet) o;
        return set.containsAll(other.set) && other.set.containsAll(set);
    }

    /**
     * Checks if the set contains a specified value.
     *
     * @param value the integer value to check for.
     * @return true if the set contains the value, false otherwise.
     */
    public boolean contains(int value) {
        return set.contains(value);
    }

    /**
     * Returns the largest item in the set.
     *
     * @return the largest integer in the set.
     * @throws IllegalStateException if the set is empty.
     */
    public int largest() {
        if (set.isEmpty()) throw new IllegalStateException("Set is empty");
        return set.stream().max(Integer::compareTo).get();
    }

    /**
     * Returns the smallest item in the set.
     *
     * @return the smallest integer in the set.
     * @throws IllegalStateException if the set is empty.
     */
    public int smallest() {
        if (set.isEmpty()) throw new IllegalStateException("Set is empty");
        return set.stream().min(Integer::compareTo).get();
    }

    /**
     * Adds an item to the set. If the item already exists, no action is taken.
     *
     * @param item the integer item to add to the set.
     */
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }

    /**
     * Removes an item from the set. If the item is not present, no action is taken.
     *
     * @param item the integer item to remove from the set.
     */
    public void remove(int item) {
        set.remove(Integer.valueOf(item));
    }

    /**
     * Performs the union of this set with another set.
     *
     * @param intSetb the other IntegerSet to perform union with.
     */
    public void union(IntegerSet intSetb) {
        for (Integer item : intSetb.set) {
            this.add(item);
        }
    }

    /**
     * Performs the intersection of this set with another set.
     *
     * @param intSetb the other IntegerSet to perform intersection with.
     */
    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }

    /**
     * Performs the difference between this set and another set.
     *
     * @param intSetb the other IntegerSet to perform difference with.
     */
    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }

    /**
     * Computes the complement of this set with respect to another set.
     *
     * @param intSetb the other IntegerSet to compute the complement against.
     */
    public void complement(IntegerSet intSetb) {
        List<Integer> complementSet = new ArrayList<>();
        for (int i = Integer.MIN_VALUE; i <= Integer.MAX_VALUE; i++) {
            if (!this.contains(i) && !intSetb.contains(i)) {
                complementSet.add(i);
            }
        }
        this.set = complementSet;
    }

    /**
     * Checks if the set is empty.
     *
     * @return true if the set is empty, false otherwise.
     */
    public boolean isEmpty() {
        return set.isEmpty();
    }

    /**
     * Returns a String representation of the set.
     *
     * @return a String containing the elements of the set.
     */
    public String toString() {
        return set.toString();
    }
}
