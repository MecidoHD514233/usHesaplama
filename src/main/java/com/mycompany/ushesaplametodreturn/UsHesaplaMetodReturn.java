
package com.mycompany.ushesaplametodreturn;

import java.util.*;
public class UsHesaplaMetodReturn {

    public static void main(String[] args) {
        System.out.println("Üs-Taban Hesaplama Programına Hoşgeldiniz. ");
        ustabanhesaplama(usal(),tabanal());
    }
    
    public static double tabanal() {
        Scanner klavye=new Scanner (System.in);
        double taban;
       do{ System.out.println("Lütfen taban değerini giriniz : ");
        taban=klavye.nextDouble();
       }while(taban<0);
       return taban;
  }
    public static double usal() {
        Scanner klavye=new Scanner (System.in);
        double us;
       do{ System.out.println("Lütfen us değerini giriniz : ");
        us=klavye.nextDouble();
       }while(us<0);
       return us;
    }
    public static void ustabanhesaplama(double us,double taban){
        System.out.println("üS-Taban hesaplaması yapılıyor lütfen bekleyiniz ");
        System.out.println("--------------------------");
        double carpım=1;
        for (int i = 0; i < us; i++) {
             carpım=(carpım*taban);
         }   
        System.out.println("Yaptığınız işlemin sonucu : "+carpım);
        
    }
    

}