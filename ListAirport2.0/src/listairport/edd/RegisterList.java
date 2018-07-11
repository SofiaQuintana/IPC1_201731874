/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listairport.edd;

import javax.swing.JTextArea;
import listairport.dummyclasses.Passenger;
import listairport.dummyclasses.Register;

/**
 *
 * @author zofia
 */
public class RegisterList {

    public Node start;
    public Node ending;
    private int size;

    public RegisterList() {
        start = null;
        ending = null;
        size = 0;
    }

    public void setRegister(char correlative, PassengersQueue queue, DocumentStack stack, Passenger passenger, boolean state) {      
        Register register = new Register(correlative, queue, stack, passenger, state);
        insertAtFront(register);
    }

    public void setPassenger(Passenger passenger) {
        if(start != null) {
            Node node = start;
            while(node != null) {
                Register register = (Register) node.getData();
                if(register.getQueue().getSize() < 7) {
                        register.getQueue().setPassenger(passenger);					
                        return;
                }
                node = node.next;
            }
        }
    }
    
    public void addPassenger() {
        if(start != null) {
            Node node = start;
            while(node != null) {
                Register register = (Register) node.getData();
                if(register.isState() && !register.getQueue().isEmpty()) {
                        register.setState(false);
                        register.setPassenger((Passenger) register.getQueue().eliminateData());
                        node = node.next;					
                }
                else {
                        node = node.next;
                }				
            }
        }
    }
    
    public Register getRegister(int index) {
        Register desk = (Register) getData(index);
        return desk;
    }

    public void insertAtFront(Object data) {
        if (start == null) {
            start = new Node(data, null, null);
            ending = start;
        } else {
            Node temporal = new Node(data, null, start);
            start.setPrevious(temporal);
            start = temporal;
        }
        size++;
    }

    public void insertAtEnding(Object data) {

        if (start == null) {
            start = new Node(data, null, null);
            ending = start;
        } else {
            Node temporal = new Node(data, ending, null);
            ending.setNext(temporal);
            ending = temporal;
        }
        size++;
    }

    public Object getData(int index) {
        index = size - index - 1;
        int iterator = 0;
        Node auxiliar = start;

        while (iterator < index) {
            auxiliar = auxiliar.getNext();
            iterator++;
        }
        return auxiliar.getData();
    }

    public boolean isEmpty() {
        return start == null;
    }

    public int getSize() {
        return size;
    }
    
    public void decreaceTurn(BagList list) {
        if(start != null) {
            Node node = start;
            while(node != null) {
                Register register = (Register) node.getData();
                if(register.getPassenger() != null) {
                    register.getPassenger().setRegisterTurns(register.getPassenger().getRegisterTurns()-1);				
                }
                node = node.next;
            }
        }
        finalizeRegister(list);
    }

    public void finalizeRegister(BagList list) {
        if(start != null) {
            Node node = start;
            while(node != null) {
                Register register = (Register) node.getData();
                if(register.getPassenger() != null) {
                    if(register.getPassenger().getRegisterTurns() <= 0) {						
                        list.deleteBag(register.getPassenger().getBags());
                        register.getStack().insertData(register.getPassenger().getDocuments());
                        register.setPassenger(null);
                        register.setState(true);						
                    }
                }
                node = node.next;
            }
        }
    }
    
    public void isAvailable() {
        if(start != null) {
            Node node = start;
            while(node != null) {
                Register register = (Register) node.getData();
                if(register.getPassenger() == null) {
                        register.setState(true);
                }
                node = node.next;
            }
        }
    }
    
    public boolean getSizeSpace() {
        boolean space = false;
        if(start != null) {
            Node node = start;
            while(node != null) {
                Register register = (Register) node.getData();
                if(register.getQueue().sizeQueue()<7) {
                        space = true;
                }
                node = node.next;
            }			
        }
        return space;
    }
	 
    public int documents(Register register) {
        int documents = 0; 
        if(register.getStack().start != null) {
                Node node = register.getStack().start;
                while(node!=null) {
                        documents += (int)node.getData();
                        node = node.next;
                }
        }
        return documents;
    }
	
    public void printDesk(JTextArea terminal, BagList list) {
        for (int i = 0; i < getSize(); i++) {
            Register desk = (Register) getData(i);
            if(desk.getPassenger()==null) {
                terminal.append("\n DESK: " + desk.getCorrelative());
                terminal.append("\n STATE: " + desk.isAvailable());
                terminal.append("\n ------------ DOCUMENTS -----------");
                terminal.append("\n DOCUMENTS: " + documents(desk) + "\n");
            } else {
                terminal.append("\n DESK: " + desk.getCorrelative());
                terminal.append("\n PASSENGER: " + desk.getPassenger().getCorrelative());
                terminal.append("\n STATE: " + desk.isAvailable());
                terminal.append("\n TURN: " + desk.getPassenger().getRegisterTurns());
                terminal.append("\n ------------ DOCUMENTS -----------");
                terminal.append("\n DOCUMENTS: " + documents(desk) + "\n");
                terminal.append("\n ---------------QUEUE----------------- \n");
                decreaceTurn(list);
//                desk.getQueue().printPassengers(terminal);
                if(desk.getQueue().start != null){
                    Node node = desk.getQueue().start;
                    while(node != null) {
                            Passenger passenger = (Passenger) node.getData();
                            if(passenger!=null)
                            terminal.append("\n	PASAJERO: " + passenger.getCorrelative());
                            node = node.next;
                    }
                }                
            }
        }        
    }
}
