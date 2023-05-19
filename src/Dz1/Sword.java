package Dz1;

import Dz1.Metal;

class Sword<M extends Metal> {
    private M material;

    Sword(M material) {
        this.material = material;
    }

    boolean checkEndurance() {
        return material.getEndurance() > 49;
    }
}