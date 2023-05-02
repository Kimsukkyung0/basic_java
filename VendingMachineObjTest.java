package com.green.java.VendingMachine;

public class VendingMachineObjTest {

    public static void main(String[] args) {
        VendingMachineObj vm = new VendingMachineObj();

        vm.insert(10_000);
        vm.showMoney();
        vm.showMenues();
//        vm.getList();
        vm.purchaseDrink(1);
        vm.purchaseDrink(2);
        vm.PrintPurchase();
    }

}
