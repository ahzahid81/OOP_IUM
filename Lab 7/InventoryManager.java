public class InventoryManager {
    public static void checkStock(int available, int requested) throws OutOfStockException{
        if(requested > available){
            throw new OutOfStockException("Insufficient stock available. Requested: " + requested + ", Available: " + available);
        }
    }

    public static void main(String[] args) {
        int availableStock = 10;
        int requestedQuantity = 15;

        try{
            checkStock(availableStock, requestedQuantity);
        } catch (OutOfStockException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
