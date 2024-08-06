import OtherClasses.*;

public class Main {
    public static void main(String[] args) {

        VendingMachine vendingMachine = new VendingMachine();
        try{
            System.out.println("WELCOME TO OUR VENDING MACHINE");
            System.out.println("LETS FILL UP THE VENDING MACHINE");

            fillUpTheInventory(vendingMachine);
            displayTheInventory(vendingMachine);

            System.out.println("INVENTORY FILLED");


            // adding some money in vending machine because we also have to give change :
            vendingMachine.getCoinList().add(Coin.QUARTER);
            vendingMachine.getCoinList().add(Coin.PENNY);
            vendingMachine.getCoinList().add(Coin.NICKEL);
            vendingMachine.getCoinList().add(Coin.DIME);

            // idle state was declared in constructor of VendingMachine,
            // and inside the constructor of IdleState we change the state of VendingMachine to HasMoney State
            vendingMachine.getVendingMachineState().clickOnInsertCoinButton(vendingMachine);

            // now the user will insert coins ,
            // and inside clickOnStartProductSelectionButton the State changes to SelectionState
            vendingMachine.getVendingMachineState().insertCoin(vendingMachine,Coin.QUARTER);
            vendingMachine.getVendingMachineState().clickOnStartProductSelectionButton(vendingMachine);

            vendingMachine.getVendingMachineState().chooseProduct(vendingMachine, 101);
            displayTheInventory(vendingMachine);

        }

        catch (Exception e){
            displayTheInventory(vendingMachine);
        }

    }

    private static void fillUpTheInventory(VendingMachine vendingMachine) {
        ItemShelf[] slots = vendingMachine.getInventory().getInventory();
        for (int i = 0; i < slots.length; i++) {
            Item newItem = new Item();
            if(i >=0 && i<3) {
                newItem.setType(ItemType.RED_BULL);
                newItem.setPrice(12);
            }else if(i >=3 && i<5){
                newItem.setType(ItemType.JAMESON);
                newItem.setPrice(9);
            }else if(i >=5 && i<7){
                newItem.setType(ItemType.JAGER);
                newItem.setPrice(13);
            }else if(i >=7 && i<10){
                newItem.setType(ItemType.SODA);
                newItem.setPrice(7);
            }
            slots[i].setItem(newItem);
            slots[i].setSoldOut(false);
        }

    }

    private static void displayTheInventory(VendingMachine vendingMachine) {
        ItemShelf[] slots = vendingMachine.getInventory().getInventory();
        for(int i = 0; i < slots.length; i++){
            System.out.println("CodeNumber: " + slots[i].getCode() +
                    " Item: " + slots[i].getItem().getType().name() +
                    " Price: " + slots[i].getItem().getPrice() +
                    " isAvailable: " + !slots[i].isSoldOut());
        }
    }
}