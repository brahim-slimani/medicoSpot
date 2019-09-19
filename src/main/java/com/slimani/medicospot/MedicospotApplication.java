package com.slimani.medicospot;

import com.slimani.medicospot.dao.MedecinRepository;
import com.slimani.medicospot.dao.UserRepository;
import com.slimani.medicospot.model.Medecin;
import com.slimani.medicospot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@SpringBootApplication
@EnableJpaAuditing
public class MedicospotApplication implements CommandLineRunner {

    @Autowired
    MedecinRepository medecinRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    public static void main(String[] args) {
        SpringApplication.run(MedicospotApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        Medecin medecin = new Medecin();
        medecin.setFirstname("Mohamed");
        medecin.setLastanme("Karim");
        medecin.setAddress("Alger, Bab el oued");
        medecin.setLatitude(35.56561233);
        medecin.setLongitude(17.56568897);
        medecin.setEmail("mohamed.karim@gmail.com");
        medecin.setPhone("021 45 63 98");
        medecin.setSpeciality("Cardiologue");
        medecin.setVisit_price(1200);

        medecinRepository.save(medecin);

        User user = new User();
        user.setUsername("slimani");
        user.setEmail("slimani.ibr@gmail.com");
        user.setPassword(bCryptPasswordEncoder.encode("slimani"));

        userRepository.save(user);

    }
}
