import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    private T value;
    public Box(T value)
    {
        this.value=value;
    }

    @Override
    public String toString(){
        return String.format("%s: %s",this.value.getClass().toString(),this.value);
    }
    public List<Box<T>> swapElements(int firstIndex, int secondIndex,List<Box<T>> list)
    {
        Box<T> firstElement=list.get(firstIndex);
        list.set(firstIndex, list.get(secondIndex));
        list.set(secondIndex,firstElement);
        return list;
    }
    }

