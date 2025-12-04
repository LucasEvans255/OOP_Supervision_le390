package SV3.src.Q3P12022;

public class OptionallyImmutableAssetLocation {
  private String description;
  private int identifier;
  private double phi;
  private double theta;
  private boolean immutable;
  public OptionallyImmutableAssetLocation(String description, int identifier, double phi, double theta, boolean immutable) {
    this.description = description;
    this.identifier = identifier;
    this.phi = phi;
    this.theta = theta;
    this.immutable = immutable;
  }

  public void setDescription(String description) throws NoSuchMethodException {
    if (immutable) {throw new NoSuchMethodException();}
    this.description = description;
  }

  public void setIdentifier(int identifier) throws NoSuchMethodException {
     if (immutable) {throw new NoSuchMethodException();}
     this.identifier = identifier;
  }

  public void setPhi(double phi) throws NoSuchMethodException {
    if (immutable) {throw new NoSuchMethodException();}
    this.phi = phi;
  }

  public void setTheta(double theta) throws NoSuchMethodException {
    if (immutable) {throw new NoSuchMethodException();}
    this.theta = theta;
  }
}
