package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PUBLICATION_ISSUE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.PublicationIssue;

@ExternalDomain
public class PublicationIssueConverter implements DomainConverter<PublicationIssue, String> {

	@Override
	public String fromDomainToValue(PublicationIssue domain) {
		return domain.getNativeValue();
	}

	@Override
	public PublicationIssue fromValueToDomain(String value) {
		return new PUBLICATION_ISSUE(value);
	}

}
