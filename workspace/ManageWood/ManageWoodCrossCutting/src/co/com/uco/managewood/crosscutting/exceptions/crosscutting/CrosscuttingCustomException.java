package co.com.uco.managewood.crosscutting.exceptions.crosscutting;

import co.com.uco.managewood.crosscutting.exceptions.ManegeWoodCustomException;
import co.com.uco.managewood.crosscutting.exceptions.enumeration.LayerException;
import static co.com.uco.managewood.crosscutting.helper.StringHelper.EMPTY;
public class CrosscuttingCustomException extends ManegeWoodCustomException {
    private static final long serialVersionUID = 1L;

    protected CrosscuttingCustomException(Exception rootException, String technicalMessage, String userMessage){
        super(rootException,technicalMessage,userMessage,LayerException.CROSSCUTTING);
    }

    public static final ManegeWoodCustomException createTechnicalException(final String technicalMessage, final Exception rootException){
        return new CrosscuttingCustomException(rootException,technicalMessage,EMPTY);
    }

    public static final ManegeWoodCustomException createUserException(final String userMessage, final Exception rootException){
        return new CrosscuttingCustomException(rootException,userMessage,userMessage);
    }

    public static final ManegeWoodCustomException create(final String userMessage, final String technicalMessage, final Exception rootException){
        return new CrosscuttingCustomException(rootException,technicalMessage,userMessage);
    }

    public static CrosscuttingCustomException create(String userMessage, String technicalMessage){
        return new CrosscuttingCustomException(new Exception(), userMessage, technicalMessage);
    }
}
