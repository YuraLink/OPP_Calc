package org.whitfie;


import org.whitfie.controller.ControllerWindowPrise;
import org.whitfie.model.DoubleGlazedWindows;
import org.whitfie.model.MaterialType;
import org.whitfie.model.WindowPrice;
import org.whitfie.view.ViewWindowPrice;

public class Starter {

    public static void main(String[] args) {
        ViewWindowPrice windowPrice = new ViewWindowPrice();
        WindowPrice windowPrise = new WindowPrice(new DoubleGlazedWindows(0, 0, MaterialType.WOOD, null), false);
        ControllerWindowPrise controllerWindowPrise = new ControllerWindowPrise(windowPrise, windowPrice);
    }

}
