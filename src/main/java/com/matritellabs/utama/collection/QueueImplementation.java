package com.matritellabs.utama.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class QueueImplementation implements Queue {

    private int queueCapacity = 5;
    private List<Object> myQueue = new ArrayList<>(queueCapacity);

    public int getQueueCapacity() {
        return queueCapacity;
    }


    public boolean add(Object e) {
        if(myQueue.size() < queueCapacity) {
            myQueue.add(e);
            return true;
        } else {
            throw new IllegalStateException();
        }

    }

    public Object element() {
        if (myQueue.size() > 0) {
            return myQueue.get(0);
        } else {
            throw new NoSuchElementException();
        }
    }

    public boolean offer(Object e) {
        if(myQueue.size() < queueCapacity) {
            myQueue.add(e);
            return true;
        } else {
            return false;
        }
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
