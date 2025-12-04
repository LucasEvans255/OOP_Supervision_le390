package SV3.src.Q3P12022;

public class AssetLocation {
  private String description;
  private int identifier;
  double phi;
  double theta;

  public AssetLocation(String description, int identifier, double phi, double theta) {
    this.description = description;
    this.identifier = identifier;
    this.phi = phi;
    this.theta = theta;
  }
}
