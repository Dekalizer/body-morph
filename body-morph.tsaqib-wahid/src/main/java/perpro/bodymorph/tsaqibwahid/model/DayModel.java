package perpro.bodymorph.tsaqibwahid.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "day")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DayModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "date", nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

    @NotNull
    @Column(name = "body_weight", nullable = false)
    private Double bodyWeight;

    @OneToMany(mappedBy = "day", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<ConsumableModel> listConsumables;

    @OneToMany(mappedBy = "day", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<ActivityModel> listActivities;

    @ManyToOne(fetch= FetchType.EAGER)
    @JoinColumn(name = "user_uuid", nullable = true)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private UserModel user;
}
