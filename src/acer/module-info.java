import com.services.Calculator;
import com.im.AcerImpl;

module acer{
    requires calculatorapi;

    provides Calculator with AcerImpl;
}