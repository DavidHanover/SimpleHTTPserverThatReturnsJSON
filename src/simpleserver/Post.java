package simpleserver;

import java.util.HashMap;
import java.util.Map;

public class Post {

  private final static Map<Integer, Post> postidDict = new HashMap<>();

  private final int postId;
  private final int userId;
  private final String data;

  // Constructor; takes input data in form of
  // Post(String: "Message Contents", Int: User ID, Int: Post ID)

  public Post(String c, int uid, int pid) {
    this.data = c;
    this.postId = pid;
    this.userId = uid;

    postidDict.put(postId, this);
  }

  public static String getPost(int postId) {
    return postidDict.get(postId).data;
  }

  //public static void putPost(Post a){
  //postidDict.put

  // }

}
