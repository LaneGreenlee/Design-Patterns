package iterator;

import java.util.Iterator;

/**
 * Iterator for iterating over tickets in a task list.
 * @auth Laneag
 */
public class TaskListIterator implements Iterator<Ticket> {
    private Ticket[] tickets;
    private int position = 0;

    /**
     * Constructs a new TaskListIterator with the given array of tickets.
     *
     * @param tickets the array of tickets to iterate over
     */
    public TaskListIterator(Ticket[] tickets) {
        this.tickets = tickets;
    }

    /**
     * Checks if there is a next ticket available.
     *
     * @return true if there is a next ticket, false otherwise
     */
    public boolean hasNext() {
        return position < tickets.length && tickets[position] != null;
    }

    /**
     * Retrieves the next ticket in the iteration.
     *
     * @return the next ticket
     */
    public Ticket next() {
        Ticket ticket = tickets[position];
        position++;
        return ticket;
    }
}

