package ma.ensab.hospitalmanagement.entities;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomPr;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    private String phoneNumber;

    @OneToMany(mappedBy = "patient", fetch = FetchType.LAZY)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<RendezVous> rendezVous;
}
