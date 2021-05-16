package gt.edu.umg.jwtmath.controller;

import gt.edu.umg.jwtmath.dto.ResponseDto;

import gt.edu.umg.jwtmath.exception.CustomException;
import gt.edu.umg.jwtmath.service.*;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class CalculatorController {

    private CalculatorOpenClose calculator;


    @RequestMapping(value = "/math/add", method = RequestMethod.GET)
    public ResponseEntity<ResponseDto> add(@RequestHeader("Authorization") String Auth, HttpServletRequest request) throws CustomException  {

        this.calculator = new CalculatorOpenClose(request, new Add(),Auth);
        return this.calculator.operation();

    }


    @RequestMapping(value = "/math/sub", method = RequestMethod.GET)
    public ResponseEntity<ResponseDto> subtraction(@RequestHeader("Authorization") String Auth,HttpServletRequest request) throws CustomException{

        this.calculator = new CalculatorOpenClose(request, new Subtraction(),Auth);
        return this.calculator.operation();

    }


    @RequestMapping(value = "/math/mul", method = RequestMethod.GET)
    public ResponseEntity<ResponseDto> multiplication(@RequestHeader("Authorization") String Auth,HttpServletRequest request) throws CustomException{

        this.calculator = new CalculatorOpenClose(request, new Multiplication(),Auth);
        return this.calculator.operation();

    }


    @RequestMapping(value = "/math/div", method = RequestMethod.GET)
    public ResponseEntity<ResponseDto> division(@RequestHeader("Authorization") String Auth,HttpServletRequest request) throws CustomException{

        this.calculator = new CalculatorOpenClose(request, new Division(),Auth);
        return this.calculator.operation();

    }

}
