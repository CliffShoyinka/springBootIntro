package com.tpe.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Getter
@Setter
//getterlari setterlari commente aldik cunki bu annotationslarla spring bizim yerimize kendisi hallediyor
// yazmaya gerek yok bu yuzden

@AllArgsConstructor //parametreli conslari getirdi
//@RequiredArgsConstructor //final ile yazdiklarimizdan constructor uretiyor
@NoArgsConstructor //parametresiz conslari getirdi
//@Data //yukarda kullandigumuz annotationslarin hepsini getiriyor bir bakima

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
 //   @Setter(AccessLevel.NONE)//butun getter setterlarin setteri calissin ama bunun setteri calismasin demek
//    @Getter
//    @Setter
    //getter ve setterlari methodlarin ustune annotationslari yazarsak sinifa ozgu degil
    //methodlara ozgu olurlar ayru ayri tek tek ayarlamis oluruz fakat yine de pratik yol degil
    //cunku diger methodlara da tek tek yazmamiz gerekecek
    private Long id;

    @NotNull(message = "first name can not be null")
    @NotBlank(message = "first name can not be white space")
    @Size(min = 2, max = 25, message = "First name '${validateValue}' must be between {min} and {max} long")
    @Column(nullable = false, length = 25)
    private /*final*/ String name;

    @Column(nullable = false, length = 25)
    private /*final*/ String lastName;

    private /*final*/ Integer grade;

    @Column(nullable = false, unique = true)
    @Email(message = "Provide valid email")
    private /*final*/ String email;

    private /*final*/ String phoneNumber;

    //@Setter(AccessLevel.NONE)
    private LocalDateTime createDate = LocalDateTime.now();

}

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public Integer getGrade() {
//        return grade;
//    }
//
//    public void setGrade(Integer grade) {
//        this.grade = grade;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    public LocalDateTime getCreateDate() {
//        return createDate;
//    }
//
//    public void setCreateDate(LocalDateTime createDate) {
//        this.createDate = createDate;
//    }
//
//    //cons
//
//    public Student(Long id, String name, String lastName, Integer grade, String email, String phoneNumber, LocalDateTime createDate) {
//        this.id = id;
//        this.name = name;
//        this.lastName = lastName;
//        this.grade = grade;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
//        this.createDate = createDate;
//    }
//
//    public Student() {
//    }
//
//    //toString
//
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", grade=" + grade +
//                ", email='" + email + '\'' +
//                ", phoneNumber='" + phoneNumber + '\'' +
//                ", createDate=" + createDate +
//                '}';
//    }
//}
