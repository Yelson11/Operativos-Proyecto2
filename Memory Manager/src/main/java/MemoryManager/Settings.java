package MemoryManager;

/*
* @author Jefferson Lezcano
*/
public class Settings
{
    public enum _replacement_policy
    {
        LRU,
        FIFO,
        LFU,
        MRU,
        SC
    }
    
    public _replacement_policy ReplacementPolicy;
    public boolean CleaningPolicy;
    public boolean FetchPolicy;
    public boolean LoadControl;
    public boolean PlacementPolicy;
    public boolean ReplacementScope;
    public boolean ResidentSetManagement;
    
    public int PhysicalMemorySize;
    public int PhysicalMemoryFrameSize;
    public int SystemBlockSize;
    public int VirtualMemorySize;
    public int VirtualMemoryPageSize;
    
    public Settings(){ }
}
