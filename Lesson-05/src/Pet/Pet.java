package Pet;

public abstract class Pet {
	
	public Pet() {
	
	}
	
	abstract void voice();

	@Override
	public String toString() {
		return "Pet []";
	}
	
}