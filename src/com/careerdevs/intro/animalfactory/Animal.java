package com.careerdevs.intro.animalfactory;

public class Animal {
   //Fields: species (String), legs (short), livesOnLand (boolean)
   public String species;
   public short legs;
   public boolean liveOnLand;

   public Animal (String species, short legs, boolean liveOnLand) {
      this.species = species;
      this.legs = legs;
      this.liveOnLand =liveOnLand;

   }
// used "to"  for to string.
   @Override
   public String toString() {
      return "Animal{" +
              "species='" + species + '\'' +
              ", legs=" + legs +
              ", liveOnLand=" + liveOnLand +
              '}';
   }
}
