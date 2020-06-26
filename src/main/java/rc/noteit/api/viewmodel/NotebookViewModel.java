package rc.noteit.api.viewmodel;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
@Getter
@Setter
public class NotebookViewModel {
    private String id;

    @NotNull
    private String name;

    private int nbNotes;
}