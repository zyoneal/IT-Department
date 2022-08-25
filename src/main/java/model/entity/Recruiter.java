package model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import static util.Constants.*;
import static util.Constants.PATTERN;

@Entity
@Table(name = "recruiter")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Recruiter {

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

}
