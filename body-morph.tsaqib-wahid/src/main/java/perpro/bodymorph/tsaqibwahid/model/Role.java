package perpro.bodymorph.tsaqibwahid.model;

import lombok.Getter;

@Getter
public enum Role {
    ADMIN("Admin"),
    USER("User");

    private final String roleName;

    Role(String roleName) { this.roleName = roleName; }
}
