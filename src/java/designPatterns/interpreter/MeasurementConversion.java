package interpreter;

import javax.swing.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MeasurementConversion {

    public static void main(String[] args) {

        JFrame jFrame = new JFrame();
        String questionAsked = JOptionPane.showInputDialog(jFrame, "What is your question?");
        ConversionContext conversionContext = new ConversionContext(questionAsked);

        String fromConversion = conversionContext.getFromConversion();
        String toConversion = conversionContext.getToConversion();
        double quantity = conversionContext.getQuantity();

        try {
            Class clazz = Class.forName("interpreter."+fromConversion);
            Constructor constructor = clazz.getConstructor();
            Object convertFrom = (Expression) constructor.newInstance();
            Class[] methodParams = new Class[]{Double.TYPE};
            Method convertTo = convertFrom.getClass().getMethod(toConversion, methodParams);
            Object[] params = new Object[]{quantity};
            String toQuantity = (String) convertTo.invoke(convertFrom, params);
            String answer = conversionContext.getConversionResponse() + toQuantity + " " + toConversion;
            JOptionPane.showMessageDialog(null, answer);
            jFrame.dispose();

        } catch (ClassNotFoundException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
