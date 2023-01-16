package com.net.springbootmastercrudsapps.Models.Student;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String studentName;
    private String studentCode;
    private String email;
    private String contact;
    private String gender;
    private String address;
    private String status;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthDate;

    @CreationTimestamp
    private Timestamp createdAt;
    @UpdateTimestamp
    private Timestamp updatedAt;

    @Column(nullable = true, length = 64)
    private String photo;

    @Transient
    public String getPhotosImagePath() {
        if (photo == null) return null;
        return "/user-photos/" + id + "/" + photo;
    }

}
