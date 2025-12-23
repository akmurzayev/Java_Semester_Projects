package pl.edu.vistula.firstrestapi.shared.api.response;

public class ErrorMessageResponse {
    private final String message;

    public ErrorMessageResponse(String message){
        this.message = message;
    }
    public String getMessage(){
        return message;
    }
}
