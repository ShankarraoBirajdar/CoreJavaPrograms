package FactoryMethod;

public class NotificationService {
	public static void main(String[] args)
	{
		NotificationFactory notificationFactory = new NotificationFactory();
//		Notification notification = notificationFactory.createNotification("SMS");
//		Notification notification = notificationFactory.createNotification("EMAIL");
		Notification notification = notificationFactory.createNotification("PUSH");

		notification.notifyUser();
	}
}

