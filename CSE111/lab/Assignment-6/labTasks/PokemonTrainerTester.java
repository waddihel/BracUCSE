public class PokemonTrainerTester {
  public static void main(String[] args) {
    Pokemon pikachu = new Pokemon("Pikachu", 65.0);
    Pokemon caterpie = new Pokemon("Caterpie", 45.0);
    Pokemon squirtle = new Pokemon("Squirtle", 70.0);
    Pokemon eevee = new Pokemon("Eevee", 60.0);
    System.out.println("1---------------------");
    Trainer ash = new Trainer("Ash");
    System.out.println("2---------------------");
    ash.catchPokemon(pikachu);
    System.out.println("3---------------------");
    ash.catchPokemon(caterpie);
    ash.catchPokemon(squirtle);
    System.out.println("4---------------------");
    ash.viewPokeDex();
    System.out.println("5---------------------");
    Trainer gary = new Trainer("Gary");
    System.out.println("6---------------------");
    gary.catchPokemon(squirtle);
    gary.catchPokemon(eevee);
    System.out.println("7---------------------");
    gary.viewPokeDex();
    System.out.println("8---------------------");
    Trainer.battle(ash, gary);
  }
}

