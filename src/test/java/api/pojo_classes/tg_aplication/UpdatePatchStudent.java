package api.pojo_classes.tg_aplication;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class UpdatePatchStudent {

    private String email;
    private String dob;

}
