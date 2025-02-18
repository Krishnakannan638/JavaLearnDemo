import java.util.Arrays;

class arrays {
    private int InitialCapacity = 4;
    private int[] arr;
    private int size;
    private int capacity;

    arrays() {
        size = 0;
        arr = new int[InitialCapacity];
        capacity = InitialCapacity;
    }

    private void expandArray() {
        capacity *= 2;
        arr = Arrays.copyOf(arr, capacity);
    }

    private void shrinkArray() {
        capacity /= 2;
        arr = Arrays.copyOf(arr, capacity);
    }

    public void insertAtEnd(int val) {
        if (size == capacity) {
            expandArray();
        }
        arr[size++] = val;
    }

    public void displayArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void insertAtPos(int pos, int val) {
        if (size == capacity) {
            expandArray();
        }
        for (int i = size - 1; i >= pos; i--) {
            arr[i + 1] = arr[i];
            if (i == pos) {
                arr[i] = val;
            }
        }
        size++;
    }

    public void deleteAtPos(int pos) {
        for (int i = pos + 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }
        if (capacity > InitialCapacity && capacity > 3 * size) {
            shrinkArray();
        }
        size--;
    }

    public void deleteAtEnd() {
        if (0 < size) {
            size--;
        } else {
            System.out.println("Invaild Array List");
        }
    }

    public void insertAtBeginning(int val) {
        if (size == capacity) {
            expandArray();
        }
        for (int i = size - 1; i >= 0; i--) {
            arr[i + 1] = arr[i];
            if (i == 0) {
                arr[i] = val;
            }
        }
        size++;
    }

    public void getIndex(int index) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == index) {
                System.out.print(i);
                break;
            }
        }
    }

    public void updateIndex(int pos, int val) {
        for (int i = 0; i < arr.length; i++) {
            if (i == pos) {
                arr[i] = val;
                break;
            }
        }
    }

    public Boolean contains(int val) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                count++;
            }
        }
        if (count == 1) {
            return true;
        } else
            return false;
    }

    public void clear() {
        for (int i = size - 1; i >= 0; i--) {
            size--;
        }
    }
}