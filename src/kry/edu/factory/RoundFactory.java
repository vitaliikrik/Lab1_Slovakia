package kry.edu.factory;

import kry.edu.factory.implementations.RoundImpl;

/*
  @author   Vitalii Krykun
  @project   LabsSlovakia
  @class  RoundFactory
  @version  1.0.0 
  @since 3/26/2021 - 18.17
*/
public class RoundFactory {
    public static RoundImpl create(double radius) {
        if (radius <= 0) {
            return null;
        }
        return new RoundImpl(radius);
    }
}
