package Practical_23;

//23. Write a java program for producer and consumer problem using Threads.

class SharedResource {
    private int item;
    private boolean available = false;

    public synchronized void produce(int value) throws InterruptedException {
        while (available) {
            wait();
        }
        item = value;
        available = true;
        System.out.println("Produced: " + item);
        notifyAll();
    }

    public synchronized void consume() throws InterruptedException {
        while (!available) {
            wait();
        }
        System.out.println("Consumed: " + item);
        available = false;
        notifyAll();
    }
}

class Producer implements Runnable {
    SharedResource shared;

    public Producer(SharedResource shared) {
        this.shared = shared;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                shared.produce(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {
    SharedResource shared;

    public Consumer(SharedResource shared) {
        this.shared = shared;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                shared.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ProducerConsumerProblem {
    public static void main(String[] args) {
        SharedResource shared = new SharedResource();
        Producer producer = new Producer(shared);
        Consumer consumer = new Consumer(shared);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();
    }
}

