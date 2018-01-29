

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "gen")

public class Gen {
	
	private String id;
	private String name;
	private String sequence;
	private String organism;
	private String startPos;
	private String endPos;
	
	@XmlElement
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	@XmlElement
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@XmlElement
	public String getSequence() {
		return sequence;
	}
	
	public void setSequence(String sequence) {
		this.sequence = sequence;
	}
	
	@XmlElement
	public String getOrganism() {
		return organism;
	}
	
	public void setOrganism(String organism) {
		this.organism = organism;
	}
	
	@XmlElement
	public String getStartPos() {
		return startPos;
	}
	
	public void setStartPos(String startPos) {
		this.startPos = startPos;
	}
	
	@XmlElement
	public String getEndPos() {
		return endPos;
	}
	
	public void setEndPos(String endPos) {
		this.endPos = endPos;
	}
	
}
