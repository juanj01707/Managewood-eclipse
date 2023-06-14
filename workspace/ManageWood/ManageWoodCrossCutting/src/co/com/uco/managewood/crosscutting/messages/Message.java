package co.com.uco.managewood.crosscutting.messages;

import co.com.uco.managewood.crosscutting.helper.ObjectHelper;
import co.com.uco.managewood.crosscutting.helper.StringHelper;
import co.com.uco.managewood.crosscutting.messages.enumeration.MessageLevel;

public class Message {

    private MessageLevel level;
    private String content;

    public Message(final MessageLevel level, final String content){
        super();
        setLevel(level);
        setContent(content);
    }

    public Message(){
        setLevel(MessageLevel.FATAL);
        setContent(StringHelper.EMPTY);
    }

    public MessageLevel getLevel() {
        return level;
    }

    public void setLevel(MessageLevel level) {
        this.level = ObjectHelper.getDefaultIfNull(level, MessageLevel.FATAL);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = StringHelper.applyTrim(content);
    }

    public static Message createFatalMessage(final String content){
        return new Message(MessageLevel.FATAL, content);
    }

    public static Message createErrorMessage(final String content){
        return new Message(MessageLevel.ERROR, content);
    }

    public static Message createWarningMessage(final String content){
        return new Message(MessageLevel.WARNING, content);
    }

    public static Message createInfoMessage(final String content){
        return new Message(MessageLevel.INFO, content);
    }

    public static Message createSuccesMessage(final String content){
        return new Message(MessageLevel.SUCCES, content);
    }

}
