package org.docmanager.dao.model.layer;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.docmanager.dao.model.document.Document;

@Entity
@Table(name="Layer")
public class Layer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="NAME", nullable=false)
	private String name;
	
	@OneToMany(mappedBy="layer")
	private Set<Document> documents;
	
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Document> getDocuments() {
		return documents;
	}
	public void setDocuments(Set<Document> documents) {
		this.documents = documents;
	}
	
	
}
