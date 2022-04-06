package collection;

public class Alien implements Comparable<Alien>{

	int aid;
	String aname;
	String tech;
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", tech=" + tech + "]";
	}
	@Override
	public int compareTo(Alien o) {
		// TODO Auto-generated method stub
		//return this.aname.compareTo(o.aname); for aname sorting
		return (o.aid > aid) ? -1 : ((o.aid == aid) ? 0 : 1);
	}
	
	
}
