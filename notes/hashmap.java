HashMap<Person, Number> m;

// ... 

/**
 * Variante 1.
 */
public void printAll() {
	for (Person key:m.keySet()) {
		System.out.Println(key);
		System.out.Println(m.get(key));
	}
}

/**
 * Variante 2.
 */
public void printAll() {
	Set<Person> s = m.keySet();
	Iterator<Person> itr = s.iterator();
	while(itr.hasNext()) {
		Person p = itr.next();
		System.out.Println(p);
		System.out.Println(m.get(p));
	}
}