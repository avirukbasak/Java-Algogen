class OtherMethods {
	/**
	 * This method supports both +ve and -ve array traversal
	 */
	public int arrayIndexOf( String[] array, int from, int to, String element ) {
		int i;
		if ( from < to )
			for ( i = from; i < to ; i++ )
				if ( array[i].equals( element ) )
					return i;
		else
			for ( i = from; i > to ; i-- )
				if ( array[i].equals( element ) )
					return i;
		return -1;
	}
}