package lld.ObserverPattern;

import lld.ObserverPattern.Observable.IphoneObservable;
import lld.ObserverPattern.Observable.StocksObservable;
import lld.ObserverPattern.Observer.EmailAlertObserver;
import lld.ObserverPattern.Observer.MobileAlertObserver;
import lld.ObserverPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String args[]){
        StocksObservable iphoneStockObservable = new IphoneObservable();
        NotificationAlertObserver obs1= new EmailAlertObserver("abz@gmail.com",iphoneStockObservable);
        NotificationAlertObserver obs2= new EmailAlertObserver("xyz@gmail.com",iphoneStockObservable);
        NotificationAlertObserver obs3 = new MobileAlertObserver("1234567890",iphoneStockObservable);

        iphoneStockObservable.add(obs1);
        iphoneStockObservable.add(obs2);
        iphoneStockObservable.add(obs3);
        iphoneStockObservable.setStockCount(10);
    }
}
