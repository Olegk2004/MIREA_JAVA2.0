package Lab22;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RPNCalculatorController {
    private RPNCalculatorModel model;
    private RPNCalculatorView view;

    RPNCalculatorController(RPNCalculatorModel model, RPNCalculatorView view){
        this.model = model;
        this.view = view;

        view.addBasicButtonListener(new BasicButtonListener());
        view.addClearButtonListener(new ClearButtonListener());
        view.addBackspaceButtonListener(new BackspaceButtonListener());
        view.addSpaceButtonListener(new SpaceButtonListener());
        view.addEqualButtonListener(new EqualButtonListener());
    }

    class BasicButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            String but = button.getText();
            model.addToExpression(but);
            view.setTextField(model.getExpression());
        }
    }

    class ClearButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            model.clearExpression();
            view.setTextField(model.getExpression());
        }
    }

    class SpaceButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            model.addToExpression(" ");
            view.setTextField(model.getExpression());
        }
    }

    class BackspaceButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            model.backspaceExpression();
            view.setTextField(model.getExpression());
        }
    }

    class EqualButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            try {
                model.calculate();
                view.setTextField(model.getExpression());
            }catch (IllegalArgumentException e1){
                System.out.println("Error: "+e1.getMessage());
            }catch (ArithmeticException e2){
                System.out.println("Error: "+e2.getMessage());
            }

        }
    }
    public static void main(String[] args) {
        RPNCalculatorModel model = new RPNCalculatorModel();
        RPNCalculatorView view = new RPNCalculatorView();
        RPNCalculatorController controller = new RPNCalculatorController(model, view);
    }

}
