import java.util.ArrayList;

public class Datastore {

    //instance checks if a Datastore object has already been created
    public static Datastore instance;


    //random data stuff
    private String name;
    private ArrayList<Item> items = new ArrayList<Item>();

    //constructor is private
    private Datastore(String name){
        this.name=name;
    }

    //have to use this to create an instance, null check ensures singularity
    public static Datastore getInstance(String name){
        if(instance==null){
            instance = new Datastore(name);
        }
        return instance;
    }

    //simple code to add something
    public  void addItem(Item item){
        items.add(item);
    }

    //view all
    public void viewItems(){
        if(items.size()==0){
            System.out.println("no items ");
        }else{
            for (Item item: items){
                System.out.println("Item Name   : "+item.getProductName()+"\n"+
                        "Item Price  : "+item.getPrice()+"\n"+
                        "Item cond.    : "+item.getCondition());
            }
        }
    }

    //delete something
    public void deleteItem(String name){
        if(items.size()==0){
            System.out.println("Invalid Choice");
            return;
        }else {
            Item del = null;
            for(Item item: items){
                if(item.getProductName().equals(name)){
                    del = item;
                }

            }
            items.remove(del);
        }
    }


}
