package logger;

import java.util.logging.Logger;
import java.util.logging.Level;

public class newonee {
    private static final  Logger logi= Logger.getLogger(newonee.class.getName());

    public static void main(String[] args) {
        logi.info("this is  information in logs");
        logi.warning("this warning in logs");
        logi.severe("this is a severe message which value is  1000");


        try
        {
            throw new Exception("just using this");
        }
        catch(Exception e)
        {
            logi.log(Level.SEVERE,"an exception ",e);
        }
    }
}
