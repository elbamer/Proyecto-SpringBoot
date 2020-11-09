package com.disenotuweb.rolesSecurity.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Passgenerator {


    public static void main(String[] args) {
        System.out.println(" Entraaaaaa codificado  ");
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(15);
        System.out.println(" Entraaaaaa codificadoddddddd  ");
        //El String que mandamos al metodo encode es el password que queremos encriptar.
        System.out.println(bCryptPasswordEncoder.encode("12345"));
        System.out.println(" Este es el passwprod codificado  ");

    }
}