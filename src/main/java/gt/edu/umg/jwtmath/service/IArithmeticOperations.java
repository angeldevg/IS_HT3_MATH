package gt.edu.umg.jwtmath.service;

import gt.edu.umg.jwtmath.exception.CustomException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public interface IArithmeticOperations {
    public float Operation(float a, float b);
}
