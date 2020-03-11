package strategyPackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class XMLConversion implements ConvertBehavior
{
    @Override
    public void convert()
    {

        try
        {
            FileOutputStream outputStream = new FileOutputStream(new File("output.xml"));
            outputStream.write(Converter.XMLFormat.getBytes());
            outputStream.close();
        }catch(IOException e)
        {
            e.printStackTrace();
        }

    }
}
