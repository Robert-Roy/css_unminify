/*
 * All rights reserved. Copyright Robert Roy 2016.
 */
package css.formatter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Robert Roy <www.robertsworkspace.com>
 */
public class CSSFormatter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // adds linebreaks where appropriate in css files. after ;, {, and before and after }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        try {
            System.out.print("Give Data:");
            input = br.readLine(); // text to search
        } catch (IOException ex) {
            System.out.println("This program has encountered an error.");
            System.exit(0);
        }
        String output = input.replaceAll(";", ";\n\t");
        output = output.replaceAll("\\{", "\\{\n\t");
        output = output.replaceAll("\\}", "\n\\}\n");
        System.out.println(output);
    }
}