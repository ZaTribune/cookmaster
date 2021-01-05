package zatribune.spring.cookmaster.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
@Setter
@Getter
@NoArgsConstructor
public class IngredientCommand {
    Long id;
    String description;
    BigDecimal amount;
    UnitMeasureCommand unitMeasure;
}
