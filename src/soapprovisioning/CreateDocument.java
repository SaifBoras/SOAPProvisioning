/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package soapprovisioning;

import iap.soapprovisioning.CreateEquipment;
import iap.soapprovisioning.CreateUser;
import iap.soapprovisioning.CreateMoAttributes;
import iap.soapprovisioning.CreateSubscriber;
import iap.soapprovisioning.MoType;
import iap.soapprovisioning.MOId;
import java.math.BigInteger;
import javax.xml.ws.Holder;

/**
 *
 * @author Igor Korsun
 */
public class CreateDocument {
    public MoType iapMoType;
    public Holder<MOId> iapMoId;
    public CreateMoAttributes iapMoAttributes;
    public Holder<String> sessionId;
    public Holder<BigInteger> sequenceId;
    public IapSessionCred iapSessionCred;

public void setIapSubscriberMoAttributes(CreateSubscriber iapCreateSubscriber){
   this.iapMoAttributes = new CreateMoAttributes();
   this.iapMoAttributes.setCreateSubscriber(iapCreateSubscriber);

}

public void setUserMoAttributes(CreateUser iapCreateUser){
   this.iapMoAttributes = new CreateMoAttributes();
   this.iapMoAttributes.setCreateUser(iapCreateUser);

}

public void setEquipmentMoAttributes(CreateEquipment iapCreateEquipment){
    this.iapMoAttributes = new CreateMoAttributes();
    this.iapMoAttributes.setCreateEquipment(iapCreateEquipment);
}

public void setIapSubscriberMoId(String iapSubscriber){
    this.iapMoId = new Holder<MOId>();
    this.iapMoId.value = new MOId();
    this.iapMoId.value.setSubscriberId(iapSubscriber);

}

public void setIapUserMoId(String iapUser){
    this.iapMoId = new Holder<MOId>();
    this.iapMoId.value = new MOId();
    this.iapMoId.value.setUserId(iapUser);

}

public void setIapEquipmentMoId(String iapEquipment){
    this.iapMoId = new Holder<MOId>();
    this.iapMoId.value = new MOId();
    this.iapMoId.value.setEquipmentId(iapEquipment);
}


}
