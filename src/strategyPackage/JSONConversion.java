package strategyPackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class JSONConversion implements ConvertBehavior
{
    @Override
    public void convert()
    {

        try
        {
            FileOutputStream outputStream = new FileOutputStream(new File("output.json"));
            outputStream.write(Converter.JSONFormat.getBytes());
            outputStream.close();
        }catch(IOException e)
        {

        }

    }
}
