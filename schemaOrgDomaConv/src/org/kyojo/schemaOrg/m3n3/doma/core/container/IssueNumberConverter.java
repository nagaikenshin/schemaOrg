package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ISSUE_NUMBER;
import org.kyojo.schemaOrg.m3n3.core.Container.IssueNumber;

@ExternalDomain
public class IssueNumberConverter implements DomainConverter<IssueNumber, String> {

	@Override
	public String fromDomainToValue(IssueNumber domain) {
		return domain.getNativeValue();
	}

	@Override
	public IssueNumber fromValueToDomain(String value) {
		return new ISSUE_NUMBER(value);
	}

}
