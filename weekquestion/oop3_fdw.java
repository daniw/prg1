	...
	switch(temp) {
		case 1: 
			// Anweisung bei temp == 1
			break;
		case 2:
			// Anweisung bei temp == 2
			// Weil hier kein break steht, wird auch der Fall temp == 3 abgearbeitet. 
		case 3:
			// Anweisung bei temp == 3
			// Wird auch bei temp == 2 durchlaufen
			break;
		case 4:
		csae 5:
		csae 6:
			// Anweisung bei (temp == 4) || (temp == 5) || (temp == 6)
			break;
		default: 
			// Anweisung wenn keiner der obigen Fälle zutrifft. 
			break; //gehört zum guten Stil
	}
	...