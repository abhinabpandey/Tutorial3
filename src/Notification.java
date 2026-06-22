interface Notification {
    void sendNotification(String message);
}

class EmailNotification implements Notification {
    public void sendNotification(String message) {
        System.out.println("Email sent: " + message);
    }
}

class SMSNotification implements Notification {
    public void sendNotification(String message) {
        System.out.println("SMS sent: " + message);
    }
}

class NotificationMain {
    public static void main(String[] args) {
        Notification email = new EmailNotification();
        Notification sms = new SMSNotification();
        email.sendNotification("Your fee is due.");
        sms.sendNotification("Your fee is due.");
    }
}