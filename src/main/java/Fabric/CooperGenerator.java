package Fabric;

import Interface.IGameItem;
import Product.Cooper;

public class CooperGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new Cooper();
    }
}
