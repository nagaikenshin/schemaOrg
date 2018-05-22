package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SPONSOR;
import org.kyojo.schemaOrg.m3n3.core.Container.Sponsor;

@ExternalDomain
public class SponsorConverter implements DomainConverter<Sponsor, String> {

	@Override
	public String fromDomainToValue(Sponsor domain) {
		return domain.getNativeValue();
	}

	@Override
	public Sponsor fromValueToDomain(String value) {
		return new SPONSOR(value);
	}

}
