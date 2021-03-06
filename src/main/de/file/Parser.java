package de.file;

import de.complex.Cartesian;
import de.complex.Complex;
import org.jetbrains.annotations.NotNull;

/**
 * @author Roman Schmidt, Stanislaw Brug
 * <p>
 * Just a Domain Cass for parseRowToComplex function
 */
public abstract class Parser {
    @NotNull
    public static Complex parseRowToComplex(@NotNull String row) {
        String[] match = row.split(" ");
        double x = Double.parseDouble(match[0]);
        double y = Double.parseDouble(match[1] + match[2].replace('i', ' '));
        return new Complex(new Cartesian(x, y));
    }
}
