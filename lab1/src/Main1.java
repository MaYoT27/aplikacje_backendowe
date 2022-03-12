import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main1
{
    public static void main(String[] args) throws IOException
    {
        byte[] data = null;
        try
        {
            data = Files.readAllBytes(Paths.get("file.txt"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        String text = new String(data, StandardCharsets.UTF_8);
        System.out.println(text);
    }

    /*public static void main(String[] args)
    {
        File file = new File("file.txt");
        int length = (int)file.length();

        try(
                FileInputStream stream = new FileInputStream("file.txt");
                InputStreamReader reader = new InputStreamReader(stream, StandardCharsets.UTF_8);
        ){
            char[] data = new char[1024];
            int readBytes = reader.read(data, 0, length);
            if (readBytes != length)
            {
                throw new IOException("File reading error");
            }

            String text = new String(data);
            System.out.println(text);


        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }*/
}