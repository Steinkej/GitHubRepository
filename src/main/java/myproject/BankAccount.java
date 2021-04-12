package jander4;

import java.lang.Math;

public class BankAccount{
        public long balance;
        public long einnahme;
        public long ausgabe;
        public long foreignValue;
        public double conversionfactor;
        
        public BankAccount(){
       
        }
        
        public static void main(String[] args) {
        }
        
        private void getBalance(){
                System.out.println("Der Kontostand ist bei: "+ balance);
        }
        
        private long deposit(long einnahme){
        long nbalance = balance + einnahme;
        nbalance = balance;
        return balance;
        }
        
        private long withdraw(long ausgabe){
        long cbalance = balance - ausgabe;
        cbalance = balance;
        return balance;
        }
        
        private long withdraw(long foreignValue, double conversionfactor){
      
        double nforeignValue;
       
        double dforeignValue = (double)foreignValue; 
        
        nforeignValue = dforeignValue * conversionfactor;
        Math.ceil(nforeignValue);
        long aforeignValue =(long)nforeignValue;
        long nbalance = balance - aforeignValue;
        nbalance = balance;
        return balance;
        }
}
