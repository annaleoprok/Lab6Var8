import java.io.*;
import java.util.Scanner;
//Переписать в результирующий файл слова с числом букв больше 5.

public class Var8 {

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        InputStream in = null;
        Reader file = null;
        BufferedReader buf = null;

        OutputStream out = null;
        Writer wr = null;
        try {
            in = new FileInputStream("E:\\homework\\in.txt");
            file = new InputStreamReader(in, "utf-8");
            buf = new BufferedReader(file);

            File f2 = new File("E:\\homework\\out.txt");
            f2.createNewFile();
            out = new FileOutputStream(f2);
            wr = new OutputStreamWriter(out, "utf-8");
                String line = " "; //null
                String words[];
                while ((line = buf.readLine()) != null) {
                    words = line.split(" ");
                    //int 5 = words[0].length();
                    for (int i = 0; i < words.length; i++) {
                        if (words[i].length()>5) {
                            System.out.print(words[i]+" ");
                            wr.append(words + " ");
                        }
                    }
                    System.out.println();
                    wr.append("\n");
                }
        }
        catch (IOException io){
            io.printStackTrace();
        }
        finally {
            in.close();
            file.close();
            buf.close();
            wr.flush();
            wr.close();
            out.close();
        }
    }
}
