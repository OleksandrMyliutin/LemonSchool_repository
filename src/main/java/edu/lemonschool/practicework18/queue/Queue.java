package edu.lemonschool.practicework18.queue;

import java.util.Objects;

public interface Queue<E> {

    /**
     * @param value adds the element to the end of the queue
     */
    void push(E value);

    /**
     * @return pulls an element from the beginning of the queue
     */
    E pop();

    /**
     * @return determine if the queue is empty in boolean type
     */
    E peak();

   Object[] toArray();

}
