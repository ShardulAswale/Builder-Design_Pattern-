/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderdp;

/**
 *
 * @author unrea
 */
public class PhoneBuilder {
    public Phone p = null;
    
    PhoneBuilder()
    {
        p = new Phone();
        p.setRam(1);
        p.setSs(5);
        p.setOS("Android");
    }
    
    public PhoneBuilder setOS(String os)
    {
        p.setOS(os);
        return this;
    }
    
    public PhoneBuilder setSs(float ss)
    {
        p.setSs(ss);
        return this;
    }
    
    public PhoneBuilder setRam(float ram)
    {
        p.setRam(ram);
        return this;
    }
    
    public Phone getPhone()
    {
        return p;
    }
}
