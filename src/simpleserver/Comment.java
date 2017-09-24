package simpleserver;
import java.util.HashMap;
import java.util.Map;

public class Comment {

  private static int cNum = 0;

  private final static Map<Integer, Comment> commentDict = new HashMap<>();

  private final String data;
  private final int postID;
  private final int userID;

  public Comment(String c, int uid, int pid){
    this.data = c;
    this.postID = pid;
    this.userID = uid;

    commentDict.put(cNum, this);
    cNum++;
  }

  public static String getComment(int index){
    return commentDict.get(index).data;
  }

  pub

}
