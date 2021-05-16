package gt.edu.umg.jwtmath.service;

import gt.edu.umg.jwtmath.dto.ResponseDto;

import gt.edu.umg.jwtmath.exception.CustomException;
import gt.edu.umg.jwtmath.security.JWTValidate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import javax.servlet.http.HttpServletRequest;


public class CalculatorOpenClose {

    private final HttpServletRequest request;
    private final IArithmeticOperations iArithmeticOperations;
    private final String token;

    public CalculatorOpenClose(HttpServletRequest request, IArithmeticOperations iArithmeticOperations, String token) {
        this.request = request;
        this.iArithmeticOperations = iArithmeticOperations;
        this.token = token;
    }

    public ResponseEntity<ResponseDto> operation(){
        try{
            JWTValidate validate = new JWTValidate();
            validate.validateToke(token);

            float result = this.iArithmeticOperations.Operation(Float.parseFloat(this.request.getParameter("a")),
                    Float.parseFloat(this.request.getParameter("b")));

            return new ResponseEntity<>(new ResponseDto(200,
                    "success",result),
                    HttpStatus.OK);

        }catch (CustomException ex){

            return new ResponseEntity<>(new ResponseDto(400,
                    ex.getMessage()),
                    HttpStatus.NOT_ACCEPTABLE);
        }catch (Exception ex){
            return new ResponseEntity<>(new ResponseDto(400,
                    "Parameter invalid"),
                    HttpStatus.BAD_REQUEST);
        }
    }


}
