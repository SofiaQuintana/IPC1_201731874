/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listairport.backend;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import listairport.edd.Node;

/**
 *
 * @author zofia
 */
public class Graphics {
    
    public void createDotFile(Node node, String name) {
        FileWriter writer = null;
        PrintWriter printer;
        
        try {
            writer = new FileWriter(name + ".dot");
            printer = new PrintWriter(writer);
            printer.println("digraph listadoble {");
            printer.println(generateDotFile(node));
            printer.println("}");
            printer.close();
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        } finally  {
            try {
                writer.close();
            } catch(IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    
    public String generateDotFile(Node node) {
        String string = " ";
        
        if(node == null) {
            return string;
        }
        
        string += "Node" + replace(node.hashCode()) + "[label=\""
                + node.getData() + "\"];\n";
        if(node.next != null) {
            string += "Node" +
                            replace(node.hashCode())
                            + "->" + "Node"
                            + replace(node.next.hashCode()) + ";\n";
            string += "Node" + replace(node.next.hashCode())
                            + "->" + "Node" 
                            + replace(node.next.previous.hashCode()) + ";\n";
            string += generateDotFile(node.next);
        }
        
        return string;
    }
    
    public String replace(int memoryPosition) {
        String string = String.valueOf(memoryPosition);
        return string.replace("-", "_");
    }
    
    public void generateImage(String pathDot, String pathImage) {    
        String string = " ";
        try {
            Process process = Runtime.getRuntime().exec("dot -Tpng " + pathDot + " -o " + pathImage);
            BufferedReader stdError = new BufferedReader(new InputStreamReader(process.getErrorStream()));
            while((string = stdError.readLine()) != null) {
                System.out.println(string);
            }
            } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
