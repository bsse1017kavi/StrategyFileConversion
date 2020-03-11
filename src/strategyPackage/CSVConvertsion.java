package strategyPackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class CSVConvertsion implements ConvertBehavior
{
    @Override
    public void convert()
    {

        try
        {
            FileOutputStream outputStream = new FileOutputStream(new File("output.csv"));
            outputStream.write(Converter.CSVFormat.getBytes());
            outputStream.close();
        }catch(IOException e)
        {

        }

    }
}
