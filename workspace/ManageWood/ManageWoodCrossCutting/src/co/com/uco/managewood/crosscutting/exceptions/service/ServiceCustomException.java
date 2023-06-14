package co.com.uco.managewood.crosscutting.exceptions.service;

import co.com.uco.managewood.crosscutting.exceptions.ManegeWoodCustomException;
import co.com.uco.managewood.crosscutting.exceptions.enumeration.LayerException;
import static co.com.uco.managewood.crosscutting.helper.StringHelper.EMPTY;
public class ServiceCustomException extends ManegeWoodCustomException {
    private static final long serialVersionUID = -7581138972968503560L;

    private ServiceCustomException(Exception rootException, String technicalMessage, String userMessage){
        super(rootException, technicalMessage, userMessage, LayerException.SERVICE);
    }

    public static final ManegeWoodCustomException create(final String userMessage, final String technicalMessage) {
        return new ServiceCustomException(new Exception(), technicalMessage, userMessage);
    }

    public static final ManegeWoodCustomException create(final Exception rootException, final String userMessage, final String technicalMessage){
        return new ServiceCustomException(rootException, technicalMessage, userMessage);
    }

    public static final ManegeWoodCustomException createTechnicalException(final String technicalMessage){
        return new ServiceCustomException(new Exception(), technicalMessage, EMPTY);
    }

    public static final ManegeWoodCustomException createTechnicalException(final Exception rootException, final String technicalMessage){
        return new ServiceCustomException(rootException, technicalMessage, EMPTY);
    }

    public static final ManegeWoodCustomException createBusinessException(final String businessMessage, final Exception rootException){
        return new ServiceCustomException(rootException, businessMessage, EMPTY);
    }

    public static final ManegeWoodCustomException createUserException(final String userMessage){
        return new ServiceCustomException(null,userMessage,userMessage);
    }

    public static final ManegeWoodCustomException wrapException(final String message, final ManegeWoodCustomException exception){
        if(exception.isTechnicalException()){
            //wrapper
            return ServiceCustomException.createBusinessException(message, exception);
        }
        return exception;
    }
}
