
public enum TipoElementoLabirinto {
	 Livre('.'), Percorrido(','), PercorridoCorreto('*'), Bloqueado('X') ;

	    public char asChar() {
	        return asChar;
	    }

	    private final char asChar;

	    private TipoElementoLabirinto(char asChar) {
	        this.asChar = asChar;
	    }
}
