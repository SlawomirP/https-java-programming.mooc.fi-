/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author slawo
 */
public class Timer {

    private ClockHand hundredSec;
    private ClockHand oneSec;

    public Timer() {
        this.hundredSec = new ClockHand(100);
        this.oneSec = new ClockHand(60);
    }

    public String toString() {
        return this.oneSec + ":" + this.hundredSec;
    }

    public void advance() {
        this.hundredSec.advance();
        if (hundredSec.value() == 0) {
            oneSec.advance();
        }
    }
}
