package simpleserver;

class ResponseBuilder {
  private final String data;

  public ResponseBuilder(String url) {
    this.data = url;
  }

  public static String getBody(String fullAddress) {

    String[] urlParts = fullAddress.split(" ");
    String parsedUrl = urlParts[1];
    String response = "This is an invalid endpoit.";
    if(parsedUrl.equals( "/User")){
      response = String.valueOf(main.getUsers());
      return response;
    }

    if(parsedUrl.equals( "/posts")){
      response = String.valueOf(main.getPosts());
      return response;

    }

    if(parsedUrl.equals( "/Posts")){
      response = String.valueOf(main.getPosts());
      return response;

    }

    if(parsedUrl.equals( "/comments")){
      response = String.valueOf(main.getComments());
      return response;

    }
    return parsedUrl;
  }
}
