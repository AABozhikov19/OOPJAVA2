import java.util.ArrayList;
import java.util.List;

public class listOfBoxes<T> {
    private List<T> list;
    public ListOfBoxes()
    {
        this.list=new ArrayList<>();
    }
    public void add(T element)
    {
        this.list.add(element);
    }
    public int size()
    {
        return this.list.size();
    }
    public 
    public List<Box<T>> swapElements(int firstIndex, int secondIndex, List<Box<T>> list)
    {
        Box<T> firstElement=list.get(firstIndex);
        list.set(firstIndex, list.get(secondIndex));
        list.set(secondIndex,firstElement);
        return list;
    }
}
