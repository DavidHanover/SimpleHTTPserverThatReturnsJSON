package simpleserver;

class main {


  public static void main(String[] args) {

    ResponseBuilder.initializeUsers();
    ResponseBuilder.initializePosts();
    ResponseBuilder.initializeComments();

    SimpleServer.Run();
  }
}
