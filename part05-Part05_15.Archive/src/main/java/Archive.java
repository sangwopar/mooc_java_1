public class Archive {
	private String identifier;
	private String name;

	public Archive(String id, String name) {
		this.identifier = id;
		this.name = name;
	}

	public boolean equals(Object compare) {
		if (this == compare) {
			return true;
		}
		if (!(compare instanceof Archive )) {
			return false;
		}

		Archive compareArchive = (Archive) compare;
		if (this.identifier.equals(compareArchive.identifier)) {
				return true;
			}

		return false;
	}

	public String toString() {
		return this.identifier + ": " + this.name;
	}
	
}
