package org.whitfie.model;

public class DoubleGlazedWindows {
    private float width;
    private float hight;
    private MaterialType materialType;
    private LayerType layerType;

    public DoubleGlazedWindows() {
    }

    public DoubleGlazedWindows(float width, float hight, MaterialType materialType, LayerType layerType) {
        this.width = width;
        this.hight = hight;
        this.materialType = materialType;
        this.layerType = layerType;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHight() {
        return hight;
    }

    public void setHight(float hight) {
        this.hight = hight;
    }

    public MaterialType getMaterialType() {
        return materialType;
    }

    public void setMaterialType(MaterialType materialType) {
        this.materialType = materialType;
    }

    public LayerType getLayerType() {
        return layerType;
    }

    public void setLayerType(LayerType layerType) {
        this.layerType = layerType;
    }
}
