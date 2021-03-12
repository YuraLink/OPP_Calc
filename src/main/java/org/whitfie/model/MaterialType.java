package org.whitfie.model;

public enum MaterialType {
    WOOD,
    IRON,
    METAL_PLASTIC,
    NOSELECTED;

    public static MaterialType valueOf(int value) {
        switch (value) {
            case 0: return WOOD;
            case 1: return IRON;
            case 2: return METAL_PLASTIC;
        }
        return NOSELECTED;
    }
}
