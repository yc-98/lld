package lld.ObserverPattern.Observer;

import lld.ObserverPattern.Observable.StocksObservable;

public class MobileAlertObserver implements NotificationAlertObserver{

    String phoneNo;
    StocksObservable observable;
    public MobileAlertObserver(String phoneNo, StocksObservable observable){
        this.observable = observable;
        this.phoneNo=phoneNo;
    }

    @Override
    public void update() {
        sendMessage(this.phoneNo,"product is in stock hurry up");
    }
    private void sendMessage(String phoneNo, String message){
        System.out.println("Message sent to"+phoneNo);
    }
}
