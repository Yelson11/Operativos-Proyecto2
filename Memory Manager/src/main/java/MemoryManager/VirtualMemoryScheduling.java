/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MemoryManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.javatuples.Pair;

/*
* @author Jefferson Lezcano
*/
public class VirtualMemoryScheduling
{
    public Settings Settings;
    
    public ArrayList<Settings> SettingsHistory = new ArrayList();
    public ArrayList<Integer> GlobalLeastRecentlyUsed = new ArrayList();
    public ArrayList<Integer> GlobalMostRecentlyUsed = new ArrayList();
    public ArrayList<Integer> LocalLeastRecentlyUsed = new ArrayList();
    public ArrayList<Integer> LocalMostRecentlyUsed = new ArrayList();
    public Map<Integer, ArrayList<Pair<Integer, Boolean>>> PageTables = new HashMap();
    public Map<Integer, Map<Integer, Integer>> GlobalLeastFrequentlyUsed = new HashMap();
    public Map<Integer, Map<Integer, Integer>> GlobalMostFrequentlyUsed = new HashMap();
    public Map<Integer, Integer> LocalLeastFrequentlyUsed = new HashMap();
    public Map<Integer, Integer > LocalMostFrequentlyUsed = new HashMap();
    
    public boolean PageFault;
    
    public VirtualMemoryScheduling()
    {
        Settings = new Settings();
    }
    
    public Timeline Execute(Process process, int pointer)
    {
        int request = pointer % Settings.PhysicalMemoryFrameSize;
        Pair<Integer, Boolean> RowPageTable = PageTables.get(process.Id()).get(request);
        if (RowPageTable.getValue1())
            return Report();
        RowPageTable = new Pair(RequestFrame(), true);
        return Report();
    }
    
    private void Initializer(ArrayList<Process> processes)
    {
        for (Process process : processes)
        {
            ArrayList<Pair<Integer, Boolean>> PageTable = new ArrayList();
            for (int i = 0; i < Math.ceil(process.Size() / Settings.PhysicalMemoryFrameSize); i++)
                PageTable.add(new Pair(0, false));
            PageTables.put(process.Id(), PageTable);
        }
    }
    
    private int RequestFrame()
    {
        return 0;
    }
    
    private int Victim()
    {
        return 0;
    }
    
    public Timeline Report()
    {
        return new Timeline();
    }
}