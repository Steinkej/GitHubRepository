package myproject;

import java.lang.Math;

public class BankAccount{
        private long balance;
        private long einnahme;
        private long ausgabe;
        private long foreignValue;
        private double conversionfactor;
        
      
        
        public long getBalance(){
                System.out.println("Der Kontostand ist bei: "+ balance);
		return balance;
        }
        
        public long deposit(long einnahme){
        long nbalance = balance + einnahme;
        balance = nbalance;
        return balance;
        }
        
        public long withdraw(long ausgabe){
        long cbalance = balance - ausgabe;
        balance = cbalance;
        return balance;
        }
        
        public long withdraw(long foreignValue, double conversionfactor){
      
        double nforeignValue;
       
        double dforeignValue = (double)foreignValue; 
        
        nforeignValue = dforeignValue * conversionfactor;
        Math.ceil(nforeignValue);
        long aforeignValue =(long)nforeignValue;
        long nbalance = balance - aforeignValue;
        balance = nbalance;
        return balance;
        }
}
