package SV2.src.q5;

interface NinjaMethods {
  // Insert ninja methods here
}

class Employee {}

// [James] You also need the Ninja class, and crucially this should also implement NinjaMethods
// and you also need some methods...
// The key point is then that NinjaEmployee has a Ninja field to which the NinjaMethods calls are delegated

public class NinjaEmployee extends Employee implements NinjaMethods {}
