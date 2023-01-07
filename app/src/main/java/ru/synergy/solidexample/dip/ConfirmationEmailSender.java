package ru.synergy.solidexample.dip;

import ru.synergy.solidexample.models.Order;

public class ConfirmationEmailSender implements MailSender{

    @Override
    public void sendConfirmationEmail(Order order) {
        String mane = order.getCustomerName();
        String email = order.getCustomerEmail();
        //шлем письмо клиенту
    }
}
