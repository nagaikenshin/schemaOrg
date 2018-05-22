package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CONTRIBUTOR;
import org.kyojo.schemaOrg.m3n3.core.Container.Contributor;

@ExternalDomain
public class ContributorConverter implements DomainConverter<Contributor, String> {

	@Override
	public String fromDomainToValue(Contributor domain) {
		return domain.getNativeValue();
	}

	@Override
	public Contributor fromValueToDomain(String value) {
		return new CONTRIBUTOR(value);
	}

}
