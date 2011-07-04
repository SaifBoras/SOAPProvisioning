/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package soapprovisioning;

import java.math.BigInteger;
import javax.xml.ws.Holder;

/**
 *
 * @author Igor Korsun
 */
public class IapSessionCred {
    public Holder<String> sessionId;
    public Holder<BigInteger> sequenceId;

public String getSessionId(){
    return sessionId.value;
}

public BigInteger getSequenceId(){
    return sequenceId.value;
}

public void GetNextSequenceId(){
    this.sequenceId.value = this.sequenceId.value.add(BigInteger.ONE);

}
}