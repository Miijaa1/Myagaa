import java.util.Scanner;
public class MyArrayLinearList {
    int[] arr;
    int size;
    MyArrayLinearList(int capacity) {
        arr = new int[capacity];
        size = 0;
    }
    void add(int val) {
        arr[size] = val;
        size++;
    }
    int max() {
        int max = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    int min() {
        int min = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    int sum() {
        int s = 0;
        for (int i = 0; i < size; i++) {
            s += arr[i];
        }
        return s;
    }
    double average() {
        return (double) sum() / size;
    }
    void removeOdd() {
        int newSize = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                arr[newSize] = arr[i];
                newSize++;
            }
        }
        size = newSize;
    }
    void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    void printList() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Хэдэн тоо оруулах вэ? : ");
        int n = sc.nextInt();
        MyArrayLinearList list = new MyArrayLinearList(n);
        System.out.println(n + " тоогоо оруулна уу:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            list.add(val);
        }
        System.out.println("\nАнхны жагсаалт:");
        list.printList();
        list.sort();
        System.out.println("Эрэмбэлсний дараа:");
        list.printList();
        System.out.println("Max = " + list.max());
        System.out.println("Min = " + list.min());
        System.out.println("Sum = " + list.sum());
        System.out.println("Average = " + list.average());
        list.removeOdd();
        System.out.println("\nСондгойг устгасны дараа:");
        list.printList();
    }
}
