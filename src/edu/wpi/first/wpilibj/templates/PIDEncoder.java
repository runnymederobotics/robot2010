package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.*;

//PIDEncoder inherits PIDSource
public class PIDEncoder implements PIDSource {
    Encoder encoder;

    public PIDEncoder(int aChannel, int bChannel, boolean reverseDirection, Encoder.EncodingType encodingType) {
        encoder = new Encoder(aChannel, bChannel, reverseDirection, encodingType);
    }

    //Overloaded constructor where encodingType has a default value of k1X
    public PIDEncoder(int aChannel, int bChannel, boolean reverseDirection) {
        encoder = new Encoder(aChannel, bChannel, reverseDirection, Encoder.EncodingType.k1X);
    }

    //Overloaded constructor where reverseDirection has a default value of false and encodingType has a default value of k1X
    public PIDEncoder(int aChannel, int bChannel) {
        encoder = new Encoder(aChannel, bChannel, false, Encoder.EncodingType.k1X);
    }

    //Function must be overrided, and the return value is the rate of the encoder
    public double pidGet() {
        return encoder.getRate();
    }
}
