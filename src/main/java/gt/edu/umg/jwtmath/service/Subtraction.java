package gt.edu.umg.jwtmath.service;


import gt.edu.umg.jwtmath.exception.CustomException;

public class Subtraction implements IArithmeticOperations {
    @Override
    public float Operation(float a, float b) {
        return a - b;
    }
}
