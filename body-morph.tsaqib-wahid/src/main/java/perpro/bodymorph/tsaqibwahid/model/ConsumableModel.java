package perpro.bodymorph.tsaqibwahid.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.io.Serializable;

@Entity
@Table(name = "consumable")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ConsumableModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "name", nullable = false)
    private String name;

    @NotNull
    @Column(name = "calories", nullable = false)
    private Double calories;

    @ManyToOne(fetch= FetchType.EAGER)
    @JoinColumn(name = "day_id", nullable = true)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private DayModel day;
}
