class Item {
    int value;
    int priority;

    // Constructor
    Item(int value, int priority) {
        this.value = value;
        this.priority = priority;
    }

    // Optional: Override toString() for easy printing
    @Override
    public String toString() {
        return "Item{value=" + value + ", priority=" + priority + '}';
    }
}

public class Main {
    public static void main(String[] args) {
        // Step 2: Create an array to hold 1000 Item objects
        Item[] array = new Item[2];
        



        // Step 3: Initialize and store Item objects in the array
        for (int i = 0; i < array.length; i++) {
            array[i] = new Item(i, i * 10); // Example initialization
        //     array[i] = new Item ();
        // array[i].priority=i*10;
        // array[i].value=i*5;
        }

        // Printing some items to demonstrate
        System.out.println(array[0]); // Should print: Item{value=0, priority=0}
        System.out.println(array[1]); // Should print: Item{value=999, priority=9990}
    }
}
