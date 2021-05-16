package gt.edu.umg.jwtmath.security;

import gt.edu.umg.jwtmath.exception.CustomException;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;


public class JWTValidate {

    public boolean validateToke(String token) throws CustomException {
        try {
            System.out.println(Jwts.parser().setSigningKey("kirikuiManco1".getBytes()).parseClaimsJws(token.substring(7)).getBody().getSubject());
            return true;
        }catch (JwtException ex) {
            throw new CustomException(400, ex.getLocalizedMessage());
        }catch (NullPointerException ex){
            throw new CustomException(500, "Key invalida");
        }
    }
}
