package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class DelegationSortedIntList implements IntegerList {

    private final SortedIntList delegate = new SortedIntList();
    private int totalAdded = 0;

 
    public void add(int value) 
    {
        totalAdded++;
        delegate.add(value);
    }

    public void addAll(IntegerList other) 
    {
        for (int i = 0; i < other.size(); i++) 
        {
            add(other.get(i));
        }
    }

    public int get(int index) 
    {
        return delegate.get(index);
    }

    public int size() 
    {
        return delegate.size();
    }

    public void remove(int index) 
    {
        delegate.remove(index);
    }

    public String toString() 
    {
        return delegate.toString();
    }

    public int getTotalAdded() 
    {
        return totalAdded;
    }
}
