package ch.gibb.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        Queue<String> wartende = new LinkedList<>();
        wartende.offer( "Eva" );
        wartende.offer( "Max" );
        wartende.offer( "Tim" );
        wartende.offer( "Susi" );
        wartende.offer( "Ida" );
        System.out.println(wartende);
        wartende.poll();
        System.out.println(wartende);
        System.out.println(wartende.peek());
        System.out.println(wartende);
    }
}
