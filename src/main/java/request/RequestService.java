package request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import user.User;
import user.UserDAO;
import user.UserService;
import java.util.List;
import java.util.Optional;

@Service
public class RequestService {
    private RequestDAO requestDAO;

    @Autowired
    public RequestService(RequestDAO requestDAO) {
        this.requestDAO = requestDAO;
    }

    public List<Request> getAllRequests() {
        return requestDAO.selectAllRequests();
    }

    public Optional<Request> getRequestById(int id) throws Exception {
        if (requestDAO.selectRequestById(id).isEmpty()){
            throw new Exception("Request with the id " + id + " not found");
        }
        return requestDAO.selectRequestById(id);
    }

    public void createRequest(Request request) {
        requestDAO.AddRequest(request);
    }
}
