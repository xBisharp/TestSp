package ro.uvt.info.services;

import jakarta.servlet.http.PushBuilder;
import ro.uvt.info.models.Conversation;
import ro.uvt.info.models.Message;
import ro.uvt.info.models.Visitor;

public class RenderContentVisitor implements Visitor<Void> {
    @Override
    public Void visitMessage(Message message) {
        message.print();
        return null;
    }

    public Void visitConversation(Conversation conversation){
        conversation.print();
        return  null;
    }
}
