package co.com.uco.managewood.crosscutting.exceptions;

import co.com.uco.managewood.crosscutting.exceptions.enumeration.LayerException;
import static co.com.uco.managewood.crosscutting.helper.ObjectHelper.getDefaultIfNull;
import static co.com.uco.managewood.crosscutting.helper.StringHelper.isEmpty;
public class ManegeWoodCustomException extends RuntimeException{

    private static final long serialVersionUID = 1L;
    private String userMessage;
    private LayerException layer;

    protected ManegeWoodCustomException(final Throwable rootException, final String technicalMessage, final String userMessage, final LayerException layer){
        super(technicalMessage, getDefaultIfNull(rootException,new Exception()));
        setUserMessage(userMessage);
        setLayer(layer);
    }

    public String getUserMessage() {
        return userMessage;
    }

    private void setUserMessage(String userMessage) {
        this.userMessage = userMessage;
    }

    public LayerException getLayer() {
        return layer;
    }

    private void setLayer(LayerException layer) {
        this.layer = getDefaultIfNull(layer, LayerException.APPLICATION);
    }

    public final boolean isTechnicalException(){
        return isEmpty(getUserMessage());
    }
}
