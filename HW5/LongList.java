public class LongList implements MyList{
    private long _data;
    private LongList next;

    public LongList(LongList n, long data){
        _data = data;
        next = n;
    }

    public long getData(){
        return _data;
    }

    public LongList next(){
        return next;
    }

    public void printNode(){
        System.out.println("LongList Node, data is: " + _data);
    }
}
