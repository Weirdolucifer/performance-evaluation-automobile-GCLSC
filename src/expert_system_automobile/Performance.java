/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expert_system_automobile;

/**
 *
 * @author weirdolucifer
 */
public class Performance {
    int forwardexternal = 0;
    int forwardinternalgreen = 0;
    int forwardinternaltraditional = 0;
    int reverseexternal = 0;
    int reverseinternal = 0;
    int forwardresult = 0;
    int reverseresult = 0;
    int result = 0;
            
    public void setForwardexternal(int forwardexternal) {
        this.forwardexternal = forwardexternal;
    }

    public void setForwardinternalgreen(int forwardinternalgreen) {
        this.forwardinternalgreen = forwardinternalgreen;
    }

    public void setForwardinternaltraditional(int forwardinternaltraditional) {
        this.forwardinternaltraditional = forwardinternaltraditional;
    }

    public void setReverseexternal(int reverseexternal) {
        this.reverseexternal = reverseexternal;
    }

    public void setReverseinternal(int reverseinternal) {
        this.reverseinternal = reverseinternal;
    }

    public int getForwardexternal() {
        return forwardexternal;
    }

    public int getForwardinternalgreen() {
        return forwardinternalgreen;
    }

    public int getForwardinternaltraditional() {
        return forwardinternaltraditional;
    }

    public int getReverseexternal() {
        return reverseexternal;
    }

    public int getReverseinternal() {
        return reverseinternal;
    }
    
    public int getForwardresult() {
        return forwardresult;
    }

    public int getReverseresult() {
        return reverseresult;
    }

    public int getResult() {
        return result;
    }
    
    void CalculateForwardPerformance()
    {
        this.forwardresult = (this.forwardexternal + this.forwardinternalgreen + this.forwardinternaltraditional)/3;
    }
    
    void CalculateReversePerformance()
    {
        this.reverseresult = (this.reverseexternal + this.reverseinternal)/2;
    }
    
    void CalculatePerformance()
    {
        this.result = (this.forwardresult + this.reverseresult)/2;
    }
    
}
