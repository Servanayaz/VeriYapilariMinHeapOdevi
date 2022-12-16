// 02180201003 Şervan Ayaz
package heap;

import java.util.Arrays;
import java.util.Scanner;


public class Heap {
private static int n;

private int left(int i)
{
return (3* i) + 1;
}
private int middle(int i)
{
return (3 * i) + 2;
}
private int right(int i)
{
return (3 * i) + 3;
}


public void sort(int [] array)
{
n = array.length-1;

heapify(array); 
}

private void heapify(int [] array)
{
for(int i = n; i >= 0; i--) heap(array,i); 
}

private void heap(int [] array, int i)
{
int left = left(i);
int right= right(i);
int middle=middle(i);
int smallest = i; 

if((left <= n) && (array[left] < array[smallest]) ) 
smallest = left;

if((middle<=n)&&(array[middle] < array[smallest]))
    smallest=middle;

if((right <= n) && (array[right] < array[smallest]) ) 
smallest = right; 

if(largest != i) 
{

int temp = array[i];
array[i] = array[smallest];
array[smallest] = temp;

heap(array,smallest);
}
}

public void print(int [] array)
{
for (int i = 0; i < array.length; i++) System.out.print(array[i] + " ");
}

public static void main(String[] args)
{
Heap h = new Heap();

Scanner s = new Scanner(System.in);
    System.out.println("Kaç eleman girmek istiyorsunuz?");
    int n=s.nextInt();
    int array[]=new int[n];
    int copyarray[] = new int[array.length];
    
    System.out.println("Lütfen sayıları giriniz.");
    for(int i=0; i<n;i++){
        array[i]=s.nextInt();
    }
    for (int i = 0; i < array.length; i++){
        copyarray[i] = array[i];
        
        }
   
    System.out.println("Girilen Dizi");
    h.print(array);
    h.sort(array);
    boolean minheapkontrol=Arrays.equals(copyarray, array);

    if(minheapkontrol == true ){
        System.out.println("\nEvet Min heaptir");
    }
    else{
        System.out.println("\nDeğildir");
        System.out.println("\nMin Heap hali: ");
        h.print(array);
    }
}
}

