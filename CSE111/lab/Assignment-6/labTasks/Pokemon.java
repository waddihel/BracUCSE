
public class Pokemon {
  private String name;
  private double hp;
  public Pokemon(String n, double hp) {
    this.name = n;
    this.hp = hp;
  }
  public String getName() {
    return name;
  }
  public double getHP() {
    return hp;
  }
}

class Trainer{
	public static int tCount;

	public String name;
	public int id;
	public Pokemon[] pkm = new Pokemon[7];
	public int pCount;
	public double totalPHP;
	public double avgPHP;

	Trainer(String n){
		name = n;
		id = ++tCount;
		System.out.println("Trainer ID: "+id+", Name: - "+name+" created");
	}

	public void catchPokemon(Pokemon p){
		pkm[pCount++] = p;
		System.out.println(name+" caught: "+p.getName());
		totalPHP+=p.getHP();
		avgPHP = totalPHP/pCount;
	}

	public void viewPokeDex(){
		System.out.println(name+"'s Trainer code: T"+id);

		for(int i = 0;i<pCount;i++){
			System.out.println(pkm[i].getName()+": "+pkm[i].getHP()+" points");
		}
		System.out.println("Average of HP: "+avgPHP);
	}

	public static void battle(Trainer a, Trainer b){
		System.out.println("Battle Info");
		System.out.println(a.name+"'s HP average: "+a.avgPHP);
		System.out.println(b.name+"'s HP average: "+b.avgPHP);
		System.out.println(((a.avgPHP>b.avgPHP)?a.name:b.name)+" wins");
	}
}
