import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;

public class MyBot extends TelegramLongPollingBot {
    ArrayList<String> mess = new ArrayList<>();

    @Override
    public void onUpdateReceived(Update update) {
//        Message message = update.getMessage();
//        mess.add(String.valueOf(message.getText()));
//        System.out.println("Hello bot users");
//        if (String.valueOf(message.getText()).equals("show")) {
//            System.out.println(mess);
//        }
//        Long chatId = update.getMessage().getChatId();
//        System.out.println(chatId);
//        if (chatId==934268286){ 7155439415
//            System.out.println("Fuck you beach !!!");
//        }
        try {
            Long user1 = 7155439415l;
            Long user2 = 934268286l;
            Long chatId = update.getMessage().getChatId();
            SendMessage sendMessage = new SendMessage();
            if (user1.equals(chatId)) {
                sendMessage.setChatId(user2);
                sendMessage.setText("Sizga "+user1+" foydalanuvchi xabar yubordi !!!!!");
                execute(sendMessage);
            }else if (user2.equals(chatId)){
                sendMessage.setChatId(user1);
                sendMessage.setText("Sizga "+user2+" foydalanuvchi xabar yubordi !!!!!");
                execute(sendMessage);
            }
//            Long chatId = Long.valueOf(update.getMessage().getChatId());
//        SendMessage sendMessage = new SendMessage();
//        sendMessage.setChatId(chatId);
//            System.out.println(chatId);
//        sendMessage.setText("Salom !!!");
//            execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getBotUsername() {
        return "asfgqwefef_bot";
    }

    @Override
    public String getBotToken() {
        return "7973750379:AAFk2NmmHyh9vp1s3PwsCr8KnobhwPszMEA";
    }
}
