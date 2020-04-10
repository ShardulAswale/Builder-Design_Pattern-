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
public class Client {
     public Phone createPhone(String os, float r, float ss)
    {
        Phone p = new Phone();
        p.setOS(os);
        p.setRam(r);
        p.setSs(ss);
        return p;
    }
}
