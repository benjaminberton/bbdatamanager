package org.docmanager.dao.model.document;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class DocumentVersion {

		
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	private Document document;

	
	@Column(name="VERSION")
	private String version;
	
	@ManyToMany
	private Set<DocumentVersion> parents;
	
	
	public Document getDocument() {
		return document;
	}
	public void setDocument(Document document) {
		this.document = document;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public Set<DocumentVersion> getParents() {
		return parents;
	}
	public void setParents(Set<DocumentVersion> parents) {
		this.parents = parents;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
