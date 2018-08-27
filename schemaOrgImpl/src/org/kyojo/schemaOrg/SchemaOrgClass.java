package org.kyojo.schemaorg;

@SchemaOrgURI("http://www.w3.org/2000/01/rdf-schema#Class")
public interface SchemaOrgClass extends SchemaOrgType {

	public Long getSeq();
	public void setSeq(Long seq);
	public Long getRefSeq();
	public void setRefSeq(Long refSeq);
	public String getRefAcr();
	public void setRefAcr(String refAcr);
	public java.util.Date getCreatedAt();
	public void setCreatedAt(java.util.Date createdAt);
	public Long getCreatedBy();
	public void setCreatedBy(Long createdBy);
	public java.util.Date getUpdatedAt();
	public void setUpdatedAt(java.util.Date updatedAt);
	public Long getUpdatedBy();
	public void setUpdatedBy(Long updatedBy);
	public java.util.Date getExpiredAt();
	public void setExpiredAt(java.util.Date expiredAt);
	public Long getExpiredBy();
	public void setExpiredBy(Long expiredBy);

}
