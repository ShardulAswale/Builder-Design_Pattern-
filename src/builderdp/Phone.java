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
public class Phone {
      String os;
    float ram;
    float ss;
    
    public void setOS(String os)
    {
        this.os = os;
    }
    
    public void setRam(float ram)
    {
        this.ram = ram;
    }
    
    public void setSs(float ss)
    {
        this.ss = ss;
    }
    
    public void displayInfo()
    {
        System.out.println(this.os + ", " + this.ram + ", " + this.ss);
    }
}
