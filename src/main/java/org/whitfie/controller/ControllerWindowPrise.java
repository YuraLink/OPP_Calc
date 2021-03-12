package org.whitfie.controller;

import org.whitfie.model.LayerType;
import org.whitfie.model.MaterialType;
import org.whitfie.model.WindowPrice;
import org.whitfie.utils.UtilsNumber;
import org.whitfie.view.ViewWindowPrice;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerWindowPrise {
    private WindowPrice modelWindowPrice;
    private ViewWindowPrice viewWindowPrice;

    public ControllerWindowPrise(WindowPrice modelWindowPrise, ViewWindowPrice viewWindowPrice) {
        this.modelWindowPrice = modelWindowPrise;
        this.viewWindowPrice = viewWindowPrice;
        initWindow();
        initListener();
    }

    private void initWindow(){
        JFrame jFrame = viewWindowPrice;
        jFrame.setTitle("Calculator");
        jFrame.setResizable(false);
        jFrame.setSize(600,200);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }

    private void initListener(){
        viewWindowPrice.getCalculateButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float width = UtilsNumber.tryGetFloat(viewWindowPrice.getWidthField().getText());
                float length = UtilsNumber.tryGetFloat(viewWindowPrice.getLengthField().getText());

                if (width == 0 ) {
                    viewWindowPrice.getWidthField().setText("0");
                }

                if (length == 0 ) {
                    viewWindowPrice.getLengthField().setText("0");
                }

                modelWindowPrice.getDoubleGlazedWindows().setWidth(width);
                modelWindowPrice.getDoubleGlazedWindows().setHight(length);
                viewWindowPrice.getResultLabel().setText(String.valueOf(modelWindowPrice.calculatePrise()));
            }});

        viewWindowPrice.getOneLayerRadioButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewWindowPrice.getDoubleLayerRadioButton().setSelected(false);
                modelWindowPrice.getDoubleGlazedWindows().setLayerType(LayerType.ONE);
            }});

        viewWindowPrice.getDoubleLayerRadioButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewWindowPrice.getOneLayerRadioButton().setSelected(false);
                modelWindowPrice.getDoubleGlazedWindows().setLayerType(LayerType.DOUBLE);
            }});

        viewWindowPrice.getWindowStillCheckBox().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modelWindowPrice.setHaveWindowsill(viewWindowPrice.getWindowStillCheckBox().isSelected());
            }});

        viewWindowPrice.getSelectMaterial().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modelWindowPrice.getDoubleGlazedWindows().setMaterialType(MaterialType.valueOf(viewWindowPrice.getSelectMaterial().getSelectedIndex()));
            }});


    }


}
