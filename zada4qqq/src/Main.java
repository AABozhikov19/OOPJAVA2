import java.util.*;
public class Main {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
List<Box<String>> myList=new ArrayList<>();
int n=Integer.parseInt(sc.nextLine());
for (int i=0; i<n; i++)
{
    String input=sc.nextLine();
    Box<String> box=new Box<>(input);
    myList.add(box);
//    System.out.println(box);
//    int inputInt=Integer.parseInt(sc.nextLine());
//    Box<Integer> box=new Box<>(inputInt);
//    System.out.println(box);
}
String[] indexes = sc.nextLine().split("\\s+");
int firstIndex=Integer.parseInt(sc.nextLine());
int secondIndex=Integer.parseInt(sc.nextLine());
    }
}