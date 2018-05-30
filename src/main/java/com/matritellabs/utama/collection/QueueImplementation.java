package com.matritellabs.utama.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class QueueImplementation implements Queue {

    List<Object> myQueue = new ArrayList<>();

    public boolean add(Object e) {
        myQueue.add(e);
        return true;
    }

    public Object element() {
        if (myQueue.size() > 0) {
            return myQueue.get(0);
        } else {
            throw new NoSuchElementException();
        }
    }

    public boolean offer(Object e) {
        myQueue.add(e);
        return true;
    }

    public Object peek() {
        if (myQueue.size() > 0) {
            return myQueue.get(0);
        } else {
            return null;
        }
    }

    public Object poll() {
        if (myQueue.size() > 0) {
            Object retrievedObject = myQueue.get(0);
            myQueue.remove(0);
            return retrievedObject;
        } else {
            return null;
        }
    }

    public Object remove() {
        if (myQueue.size() > 0) {
            Object retrievedObject = myQueue.get(0);
            myQueue.remove(0);
            return retrievedObject;
        } else {
            throw new NoSuchElementException();
        }
    }
}