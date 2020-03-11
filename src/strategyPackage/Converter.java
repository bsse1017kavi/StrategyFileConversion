package strategyPackage;

import org.json.CDL;
import org.json.JSONException;
import org.json.XML;
import sample.Controller;

public class Converter
{
    public static String JSONFormat = Controller.jsonArray.toString();
    public static String XMLFormat;
    public static String CSVFormat;

    public static void initialize() throws JSONException
    {
        XMLFormat = XML.toString(Controller.jsonArray);
        CSVFormat = CDL.toString(Controller.jsonArray);
    }
}
