package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PEOPLE_AUDIENCE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.PeopleAudience;

@ExternalDomain
public class PeopleAudienceConverter implements DomainConverter<PeopleAudience, String> {

	@Override
	public String fromDomainToValue(PeopleAudience domain) {
		return domain.getNativeValue();
	}

	@Override
	public PeopleAudience fromValueToDomain(String value) {
		return new PEOPLE_AUDIENCE(value);
	}

}
