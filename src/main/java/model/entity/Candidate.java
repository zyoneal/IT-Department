package model.entity;

import annotation.EmailExists;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

import static javax.persistence.CascadeType.ALL;
import static util.Constants.*;

@Entity
@Table(name = "candidate")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Size(max = 100, message = MAX)
    @Pattern(regexp = NAME_VALIDATION, message = PATTERN)
    private String firstName;

    @NotEmpty
    @Size(max = 100, message = MAX)
    @Pattern(regexp = NAME_VALIDATION, message = PATTERN)
    private String lastName;

    @Size(max = 255, message = MAX)
    private String telephoneNumber;

    @NotEmpty(message = REQUIRED)
    @Size(max = 255, message = MAX)
    @EmailExists(shouldExist = false)
    @Pattern(regexp = EMAIL_VALIDATION, message = PATTERN)
    @Column(length = 256, unique = true)
    private String email;

    @OneToOne(cascade = ALL, orphanRemoval = true)
    private Country country;

}
