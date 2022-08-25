package model.entity;

import annotation.EmailExists;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import static util.Constants.*;
import static util.Constants.MAX;

@Entity
@Table(name = "resume")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Resume {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 100, message = MAX)
    private String linkedIn;

    @NotEmpty(message = REQUIRED)
    @Size(max = 255, message = MAX)
    @EmailExists(shouldExist = false)
    @Pattern(regexp = EMAIL_VALIDATION, message = PATTERN)
    @Column(length = 256, unique = true)
    private String email;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private Country country;

    @Size(max = 255, message = MAX)
    private String position;

}
