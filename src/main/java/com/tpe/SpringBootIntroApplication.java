package com.tpe;

import com.tpe.domain.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//bir spring uygulamasinda mutlaka component scan olmak zorunda
//butun scan anntationlari burada olusturmak zorundayiz
//bu class tpe nin icine girer ama com un icine girmez burasi onemli
//jvm annotationlari componentleri anlamaz
public class SpringbootintroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootintroApplication.class, args);

	}

}
