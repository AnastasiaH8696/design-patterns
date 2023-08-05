import com.adapter.example.IFilesDAO;
import com.adapter.example.ISimpleFilesDAO;
import com.adapter.example.SimpleFilesDAO;
import com.adapter.example.SimpleFilesDAOAdapter;

public class Main {
    public static void main(String[] args) {
        // Example of usage
        ISimpleFilesDAO simpleFilesDAO = new SimpleFilesDAO();
        IFilesDAO filesDAO = new SimpleFilesDAOAdapter(simpleFilesDAO);
    }
}