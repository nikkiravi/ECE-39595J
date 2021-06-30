public class IntList implements MyList{
    private int _data;
    private IntList next;

    public IntList(IntList n, int data){
        _data = data;
        next = n;
    }

    public int getData(){
        return _data;
    }

    public IntList next(){
        return next;
    }

    public void printNode(){
        System.out.println("IntList Node, data is: " + _data);
    }

}
