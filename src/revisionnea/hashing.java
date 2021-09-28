
package revisionnea;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class hashing {
    
    public static String Hashpassword(String Password) {
        String passwordToHash = Password;
        String hashedpassword = null;
        try {
            // Create MessageDigest instance for MD5
            MessageDigest MD = MessageDigest.getInstance("MD5");
            //Add password bytes to digest
            MD.update(passwordToHash.getBytes());
            //Get the hash's bytes 
            byte[] bytes = MD.digest();
            //This bytes[] has bytes in decimal format;
            //Convert it to hexadecimal format
            StringBuilder sb = new StringBuilder();
            for(int i=0; i< bytes.length ;i++)
            {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            //Get complete hashed password in hex format
            hashedpassword = sb.toString();
        } 
        catch (NoSuchAlgorithmException e) 
        {
            e.printStackTrace();
        }
        return hashedpassword;
    }
}
