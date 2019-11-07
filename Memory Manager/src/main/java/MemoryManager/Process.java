package MemoryManager;

import java.util.ArrayList;

/*
* @author Jefferson Lezcano
*/
public class Process
{
    public ArrayList<Integer> Procesess = new ArrayList();
    
    private int _id;
    private String _name;
    
    public Process(String name)
    {
        _name = name;
    }
    
    private void SetId(){
        _id = Procesess.get(Procesess.size() - 1) + 1;
        Procesess.add(_id);
    }
    
    public int Id(){ return _id; }
    public String Name() { return _name; }
}
