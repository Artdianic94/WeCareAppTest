package models.apimodels;


import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.extern.jackson.Jacksonized;

@Data
@EqualsAndHashCode
@ToString
@Jacksonized
public class Phones {
    private int id;
    private String number;
}
