package se.Lexicon.model;

import java.util.Arrays;

public class VendingMachineImpl implements VendingMachine{
    private Product[] products;
    private int depositPool;

    private int[] acceptValues = {1,2,5,10,20,50,100,200,500,1000};

    public VendingMachineImpl(Product[] products) {
        this.products = products;
    }

    @Override
    public void addCurrency(int amount) {
        for (int i =0; i<acceptValues.length;i++){
                if (acceptValues[i] == amount) {
                    depositPool += amount;
                    break;
                }else
                    System.out.println("the value is not accepted.");
        }

    }

    @Override
    public int getBalance() {
        return depositPool;
    }

    @Override
    public Product request(int id) {
        Product product= null;
        for (int i =0; i<products.length;i++){
            if (products[i].getId()==id)
                if (product.getPrice() <= depositPool)
                    product=products[i];
        }
        return product;
    }

    @Override
    public int endSession() {
        int depositPoolCopy = depositPool;
        depositPool=0;
        return depositPoolCopy;
    }

    @Override
    public String getDescription(int id) {
        String description = "";
        for (int i =0; i<products.length;i++){
            if(products[i].getId()==id){
                description += "Product id: " + products[i].getId()
                        + " " + products[i].examine() + products[i].use() + "\n";
            }
        }
        return description;
    }

    @Override
    public String[] getProducts() {
        String[] descriptionArray =new String[0];

        String description = "";
        for (int i =0; i<products.length;i++){
            description += "Product id: " + products[i].getId()
                    + ", Name: " + products[i].getProductName() +", Price"+ products[i].getPrice() + "\n";

            descriptionArray= Arrays.copyOf(descriptionArray,descriptionArray.length +1);
            descriptionArray[descriptionArray.length-1]  = description;
        }
        return descriptionArray;
    }
}
