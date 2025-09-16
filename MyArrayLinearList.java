import java.util.Scanner;
public class MyArrayLinearList {
    int[] F;
    int size;
    MyArrayLinearList(int capacity){
        F=new int[capacity];
        size=0;
    }
    int max(){
        int max=F[0];
        for(int i=1;i<size;i++){
            if(F[i]>max) max=F[i];
        }
        return max;
    }
    int min(){
        int min=F[0];
        for(int i=1;i<size;i++){
            if(F[i]<min) min=F[i];
        }
        return min;
    }
    int sum(){
        int sum=0;
        for(int i=0;i<size;i++){
            sum+=F[i];
        }
        return sum;
    }
    double average(){
        return (double)sum()/size;
    }
    void removeOdd(){
        int newSize=0;
        for(int i=0; i<size; i++){
            if(F[i]%2==0){
                F[newSize]=F[i];
                newSize++;
            }
        }
        size=newSize;
    }
    void sort(){
       for(int i=0; i<size-1; i++){
           for(int j=0; j<size-1-i; j++){
               if(F[j]>F[j+1]) {
                   int temp = F[j];
                   F[j] = F[j + 1];
                   F[j + 1] = temp;
               }
           }
       }
    }
    void printList(){
        for(int i=0;i<size;i++){
            System.out.print(F[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Хэдэн тоо оруулах вэ? : ");
        int n=sc.nextInt();
        MyArrayLinearList list=new MyArrayLinearList(n);
        System.out.println(n+" тоогоо оруулна уу:");
        for(int i=0;i<n;i++){
            list.F[i]=sc.nextInt();
        }
        list.size=n;
        System.out.println("\nАнхны жагсаалт:");
        list.printList();
        list.sort();
        System.out.println("Эрэмбэлсний дараа:");
        list.printList();
        System.out.println("Max = "+list.max());
        System.out.println("Min = "+list.min());
        System.out.println("Sum = "+list.sum());
        System.out.println("Average = "+list.average());
        list.removeOdd();
        System.out.println("\nСондгойг устгасны дараа:");
        list.printList();
    }
}
