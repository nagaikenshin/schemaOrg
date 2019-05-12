package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.CONTRIBUTOR;
import org.kyojo.schemaorg.m3n5.core.Container.Contributor;

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
