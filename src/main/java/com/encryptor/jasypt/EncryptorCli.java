package com.encryptor.jasypt;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

public class EncryptorCli {

    private static void usage() {
        System.out.println("Usage: java -jar jasypt-encryptor-cli.jar <encryptor-password> <plaintext> [algorithm]");
        System.out.println("  <encryptor-password> : secret key used by Jasypt (JASYPT_ENCRYPTOR_PASSWORD)");
        System.out.println("  <plaintext>          : value to encrypt");
        System.out.println("  [algorithm]          : (optional) default PBEWithMD5AndDES, e.g. PBEWithMD5AndDES, PBEWithSHA1AndDESede");
        System.exit(1);
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            usage();
        }

        String password = args[0];
        String plaintext = args[1];
        String algorithm = args.length >= 3 ? args[2] : "PBEWithMD5AndDES";

        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setPassword(password);
        encryptor.setAlgorithm(algorithm);

        String encrypted = encryptor.encrypt(plaintext);

        // Print result in the format Jasypt uses
        System.out.println("ENC(" + encrypted + ")");
    }
}
