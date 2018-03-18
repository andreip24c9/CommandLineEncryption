import java.io.File;

public class TestProgram {
        public static void main(String[] args) {
        String key = "parola parola";
        File inputFile = new File("/Users/Andrei/Workspaces/IdeaProjects/CommandLineEncryption/testFiles/my_file.txt");
        File encryptedFile = new File("/Users/Andrei/Workspaces/IdeaProjects/CommandLineEncryption/testFiles/encrypted.txt");
        File decryptedFile = new File("/Users/Andrei/Workspaces/IdeaProjects/CommandLineEncryption/testFiles/decrypted_text.txt");

        try {
            CryptoUtils.encrypt(key,inputFile,encryptedFile);
            CryptoUtils.decrypt(key,encryptedFile,decryptedFile);
            System.out.println("Sucess");
        } catch (CryptoException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
