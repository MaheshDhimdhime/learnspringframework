package introductiontoopps;

public abstract class AbstractRecipe {
	
	public void execute() {
		getready();
		doThedish();
		cleanUp();
	}
	 abstract void cleanUp();

	 abstract void doThedish();

	 abstract void getready();
}
