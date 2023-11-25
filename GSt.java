import java.util.*;
import java.io.*;
public class GSt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of products");
        int n=scan.nextInt();
        String[] products = new String[n];
        double[] prices = new double[n];
        double [] GSt=new double[n];
        double []quantities = new double[n];

        double [] total = new double[n];
        double max=0;
        int index = 0;
       
        for(int i=0; i<n; i++){
            System.out.println("enter  product name ,price ,GST and quantities");
            products[i]=scan.next();
            prices[i]=scan.nextDouble();
            GSt[i]=scan.nextDouble();
            quantities[i]=scan.nextDouble();

        }
        double totalamount=1l;
        for(int i=0;i<n;i++){
             double Gst_amount=0;
            if(prices[i]>=500){
                double sum = prices[i];
                double discount=prices[i]*0.05;
                prices[i]=prices[i]-discount;
            }
            if(GSt[i]!=0){

            
            Gst_amount=prices[i]*quantities[i]*(GSt[i]/100);
            if(max<Gst_amount){
                max=Gst_amount;
                index=i;

            }
           }
           else{
            Gst_amount=0;
           }
            totalamount=totalamount+((prices[i]*quantities[i])+Gst_amount);
            

        }
        System.out.println(prices[0]);
        System.out.println("Total amount to be paid: " + totalamount);
        System.out.println("maximum GSt product is  "+ products[index] +" and it's amount is "+max);

        
    }
    
}
