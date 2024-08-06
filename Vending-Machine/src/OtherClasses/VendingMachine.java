package OtherClasses;

import VendingStates.States;
import VendingStates.impl.IdleState;

import java.util.*;

public class VendingMachine {
    //     used to maintain / monitor / change the states of machines

    private States vendingMachineState;
    private Inventory inventory;
    private List<Coin> coinList;

    public VendingMachine(){
        vendingMachineState = new IdleState();
        inventory = new Inventory(10);
        coinList = new ArrayList<>();
    }

    public States getVendingMachineState() {
        return vendingMachineState;
    }

    public void setVendingMachineState(States vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public List<Coin> getCoinList() {
        return coinList;
    }

    public void setCoinList(List<Coin> coinList) {
        this.coinList = coinList;
    }


}
