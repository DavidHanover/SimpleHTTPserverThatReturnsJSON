package simpleserver;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

class ResponseBuilder {


  private static String JSONallUsers = null;
  private static String JSONallPosts = null;
  private static String JSONallComments = null;

  private static Post[] allPs = null;
  private static Comment[] allCs = null;

  public static void initializeUsers() {
    Gson gson = new Gson();
    BufferedReader br;
    try {
      br = new BufferedReader(new FileReader("src/data.json"));
      JsonParser jsonParser = new JsonParser();
      JsonObject obj = jsonParser.parse(br).getAsJsonObject();

      User[] users = gson.fromJson(obj.get("users"), User[].class);
      JSONallUsers = gson.toJson(users);
      for (int i = 0; i < users.length; i++) {
        users[i] = new User(users[i].getUsername(), users[i].getUserid());
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

  public static void initializePosts() {
    Gson gson = new Gson();
    BufferedReader br;
    try {
      br = new BufferedReader(new FileReader("src/data.json"));
      JsonParser jsonParser = new JsonParser();
      JsonObject obj = jsonParser.parse(br).getAsJsonObject();

      Post[] posts = gson.fromJson(obj.get("posts"), Post[].class);
      allPs = posts;
      JSONallPosts = gson.toJson(posts);
      for (int i = 0; i < posts.length; i++) {
        posts[i] = new Post(posts[i].getData(), posts[i].getUserId(), posts[i].getPostId());
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

  public static void initializeComments() {
    Gson gson = new Gson();
    BufferedReader br;
    try {
      br = new BufferedReader(new FileReader("src/data.json"));
      JsonParser jsonParser = new JsonParser();
      JsonObject obj = jsonParser.parse(br).getAsJsonObject();

      Comment[] comments = gson.fromJson(obj.get("comments"), Comment[].class);
      allCs = comments;
      for (int i = 0; i < comments.length; i++) {
        comments[i] = new Comment(comments[i].getData(), comments[i].getUserID(),
            comments[i].getPostID());
      }
      JSONallComments = gson.toJson(comments);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

  }


  private static String getUsers() {
    return JSONallUsers;
  }

  private static String getPosts() {
    return JSONallPosts;
  }

  private static String getComments() {
    return JSONallComments;
  }


  public ResponseBuilder(String url) {
  }

  public static String getBody(String fullAddress) {

    String[] urlParts = fullAddress.split(" ");
    String parsedUrl = urlParts[1];
    String response = "This is an invalid endpoint.";
    if (parsedUrl.equals("/User")) {
      response = String.valueOf(getUsers());
      return response;
    }

    if (parsedUrl.equals("/Posts")) {
      response = String.valueOf(getPosts());
      return response;

    }

    if (parsedUrl.startsWith("/posts?userid=")) {
      Gson gson = new Gson();
      int li = parsedUrl.lastIndexOf("=");
      int uid = Integer.valueOf(parsedUrl.substring(li + 1));
      ArrayList<Post> postsbyUID = new ArrayList<>();
      for (int i = 0; i < allPs.length; i++) {
        if (allPs[i].getUserId() == uid) {
          postsbyUID.add(allPs[i]);
        }
      }
      response = gson.toJson(postsbyUID);
      return response;

    }
    if (parsedUrl.startsWith("/comments?Postid=")) {
      Gson gson = new Gson();
      int li = parsedUrl.lastIndexOf("=");
      int pid = Integer.valueOf(parsedUrl.substring(li + 1));
      response = String.valueOf(getComments());
      ArrayList<Comment> commentsbyPID = new ArrayList<>();
      for (int i = 0; i < allCs.length; i++) {
        if (allCs[i].getPostID() == pid) {
          commentsbyPID.add(allCs[i]);
        }
      }
      response = gson.toJson(commentsbyPID);
      return response;

    }
    return parsedUrl;
  }
}
