package simpleserver;

import java.util.HashMap;
import java.util.Map;

class Comment {

  private static int cNum = 0;

  private final static Map<Integer, Comment> commentDict = new HashMap<>();

  private final String data;
  private final int postid;
  private final int userid;

  public Comment(String c, int uid, int pid) {
    this.data = c;
    this.postid = pid;
    this.userid = uid;

    commentDict.put(cNum, this);
    cNum++;
  }

  public String getData() {
    return data;
  }

  public int getPostID() {
    return postid;
  }

  public int getUserID() {
    return userid;
  }

}
