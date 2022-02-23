package test.calculator.processing;

import test.calculator.input.Input;
import test.calculator.output.Output;
import test.calculator.processor.ProcessorInterface;

import java.util.List;

public interface ProcessingInterface {

    void setIO(Input input, Output output);

    void setProcessor(ProcessorInterface processor);

    boolean validation(List<String> list);

    List<String> preparing(String line) throws Exception;

    void processing();
}
