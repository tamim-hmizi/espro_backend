package tn.esprit.esprobackend.entities;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;
import tn.esprit.esprobackend.entities.Fundraiser;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Donation {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private Float amount;
    private String status;

    @ManyToOne
    @JoinColumn(name = "fundraiser_id")
    @JsonBackReference
    private Fundraiser fundraiser;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;



}



