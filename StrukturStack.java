/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author syrly
 */
public class StrukturStack {
    
    private int[] array;
    private int capacity;
    private int TOP;
    
    public final int MIN = -1;

    

    public void push(int data) {
        if (isFull()) {
                System.out.println("Stack penuh");
            } else {  
            TOP++;
            array[TOP] = data;
        }
    }

    public boolean isEmpty() {
        return (TOP == MIN);
    }

    public boolean isFull() {
        return (TOP == capacity - 1);
    }

    public int size() {
        return TOP + 1;
    }

    public int TOP() {
        if (isEmpty()) {
           return MIN;
        }
        return array[TOP];
    }
    
    public StrukturStack(int capacity) {
        super();
        array = new int[capacity];
        this.capacity = capacity;
        TOP = MIN; // Menginisialisasi TOP dengan nilai MIN
    }
    
    public void displayElements() {
        System.out.println("Elemen from TOP: ");
        if (isEmpty()) {
          System.out.println("Stack Kosong:  : ");
        } else {
            for (int i = TOP; i >= 0; i--){
                System.out.print(array[i] + "");
            }
            System.out.println();
        }
    }
}
