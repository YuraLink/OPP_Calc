package org.whitfie.model;

public class WindowPrice {
    private DoubleGlazedWindows doubleGlazedWindows = null;
    private boolean haveWindowsill = false;

    public WindowPrice() {
    }

    public WindowPrice(DoubleGlazedWindows doubleGlazedWindows, boolean haveWindowsill) {
        this.doubleGlazedWindows = doubleGlazedWindows;
        this.haveWindowsill = haveWindowsill;
    }

    public DoubleGlazedWindows getDoubleGlazedWindows() {
        return doubleGlazedWindows;
    }

    public void setHaveWindowsill(boolean haveWindowsill) {
        this.haveWindowsill = haveWindowsill;
    }

    public float calculatePrise() {
        float price = 0;
        float sum = 0;

        if (doubleGlazedWindows.getMaterialType() != null && doubleGlazedWindows.getLayerType() != null) {

            if (doubleGlazedWindows.getMaterialType().equals(MaterialType.IRON)) {
                price = 0.05F;
            } else if (doubleGlazedWindows.getMaterialType().equals(MaterialType.WOOD)) {
                price = 0.25F;
            } else if (doubleGlazedWindows.getMaterialType().equals(MaterialType.METAL_PLASTIC)) {
                price = 0.15F;
            }

            if (doubleGlazedWindows.getLayerType().equals(LayerType.DOUBLE)) {
                price += 0.5;
            }
        }

        float sguare = doubleGlazedWindows.getHight() * doubleGlazedWindows.getWidth();

        sum += sguare * price;

        return sum += haveWindowsill? 35 : 0;
    }
}
