
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;



public class Toys implements Comparable<Toys> {
    private int orderId;
    private double frequency;
    private String nameOfToy;

    public Toys(int orderId, double frequency, String nameOfToy) {
        this.orderId = orderId;
        this.frequency = frequency;
        this.nameOfToy = nameOfToy;
    }

    @Override
    public int compareTo(Toys o) {
        return o.frequency > this.frequency ? 1 : -1;
    }

    @Override
    public String toString() {
        return "orderId:" + this.orderId + ", frequency:" + this.frequency + ", Name of the Toy:" + nameOfToy;
    }

    public double getFrequency() {
        return frequency;
    }

    
    public static void main(String[] args) throws IOException {
        
        Toys c1 = new Toys(1, 0.2, "Bear");
        Toys c2 = new Toys(3, 0.1, "Doll");
        Toys c3 = new Toys(2, 0.4, "Car");
        Toys c4 = new Toys(4, 0.5, "Train");

        Queue<Toys> customerOrders = new PriorityQueue<>();
    
        customerOrders.add(c1);
        customerOrders.add(c2);
        customerOrders.add(c3);
        customerOrders.add(c4);      

        while (!customerOrders.isEmpty()) {
	        System.out.println(customerOrders.poll());                                
        }  
        
        
        String fileName = "result.txt";
        List resultList = new ArrayList<>();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){
            for (int i = 0; i < 10; i++) {
                resultList.add(customerOrders.peek());
                writer.write(String.format("fileName", resultList.toString()));
            }                        
        }
               
    }    
}


            

            

       
        
        

    
    




 

    

    

        





        

       

                    
        

        
    
    