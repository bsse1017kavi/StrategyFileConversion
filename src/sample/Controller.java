package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import org.json.JSONArray;
import org.json.JSONObject;
import strategyPackage.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable
{
    String filePath = "students.txt";

    File file = new File(filePath);

    String content = "";

    ArrayList<Student> students = new ArrayList<>();

    public static JSONArray jsonArray = new JSONArray();

    @FXML
    CheckBox isXML;
    @FXML CheckBox isJSON;
    @FXML CheckBox isCSV;
    Button button;

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        try
        {
            BufferedReader br = new BufferedReader(new FileReader(file));

            String temp;

            while((temp = br.readLine())!= null)
            {
                content+=temp;
            }

            String [] studentStrings = content.split(";");

            for(String s: studentStrings)
            {
                String [] values =s.split(",");

                Student student = new Student(values[0],values[1],values[2],values[3]);

                students.add(student);
            }

            /*for(Student student: students)
            {
                System.out.println(student);
            }*/


            for(Student student: students)
            {
                JSONObject object = new JSONObject();

                object.put("Name",student.getName());
                object.put("Roll",student.getRoll());
                object.put("Year",student.getYear());
                object.put("Department",student.getDepartment());

                jsonArray.put(object);
            }

            /*FileOutputStream outputStream = new FileOutputStream("output.json");
            outputStream.write(jsonArray.toString().getBytes());
            outputStream.close();*/



        }catch(Exception e)
        {
            System.out.println("File not found");
        }
    }

    public void convert() throws Exception
    {
        Converter.initialize();

        if(isXML.isSelected())
            new XMLConversion().convert();
        if(isJSON.isSelected())
            new JSONConversion().convert();
        if(isCSV.isSelected())
            new CSVConvertsion().convert();

    }
}
