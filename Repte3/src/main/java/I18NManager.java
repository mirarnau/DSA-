import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;
import java.util.ResourceBundle;

public class I18NManager {
    private static I18NManager instance;
    //Hauria de ser un diccionari.
    List<String> listCache = new ArrayList<String>();
    private I18NManager() {
    }

    public get
    public static I18NManager getInstance(){
        if (instance==null) {
            instance = new I18NManager();

        }
        return instance;
    }

    public String getText(String idParaula, String nomArxiu){
        ResourceBundle rb = listCache.get(nomArxiu);


        ResourceBundle rb = ResourceBundle.getBundle(nomArxiu);
        return rb.getString(idParaula);
    }
}
