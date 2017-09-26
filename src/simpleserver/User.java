package simpleserver;

import java.util.HashMap;
import java.util.Map;

public class User {

  private final static Map<Integer, User> useridDict = new HashMap<>();

  private final String username;
  private final int userid;


  public User(String username, int userid) {
    this.username = username;
    this.userid = userid;

    useridDict.put(userid, this);
  }

  public String getUsername() {
    return username;
  }

  public int getUserid() {
    return userid;
  }
}
