package com.matritellabs.utama.collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class QueueImplementation implements Queue {

    private int queueCapacity = 5;
    private List<Object> myQueue = new ArrayList<>(queueCapacity);
    private static Logger logger = LoggerFactory.getLogger(QueueImplementation.class);

    public int getQueueCapacity() {
        return queueCapacity;
    }


    public boolean add(Object e) {
        if(myQueue.size() < queueCapacity) {
            myQueue.add(e);
            logger.info(e.toString() + " added to the Queue");
            return true;
        } else {
            logger.error("no more capacity");
            throw new IllegalStateException();
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
        if(myQueue.size() < queueCapacity) {
            myQueue.add(e);
            logger.info(e.toString() + " added to the Queue");
            return true;
        } else {
            logger.error("no more capacity");
            return false;
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
            logger.info(retrievedObject.toString() + " removed from the head");
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
            logger.info(retrievedObject.toString() + " removed from the head");
            return retrievedObject;
        } else {
            logger.error("The queue is empty");
            throw new NoSuchElementException();
        }
    }
}
