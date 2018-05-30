package com.matritellabs.utama.collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class QueueImplementation implements Queue {

    List<Object> myQueue = new ArrayList<>();
    final int capacity = 50;
    private static Logger logger = LoggerFactory.getLogger(QueueImplementation.class);


    public boolean add(Object e) {
//        if (myQueue.size() == capacity) {
//            System.out.println("no more capacity");
//            throw new IllegalStateException();
//         } else {
//            myQueue.add(e);
//            return true;
//        }
        try {
//            if (myQueue.size() > capacity) {
                myQueue.add(e);
//            }
                return true;
        } catch (IllegalStateException iex) {
            return false;
        }
    }

    public Object element() {
        if (myQueue.size() > 0) {
            logger.info("Current head object is " + myQueue.get(0).toString());
            return myQueue.get(0);
        } else {
            logger.error("The queue is empty");
            throw new NoSuchElementException();
        }
    }

    public boolean offer(Object e) {
        if (myQueue.size() == capacity) {
            logger.error("no more capacity");
            return false;
        } else {
            logger.info("Object " + e.toString() + " added to the Queue");
            myQueue.add(e);
            return true;
        }
    }

    public Object peek() {
        if (myQueue.size() > 0) {
            logger.info("Current head object is " + myQueue.get(0).toString());
            return myQueue.get(0);
        } else {
            logger.error("The queue is empty");
            return null;
        }
    }

    public Object poll() {
        if (myQueue.size() > 0) {
            Object retrievedObject = myQueue.get(0);
            myQueue.remove(0);
            logger.info(retrievedObject.toString() + " removed from the queue");
            return retrievedObject;
        } else {
            logger.error("The queue is empty");
            return null;
        }
    }

    public Object remove() {
        if (myQueue.size() > 0) {
            Object retrievedObject = myQueue.get(0);
            myQueue.remove(0);
            logger.info(retrievedObject.toString() + " removed from the queue");
            return retrievedObject;
        } else {
            logger.error("The queue is empty");
            throw new NoSuchElementException();
        }
    }
}
