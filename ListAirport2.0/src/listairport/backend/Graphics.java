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
import listairport.dummyclasses.Register;
import listairport.edd.Node;

/**
 *
 * @author zofia
 */
public class Graphics {
    
    public void createDotFileDoubleList(Node node, String name) {
        FileWriter writer = null;
        PrintWriter printer;
        
        try {
            writer = new FileWriter(name + ".dot");
            printer = new PrintWriter(writer);
            printer.println("digraph listadoble {");
            printer.println(generateDotFileDoubleList(node));
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
    
    public void createDotFileDesks(Node node, String name) {
        FileWriter writer = null;
        PrintWriter printer;
        
        try {
            writer = new FileWriter(name + ".dot");
            printer = new PrintWriter(writer);
            printer.println("digraph listadesk {");
            printer.println(generateDotFileDesk(node));
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
    
    public void createDotFileList(Node node, String name) {
        FileWriter writer = null;
        PrintWriter printer;
        
        try {
            writer = new FileWriter(name + ".dot");
            printer = new PrintWriter(writer);
            printer.println("digraph listasimple {");
            printer.println(generateDotFileList(node));
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
    
    public void createDotFileBagList(Node node, Node node2, String name) {
        FileWriter writer = null;
        PrintWriter printer;
        
        try {
            writer = new FileWriter(name + ".dot");
            printer = new PrintWriter(writer);
            printer.println("digraph listacircular {");
            printer.println(generateDotFileBagList(node, node2));
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
    
    public String generateDotFileDoubleList(Node node) {
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
            string += generateDotFileDoubleList(node.next);
        }
        
        return string;
    }
    
    public String generateDotFileList(Node node) {
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
            string += generateDotFileList(node.next);
        }     
        return string;
    }
    
    public String generateDotFileBagList(Node first, Node end) {
        String string = "";		
        if(first == null) {
                return string;
        }
        string += "Node" + replace(first.hashCode()) + "[label=\""+ "Maleta: " + first.getData()+ "\"];\n";
        if(first.getNext() != end) {		
                string += "Node"+ replace(first.hashCode())+"->" +"Node"
                                        +replace(first.getNext().hashCode()) + ";\n";	
                string += "Node" + replace(first.getNext().hashCode())+ "->" 
                                        + "Node" + replace(first.getNext().getPrevious().hashCode()) + ";\n";
                string += generateDotFileBagList(first.getNext(),end);
        }
        if(first.getNext() == end) {
                string += "Node"+ replace(first.hashCode())+"->" +"Node"+replace(end.hashCode()) + ";\n";	
                string += "Node" + replace(end.hashCode())+ "->" + "Node" + replace(first.hashCode()) + ";\n";
                return string;
        }
        return string;
    }	

    public String generateDotFileDesk(Node node) {
        String string = "";
              Register register = (Register) node.getData();
        if(register.getPassenger()==null) {
                string += "Node"+replace(node.hashCode()) + "[label=\"Desk: " + register.getCorrelative()
                        + "&#92;nState: " + register.isAvailable()+ "\"];\n" ;
        }
        else {
                string += "Node" + replace(node.hashCode()) + "[label=\"Desk: " + register.getCorrelative()
                        + "&#92;nState: " + register.isAvailable()+ "&#92;nPassenger: " + register.getPassenger().getCorrelative()
                        + "&#92;nTurns: " + register.getPassenger().getRegisterTurns() + "\"];\n";  
        }
        if(node.getNext() != null) {
                string += "Node"+ replace(node.hashCode())+"->" +"Node"+replace(node.getNext().hashCode()) + ";\n";
                string += "Node" + replace(node.getNext().hashCode())+ "->" + "Node" + replace(node.getNext().getPrevious().hashCode()) + ";\n";
                string += generateDotFileDesk(node.getNext());
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
