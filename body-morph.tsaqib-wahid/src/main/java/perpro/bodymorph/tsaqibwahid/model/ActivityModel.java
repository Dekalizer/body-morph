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
@Table(name = "activity")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ActivityModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "activity_type", nullable = false)
    private ActivityType activityType;

    @NotNull
    @Column(name = "minutes", nullable = false)
    private Double minutes;

    @ManyToOne(fetch= FetchType.EAGER)
    @JoinColumn(name = "day_id", nullable = true)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private DayModel day;

}
