package Factory;

import Models.Account;
import Models.CreditCard;
import Models.DebitCard;

public class Factory {
    
    public Tarjeta obtenerTarjeta(EnumTarjeta tipoTarjeta){
        if (tipoTarjeta == EnumTarjeta.tarjetaCredito){
            return (Tarjeta) new CreditCard(2000,5000,50,"456789");
        }
        if (tipoTarjeta == EnumTarjeta.tarjetaDebito){
            return (Tarjeta) new DebitCard(null,"456789");
        }else{
            return null;
        }
    }
}
