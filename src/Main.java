import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        File partFile = new File(args[0]);
        Scanner fileReader = new Scanner(partFile);
        ArrayList<Integer> ax = new ArrayList<>();
        ArrayList<Integer> ay = new ArrayList<>();
        ArrayList<Integer> bx = new ArrayList<>();
        ArrayList<Integer> by = new ArrayList<>();
        String[] info = new String[9];

        String data = "";

        while (fileReader.hasNext()){
            data = fileReader.nextLine();

            if (data.contains("training") || data.isEmpty()){
                continue;
            }

            info = data.trim().split("\\s+");
            break;

        } // end while

        for (String word : info) {
            System.out.println(word);
        }

        System.out.println(partFile.getName());

    }
}