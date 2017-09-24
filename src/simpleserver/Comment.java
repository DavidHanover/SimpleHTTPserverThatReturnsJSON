package simpleserver;
import java.util.HashMap;
import java.util.Map;

public class Comment {

  private final static Map<Integer, User> useridDict = new HashMap<>();

  private final String username;
  private final int userid;

  public Comment(String username, int userid){
    this.username = username;
    this.userid = userid;

    useridDict.put(userid, this);
  }

  public static User getUser(int userid){
    return useridDict.get(userid);
  }
}
