package gt.edu.umg.jwtmath.exception;

import io.jsonwebtoken.JwtException;


public class CustomException extends JwtException {
    private int status;
    private String messages;

    public CustomException(int status, String messages){
        super(messages);
        this.status = status;
        this.messages = messages;
    }

    public int getStatus() {
        return status;
    }

    public String getMessages() {
        return messages;
    }
}
