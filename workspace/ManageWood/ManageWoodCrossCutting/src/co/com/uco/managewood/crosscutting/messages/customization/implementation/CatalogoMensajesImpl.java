package co.com.uco.managewood.crosscutting.messages.customization.implementation;

import co.com.uco.managewood.crosscutting.messages.customization.CatalogoMensajes;

import java.util.Locale;
import java.util.ResourceBundle;

public class CatalogoMensajesImpl implements CatalogoMensajes {
    private final ResourceBundle bundle = ResourceBundle.getBundle("./co/com/uco/managewood/crosscutting/messages/customization/catalog/messages");

    @Override
    public String getMessage(String clave) {
        return bundle.getString(clave);
    }
}
