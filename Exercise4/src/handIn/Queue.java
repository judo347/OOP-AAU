package handIn;

public class Queue<T> {

    private T[] array;
    private int current; //The spot of the oldest element
    private int next; //The next available spot

    public Queue() {
        this.array = (T[]) new Object[1];
        this.current = 0;
        this.next = 0;
    }

    /** Adds an element t to the back of the queue */
    public void enqueue(T t){
        if(next > this.array.length-1)
            doubleArrayLength();
        this.array[next++] = t;
    }

    /** Removes and returns the first element in the queue.
     *  Throws exception of the queue is empty */
    public T dequeue(){
        if(this.array[current] == null) //Empty array check
            throw new EmptyQueueException();
        return this.array[current++];
    }

    //TODO: TEST EMPTY ARRAY
    public T drain(int n){

        int lastToBeRemoved = current + n;
        T container;
        int i = this.current;

        if(lastToBeRemoved >= next){ //There is less than n object in the queue

            for(; i < next-1; i++){
                this.array[i] = null;
            }

            container = this.array[i];
            this.array[i] = null;
            current = i + 1;
        }else{
            for(; i < lastToBeRemoved-1; i++){
                this.array[i] = null;
            }

            container = this.array[i];
            this.array[i] = null;
            current = i + 1;
        }


        return container; //Last removed element
    }


    /** This method double the length of the array. */
    private void doubleArrayLength(){
        //Create new array with double length of the old one.
        T[] newArray = (T[]) new Object[this.array.length*2];

        //Copy the old data into the new one.
        for(int i = 0; i < this.array.length; i++)
            newArray[i] = this.array[i];

        //Overwriting old array with new one
        this.array = newArray;
    }

    /** This method is created for use in testing.
     *  The function returns a value of a given index.
     *  @param index the value of the index you want to get returned.
     *  @return the value of the requested index */
    public T getElement(int index){
         return array[index];
    }

    /** This method is created for use in testing
     *  TODO: Add more ex */
    public T peak(){
        return this.array[current];
    }


}
