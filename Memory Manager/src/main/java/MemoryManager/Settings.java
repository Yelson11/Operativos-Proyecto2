package MemoryManager;

/*
* @author Israel Herrera
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
    
    public Settings(){ }
}
