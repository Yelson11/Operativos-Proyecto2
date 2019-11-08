package MemoryManager;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/*
* @author Jefferson Lezcano
*/
public class Logic
{
    public static void Save(Settings settings)
    {
        try
        {
            JAXBContext context = JAXBContext.newInstance(Settings.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            File file = new File("Settings.xml");
            marshaller.marshal(settings, file); 
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
    public static Settings Load(String path)
    {
        Settings settings = null;
        try
        {
            File file = new File(path);
            JAXBContext context = JAXBContext.newInstance();
            Unmarshaller unmarshaller = context.createUnmarshaller();
            settings = (Settings) unmarshaller.unmarshal(file);
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        return settings;
    }
}
