/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.pkg3;

/**
 *
 * @author wif190017
 */
public class SimpleNetwork {
    private String name, ip,sm;
    private String status;

    public SimpleNetwork(String name, String ip, String sm, String status) {
        this.name = name;
        this.ip = ip;
        this.sm = sm;
        this.status = status;
    }

    public void ping(SimpleNetwork dhost){
        if(this.status.equals("UP")&&dhost.status.equals("UP")){
            if(this.sm.equals(dhost.sm)){
                if((Integer.parseInt(this.ip.substring(7))>0&&Integer.parseInt(this.ip.substring(7))<32)&&((Integer.parseInt(dhost.ip.substring(7))>0&&Integer.parseInt(dhost.ip.substring(7))<32))){
                    System.out.println(this.name + " can ping " + dhost.name);
                }
                else{
                System.out.println(this.name + " cannot ping " + dhost.name + " because the destination " + dhost.name + " is located in different network");
                }
            }
            else{
                System.out.println(this.name + " cannot ping " + dhost.name + " because the destination " + dhost.name + " is down");
            }
        }
        else{
            System.out.println(this.name + " cannot ping " + dhost.name + " because the destination " + dhost.name + " is down");
        }
    }

    
    @Override
    public String toString() {
        return "Host Name: " + name + " IP: " + ip + " Subnet Mask: " + sm + " Status: " + status;
    }
    
    
}
