package Dz1;

import Dz1.Copper;
import Dz1.Iron;
import Dz1.Steel;
import Dz1.Sword;

public class Test {
    public static void main(String[] args) {
        Sword<Steel> steelSword = new Sword<>(new Steel());
        Sword<Iron> ironSword = new Sword<>(new Iron());
        Sword<Copper> copperSword = new Sword<>(new Copper());
        if (steelSword.checkEndurance()) {
            System.out.println("материал проверен, меч готов!");
        } else {
            System.out.println("материал не прошёл проверку");
        }
    }
}