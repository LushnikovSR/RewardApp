package Fabric;

import Interface.IGameItem;
import Product.Emerald;

import javax.security.auth.login.CredentialException;

public class EmeraldGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new Emerald();
    }
}
