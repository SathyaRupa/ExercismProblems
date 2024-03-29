class RnaTranscription {

    String transcribe(String dnaStrand) {
    	StringBuilder rna = new StringBuilder();
    	int i;
    	for (i = 0; i < dnaStrand.length(); i++) {
    		if (dnaStrand.charAt(i) == 'G') {
    			rna.append('C');
    		}
    		else if (dnaStrand.charAt(i) == 'C') {
    			rna.append('G');
    		}
    		else if (dnaStrand.charAt(i) == 'T') {
    			rna.append('A');
    		}
    		else if (dnaStrand.charAt(i) == 'A') {
    			rna.append('U');
    		}
    		else {
    			throw new IllegalArgumentException("Invalid input");
    		}
    	}
    	return rna.toString();
    }
}