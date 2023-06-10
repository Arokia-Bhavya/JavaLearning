import java.util.Iterator;

public class DataStructure {
    Integer[] arrayOfInts;
    DataStructure(int size)
    {
        this.arrayOfInts=new Integer[size];
        int count=0;
        for (int index=0;index<arrayOfInts.length;index++)
        {
            arrayOfInts[index]=count++;
        }
    }
    public void printEven()
    {
       Iterator evenIterator=this.new EvenIterator();
       while(evenIterator.hasNext())
           System.out.println(evenIterator.next());
    }
    public static void main(String[] args)
    {
        DataStructure dataStructure=new DataStructure(15);
        dataStructure.printEven();
    }

    class EvenIterator<Integer> implements DataStructureIterator<Integer>
    {
        int cursor=0;

        @Override
        public boolean hasNext() {
            return cursor<=arrayOfInts.length -1;
        }

        @Override
        public Integer next() {
            Integer value= (Integer) arrayOfInts[cursor];
            cursor=cursor+2;
            return value;
        }
    }
}
