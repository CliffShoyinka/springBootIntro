package com.tpe.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
// getter setterlari generate etmeden direkt bu annotationlarla getter setter constructorlari otomatik getiriyor
@AllArgsConstructor
//@RequiredArgsConstructor
@NoArgsConstructor

//butun yapilarimiz entitiy classlarimiz uzerinden olusur
//database ile iliskilendirmek icin entitiy yazuyoruz
@Entity
public class Student {

    @Id // icindekilerden biri primary key olmasi lazim ondan id uazdik
    @GeneratedValue(strategy = GenerationType.IDENTITY)
 //   @Setter(AccessLevel.NONE)
//    @Getter
    private Long id;

    @NotNull(message="first name can not be null")
    //yanlis bir sey girildigi zaman mesaj veriyoruz
    @NotBlank(message="first name can not be white space")
    //hic bosluk kalmamasi icin not blank ekliyoruz
    @Size(min=2, max=25, message="First name '${validatedValue}' must be between {min} and {max} long")
    //min 2 max 25 karakterli olmasi gerektigini belirtiyoruz
    //'${validatedValue} kullanicinin ismi neyse onu yaziyor ahmet girildiyse ahmet yazar buraya
    @Column(nullable = false, length = 25)
//    @Getter
//    @Setter
    private /*final*/ String name;

    @Column(nullable = false, length = 25)
    private /*final*/ String lastName;

    private /*final*/ Integer grade;

    @Column(nullable = false, unique = true)
    @Email(message="Provide valid email")
    private /*final*/ String email;

    private /*final*/ String phoneNumber;

    //@Setter(AccessLevel.NONE)
    private LocalDateTime createDate = LocalDateTime.now();

    @OneToMany(mappedBy = "student")
    private List<Book> book = new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;


}
