package com.example._9customidwithcustomannoationpk.Entity;



import com.example._9customidwithcustomannoationpk.Annotations.TcaId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {

    @Id
    @TcaId
    @Column(name="RNO")
    private String rno;

    @Column(name="NAME")
    private String name;

    @Column(name="Per")
    private Double per;

    @Column(name="DATE")
    private LocalDate BirthDate;

}
