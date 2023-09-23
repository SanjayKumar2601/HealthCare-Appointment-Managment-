package com.healthcare.healthcareprovider.util;
import org.springframework.stereotype.Service;
import com.healthcare.healthcareprovider.exception.JWTNotValidException;
import io.jsonwebtoken.Jwts;
@Service
public class JwtUtil {

	public static String secret = "Hacktivators";
	
	// copy it in the MicroServices
	public void verify(String authorization)
	{
		try
		{
		Jwts.parser().setSigningKey(secret).parseClaimsJws(authorization);
		}
		catch (Exception e) {
			System.out.println("exception occurrred");
			e.printStackTrace();
			throw new JWTNotValidException();
		}
	}
}