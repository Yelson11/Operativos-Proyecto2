package MemoryManager;

import java.util.ArrayList;

/*
* @author Jefferson Lezcano
*/
public class Process
{
    public ArrayList<Integer> Procesess = new ArrayList();
    
    private int _id;
    private int _priority;
    private int _frames;
    private int _size;
    private String _name;
    
    public Process(String name)
    {
        SetId();
        _name = name;
        _size = 0;
        _priority = 0;
        _frames = 0;
    }
    
    private void SetId(){
        _id = Procesess.get(Procesess.size() - 1) + 1;
        Procesess.add(_id);
    }
    
    public int Id() { return _id; }
    public int Frames() { return _frames; }
    public int Priority() { return _priority; }
    public int Size() { return _size; }
    public String Name() { return _name; }
    
    public void Frames(int frames) { _frames = frames; }
    public void Name(String name) { _name = name; }
    public void Priority(int priority) { _priority = priority; }
    public void Size(int size) { _size = size; }
}
