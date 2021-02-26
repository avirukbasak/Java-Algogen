/**
 * This class is used to store function that are used to detect 
 * the type of a java statement. A class returns true if that
 * kind of state is in line.
 */
class StatementType {
	// Instance variables (all static)
	public String[] datatypes;
	public OtherMethods om;

	public StatementType() {
		datatypes = new String[] {	// Note that although String is a class
			"void",										// it is inculed in this list as String 
			"boolean",								// is very popular for handling of data
			"short",
			"char",
			"int",
			"long",
			"float",
			"double",
			"String"
		};
		om = new OtherMethods();
	}

	// Methods for detection (all static)
	public boolean importDeclaration( String line ) {
		return true;
	}
	public boolean classDeclaration( String line ) {
		return true;
	}
	public boolean functionDeclaration( String line ) {
		return true;
	}
	public boolean variableDeclaration( String line ) {
		return true;
	}
	public boolean variableInitialisation( String line ) {
		return true;
	}
	// Variable declaration with initialisation
	public boolean varDecAndInit( String line ) {
		return true;
	}
	public boolean objectDeclaration( String line ) {
		return true;
	}
	public boolean objectInitialisation( String line ) {
		return true;
	}
	// Object declaration with initialisation
	public boolean objDecAndInit( String line ) {
		return true;
	}
	public boolean arrayDeclaration( String line ) {
		return true;
	}
	public boolean arrayInitialisation( String line ) {
		return true;
	}
	// Array declaration with initialisation
	public boolean arrDecAndInit( String line ) {
		return true;
	}
}