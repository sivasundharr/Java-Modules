import com.impl.CasioCalculator;
import com.services.Calculator;

module casio{
    requires calculatorapi;

    provides Calculator
    with CasioCalculator;
}