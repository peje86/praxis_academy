package security.securityOauth.controller;
// https://github.com/endymuhardin/belajar-springoauth2/blob/master/resource-server/src/main/java/com/muhardin/endy/belajar/springoauth2/resourceserver/ResourceServerApp.java
import java.security.Principal;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController @RequestMapping("/api")
public class HaloController {
    private static final String STATE = "state";
    
    @RequestMapping("/halo")
    public Map<String, Object> halo(){
        Map<String, Object> hasil = new HashMap<String, Object>();
        hasil.put("sukses", Boolean.TRUE);
        hasil.put("page", "halo");
        return hasil;
    }
    
    @RequestMapping("/admin")
    public Map<String, Object> admin(Principal user){
        Map<String, Object> hasil = new HashMap<String, Object>();
        hasil.put("sukses", Boolean.TRUE);
        hasil.put("page", "admin");
        hasil.put("user", user.getName());
        return hasil;
    }
    
    @RequestMapping("/client")
    public Map<String, Object> client(Principal user){
        Map<String, Object> hasil = new HashMap<String, Object>();
        hasil.put("sukses", Boolean.TRUE);
        hasil.put("page", "client");
        hasil.put("user", user.getName());
        return hasil;
    }
    
    @RequestMapping("/staff")
    public Map<String, Object> staff(){
        Map<String, Object> hasil = new HashMap<String, Object>();
        hasil.put("sukses", Boolean.TRUE);
        hasil.put("page", "staff");
        return hasil;
    }
    
    @RequestMapping("/state/new")
    public Map<String, Object> newState(HttpSession session){
        Map<String, Object> hasil = new HashMap<String, Object>();
        hasil.put("sukses", Boolean.TRUE);
        
        String state = UUID.randomUUID().toString();
        hasil.put(STATE, state);
        session.setAttribute(STATE, state);
        
        return hasil;
    }
    
    @RequestMapping("/state/verify")
    public Map<String, Object> verifyState(HttpSession session){
        Map<String, Object> hasil = new HashMap<String, Object>();
        hasil.put("sukses", Boolean.TRUE);
        
        String state = (String) session.getAttribute(STATE);
        hasil.put(STATE, state);
        session.removeAttribute(STATE);
        
        return hasil;
    }
}