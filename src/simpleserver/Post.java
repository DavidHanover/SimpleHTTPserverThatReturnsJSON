package simpleserver;

import java.util.HashMap;
import java.util.Map;

class Post {

  private final static Map<Integer, Post> postidDict = new HashMap<>();

  private final int postid;
  private final int userid;
  private final String data;

  // Constructor; takes input data in form of
  // Post(String: "Message Contents", Int: User ID, Int: Post ID)

  public Post(String c, int uid, int pid) {
    this.data = c;
    this.postid = pid;
    this.userid = uid;

    postidDict.put(postid, this);
  }

  public String getData() {
    return data;
  }

  public int getUserId() {
    return userid;
  }

  public int getPostId() {
    return postid;
  }

}
