package claude2.task106;

import java.math.BigInteger;
import java.security.SecureRandom;

public class Task106_CLAUDE_claude_3_5_sonnet_20240620 {
    private BigInteger n, d, e;

    public Task106_CLAUDE_claude_3_5_sonnet_20240620(int bitLength) {
        SecureRandom r = new SecureRandom();
        BigInteger p = BigInteger.probablePrime(bitLength / 2, r);
        BigInteger q = BigInteger.probablePrime(bitLength / 2, r);
        n = p.multiply(q);
        BigInteger phi = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
        e = BigInteger.probablePrime(bitLength / 2, r);
        while (phi.gcd(e).compareTo(BigInteger.ONE) > 0 && e.compareTo(phi) < 0) {
            e = e.add(BigInteger.ONE);
        }
        d = e.modInverse(phi);
    }

    public BigInteger encrypt(BigInteger message) {
        return message.modPow(e, n);
    }

    public BigInteger decrypt(BigInteger encrypted) {
        return encrypted.modPow(d, n);
    }

    public static void main(String[] args) {
        Task106_CLAUDE_claude_3_5_sonnet_20240620 rsa = new Task106_CLAUDE_claude_3_5_sonnet_20240620(1024);
        String message = "Hello, RSA!";
        BigInteger plaintext = new BigInteger(message.getBytes());
        BigInteger ciphertext = rsa.encrypt(plaintext);
        BigInteger decrypted = rsa.decrypt(ciphertext);
        System.out.println("Original: " + message);
        System.out.println("Encrypted: " + ciphertext);
        System.out.println("Decrypted: " + new String(decrypted.toByteArray()));
    }
}
