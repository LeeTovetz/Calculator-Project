package test.calculator;

import test.calculator.input.Input;
import test.calculator.input.InputFromConsole;
import test.calculator.output.Output;
import test.calculator.output.OutputToConsole;
import test.calculator.processing.ProcessingAbstract;
import test.calculator.processing.ProcessingCalculate;
import test.calculator.processor.ProcessorCalculate;
import test.calculator.processor.ProcessorInterface;

public class Init {
    public static void main(String[] args) {
        ProcessorInterface processor = new ProcessorCalculate();
        Input input = new InputFromConsole();
        Output output = new OutputToConsole();

        ProcessingAbstract processing = new ProcessingCalculate();
        processing.setIO(input, output);
        processing.setProcessor(processor);
        processing.processing();
    }
}
