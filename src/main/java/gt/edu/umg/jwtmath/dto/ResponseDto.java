package gt.edu.umg.jwtmath.dto;

public class ResponseDto {
    private int status;
    private String message;
    private Object result;

    public ResponseDto(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public ResponseDto(int status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.result = data;
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public Object getResult() {
        return result;
    }
}
