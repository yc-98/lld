package lld.ObserverPattern.Observer;

import lld.ObserverPattern.Observable.StocksObservable;

public class EmailAlertObserver implements NotificationAlertObserver{
    String emailId;
    StocksObservable observable;
    public EmailAlertObserver(String emailId, StocksObservable observable){
        this.observable=observable;
        this.emailId=emailId;
    }
    @Override
    public void update(){
        sendMail(emailId,"product is in stock hurry up");
    }
    private void sendMail(String emailId,String msg){
        System.out.println("mail sent to:" +emailId);
    }


}
