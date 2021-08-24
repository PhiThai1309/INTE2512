package Laboratory5;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ex8_ChangeCodingStyle {
    public static void main(String[] args) throws IOException {
        File sourceFile = null;
        File destinationFile = null;

        if (args.length == 1) {
            sourceFile = new File(args[0]);
            destinationFile = new File(sourceFile + "_Converted");
        } else if (args.length == 2) {
            sourceFile = new File(args[0]);
            destinationFile = new File(args[1]);
        } else {
            System.out.println("Arguments are invalid.");
            System.exit(1);
        }


        if(!sourceFile.exists()) {
            System.out.println("File " + args[0] + " does not exist.");
            System.exit(2);
        }
        try {
            String str = Files.readString(Path.of(sourceFile.getPath()));
            String desstr = str.replaceAll("\\s+\\{", " {");

            PrintWriter myWriter = new PrintWriter(destinationFile);
            myWriter.println(desstr);
            myWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
